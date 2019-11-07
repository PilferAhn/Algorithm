package _10000_11000;

import java.util.*;

public class _11048 {
	static int n , m;
	static int[][] table;
	static int[][] dp;
	static int MAX = 1001;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		table = new int[MAX][MAX];
		dp = new int[MAX][MAX];
		for(int i = 1; i <= n ; i++) for(int j = 1; j <= m; j++) {
			table[i][j] = sc.nextInt(); 
		}
		sc.close();
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= m; j++) {
				if(dp[i - 1][j] > dp[i][j - 1])
				{
					dp[i][j] = dp[i - 1][j] + table[i][j];
				}
				else {
					dp[i][j] = dp[i][j-1] + table[i][j];
				}
			}
			
		}
		
		System.out.print(dp[n][m]);
	}
	
	

}
