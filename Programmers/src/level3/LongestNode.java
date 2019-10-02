package level3;
//import java.util.*;
public class LongestNode {
	static boolean[] check = new boolean[100];
//	static Queue<Integer> q = new LinkedList<Integer>();
	static int answer = 0;
	public static void dfs(int[][] tree, int node, int depth) {
		
		answer = Math.max(depth, answer);
		System.out.print(depth + " ");
		for(int i = 1 ; i < 7; i++) {
			if(check[i] == false) {
				check[i] = true;
				
				if(tree[node][i] == 1 && check[node] == true) {
					
					dfs(tree, i, depth + 1);
					depth--;
					check[i] = false;
				}
				
				
				
				
			}
		}
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//[[3, 6], [4, 3], [3, 2], [1, 3], [1, 2], [2, 4], [5, 2]]
		 
		int[][] tree = new int[20000][20000];
		int[][] node = {{3,6}, {4,3}, {3,2}, {1,3}, {1,2}, {2,4}, {5,2}};

		for(int i = 0; i < 7; i++) {
			int x = node[i][1];
			int y = node[i][0];
			
			tree[x][y] = tree[y][x] = 1;
//			System.out.println(tree[x][y]);
		}
		
	
		check[1] = true;
		
		dfs(tree, 1, 0);
		
		
		System.out.print(answer);
		
		
	}

}
