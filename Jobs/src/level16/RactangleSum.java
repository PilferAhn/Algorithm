package level16;

import java.util.ArrayList;
import java.util.Scanner;

public class RactangleSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 5, m =5, boxs = 3;
		int[] arr = {
		 1, -2, 3, 2, 8,

		-8, -9, 3, 4, 5,

		 2, 4, 7, 8, 2,

		 1, 4, 3, 1, 4,

		-1, 2, 5, -6, 3};
		
		int[] retangle = {
		1, 2, 3, 4,

		0, 0, 1, 1,

		2, 0, 2, 1,};
		
		
		int[][] dp = new int[n][m];
		Scanner sc = new Scanner(System.in);
//		int node;
		for(int i = 1; i <= n ; i++) {
			for(int j = 1; j <= m; j++) {
//				node = sc.nextInt();
				dp[i][j] = sc.nextInt();
				dp[i][j] = dp[i][j-1] + dp[i-1][j] + dp[i-1][j-1] + dp[i][j];
				
			}
		}
		ArrayList<Integer> answer = new ArrayList<Integer>();
		int a,b,c,d;
		
		for(int i = 0; i < boxs; i++) {
			a = sc.nextInt();
			b = sc.nextInt();
			c = sc.nextInt();
			d = sc.nextInt();
			
			a++;
			b++;
			c++;
			d++;
			
			int size = dp[c][d] - dp[c][b-1] - dp[d][a-1] + dp[a-1][b-1];
			answer.add(size);
		}
		
		for(int i : answer) System.out.print(i + " ");

	}

}
