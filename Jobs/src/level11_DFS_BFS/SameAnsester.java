package level11_DFS_BFS;

import java.util.Scanner;

//import java.util.Scanner;

public class SameAnsester {
	static boolean[] check = new boolean[1001];
	static int[] height = new int[1001];
	static int[] parents = new int[1001];
	static int[][] tree = new int[1001][1001];
	public static void dfs(int[][] tree, int node, int depth) {
		
		if(check[node] == false) {
			check[node] = true;
			
			//?…¸?“œ?˜ ?†’?´ ???¥. 
			height[node] =depth;
			
			for(int i = 0; i < 11; i++) {
				if(tree[node][i] == 1 && check[i] == false) {
					parents[i] = node;
					dfs(tree, i, depth + 1);
				}
			}
			
			
		}
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
		int nodes = 11;
		int left = 7;
		int right = 10;
		
		for(int i = 0; i < 10; i++) {
			int x,y;
			Scanner sc = new Scanner(System.in);
			x = sc.nextInt();
			y = sc.nextInt();
			
			tree[x][y] = tree[y][x] = 1;
		}
		
		
		dfs(tree, 0, 0);
		
		if(height[left] > height[right]) {
			
			//?™¼ìª½ì˜ ?…¸?“œê°? ?” ê¹Šì„?•Œ 
			while(true) {
				if(height[left] == height[right]) {
					
					if(left == right) {
						
						System.out.print(left);
					}
					break;
					
				}
				else left = parents[left];
			}
			
		}
		else if(height[left] < height[right]) {
			while(true) {
				if(height[left] == height[right]) {
					
					if(left == right) {
						
						System.out.print(left);
					}
					break;	
				}
				else right = parents[right];
			}
		}
		else {
			if(left == right) {
				System.out.print(parents[left]);
			}
			
		}
		
		
		
	}

	
	
}

//0 1 0 2 1 3 1 4 1 5 2 6 2 10 6 7 6 8 6 9




