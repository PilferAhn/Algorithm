package _10000_11000;
import java.util.*;
public class _10971 {
	static boolean[] check = new boolean[1000000];
	static int answer = 1000000;
	public static void dfs(int[][] table, int node, int depth, int n, int value, int init) {
		
		if(depth >= n) {
			
			if(table[init][node] != 0) {
				answer = Math.min(answer, value + table[init][node]);
				return ;
			}
			
		}
		
		for(int i = 0; i < n; i++) {
			
			if(table[node][i] != 0 && !check[i]) {
				
				check[i] = true;
				dfs(table, i, depth+1, n, value + table[node][i], init);
				check[i] = false;
			}
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int[][] table = new int[n][n];
		
		for(int i = 0; i < n; i++)
			for(int j = 0; j < n; j++) {
				
				table[i][j] = s.nextInt();
				
			}
		
		for(int i = 0; i < n; i++) {
			
			check[i] = true;
			dfs(table, i, 0, n, 0,i);
			check[i] = false;
			
		}
		
		System.out.print(answer);
		s.close();

	}

}
