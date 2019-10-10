package level3;
import java.util.*;
public class LongestNode {
	
	static boolean[] check;
	static int[] parent;
	static int answer = 0;
	static int[] tempNode;
	public static void dfs(int[][] tree, int node, int len, int previous, int depth) {
		
		answer = Math.max(answer, depth);
		
		for(int i = 1; i < len; i++) {
			
			if(check[i] == false) {
				check[i] = true;
				if(tree[node][i] == 1 && parent[previous] != 0) {
					
					parent[node] = 1;
					tempNode[node] = depth;
					dfs(tree, i, len, node, depth+1);
					depth--;
					parent[node] = 0;
					check[i] = false;
					
					
				}
			}
			
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//[[3, 6], [4, 3], [3, 2], [1, 3], [1, 2], [2, 4], [5, 2]]
		 
		int[][] edges = {{3,6}, {4,3}, {3,2}, {1,3}, {1,2}, {2,4}, {5,2}};
		
		int n = 6;
		
		check = new boolean[n+1];
		parent = new int[n+1];
		tempNode = new int[n+1];
		int[][] tree = new int[20000][20000];
		for(int i = 0; i < edges.length; i++) {
			
			int x = edges[i][0];
			int y = edges[i][1];
			
			tree[i][0] = tree[0][i] = 1;
			tree[i][1] = tree[1][i] = 1;
		}
		
		check[1] = true; 
//		System.out.print(parent[1]);
		
		for(int deep : tempNode) {
			System.out.print(deep + " ");
		}
		
		
	}

}
