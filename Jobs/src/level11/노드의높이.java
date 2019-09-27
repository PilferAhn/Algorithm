package level11;

import java.util.Scanner;

public class 노드의높이 {
	static boolean[] check = new boolean[100];
	static int max = 0;
	static int answer = 0;
	public static void dfs(int[][] temp, int node,  int depth ,int numNode) {
		
		answer = Math.max(max, depth);
		
		if(check[node] == false) {
			check[node] = true;	
			for(int i = 0 ; i < numNode; i++) {	
				
				if(temp[node][i] != 0 && check[i] == false) {
//					System.out.println(node + " " + i);
					dfs(temp, i, depth + 1, numNode);	
					
				}
			}
		}
		
	}
	
	
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] temp = new int[100][100];
//		
		
		int n , start;
		n = 8;
		start = 0;
		Scanner sc = new Scanner(System.in);
//		int length = node.length;
//		int width = node[0].length;
		
		for(int i = 0 ; i < n; i++) {
//			for(int j = 0; j < width; j++) {
			int x ,y;
				x = sc.nextInt();
				y = sc.nextInt();
				temp[y][x] = temp[x][y] = 1;
//			}
		}
		
		dfs(temp, start , 0, n);
		System.out.print(answer);
	}

}
