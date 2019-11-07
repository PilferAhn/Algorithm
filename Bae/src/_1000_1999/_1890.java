package _1000_1999;
import java.util.*;
public class _1890 {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int MAX = 101;
		int[][] table = new int[MAX][MAX];
		int[][] dp = new int[MAX][MAX];
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int i = 0; i < n ; i++) {
			for(int j = 0; j < n; j++) {
				table[i][j] = sc.nextInt();
			}
		}
		sc.close();
		dp[0][0] = 1;
		for(int i = 0; i < n ; i++) {
			for(int j = 0; j < n; j++) {
				
				int distance = table[i][j];
				
				if(i != n - 1 && i + distance < n) dp[i + distance][j] += dp[i][j];
				if(j != n - 1 && j + distance < n) dp[i][j + distance] += dp[i][j];

			}
		}
		
		System.out.print(dp[n-1][n-1]);
	}

}
