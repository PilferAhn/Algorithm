package level11_DFS_BFS;

import java.util.Scanner;

public class 트리에서의거리 {
	static int answer = 0;
	static boolean[] check = new boolean[1001];
	static int numNode = 11;
	static int start = 3;
	static int end = 6;
	static int depth = 0;
	public static void dfs(int[][] node, int current, int end, int depth) {
		
		if(current == end) {
			answer = depth;
			return ;
		}
		
		if(check[current] == false) {
			
			check[current] = true;
			
			for(int i = 0; i < numNode; i++) {
				
				if(node[current][i] == 1 && check[i] == false) {
//					System.out.println(current + " " + i);
					dfs(node, i, end, depth+1);
				}
				
			}
			
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		Scanner sc = new Scanner(System.in);
		
		int[][] node = new int[1000][1001];
		
		for(int i = 0 ; i < 10; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			
			node[x][y] = node[y][x] = 1;
		}
		dfs(node, start, end, 0);
		System.out.print(answer);
	}

}

//0 1
//0 2
//1 3
//1 4
//1 5
//2 6
//2 10
//6 7
//6 8
//6 9
//
//
