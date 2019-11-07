// 항상 완전탐색으로 생각할 것. 
// 

package _10000_11000;
import java.util.*;
public class _10971 {
	static boolean[] check = new boolean[1000000];
	static int answer = 987654321;
	static int init = 0;
	static int n = 0;
	public static void dfs(int[][] table, int node, int depth, int value) {
		
		if(depth == n) {
			
			// 플로이드 알고리즘 찾아보기. 
			
			if(table[init][node] != 0) {
				System.out.println("node is " + node);
				answer = Math.min(answer, value + table[init][node]);
				return ;
			}
			
		}
		
		
		
		for(int i = 0; i < n; i++) {
				
			if(table[node][i] != 0 && check[i] == false) {
				
				check[i] = true;
				
				dfs(table, i, depth+1, value + table[node][i]);
				
				check[i] = false;
			}
		}
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		n = s.nextInt();
		int[][] table = new int[n][n];
		
		for(int i = 0; i < n; i++)
			for(int j = 0; j < n; j++) {
				
				table[i][j] = s.nextInt();
				
			}
		
		for(int i = 0; i < n; i++) {
			init = i;
			dfs(table, i, 0, 0);
		}
		
		System.out.print(answer);
		s.close();

	}

}
