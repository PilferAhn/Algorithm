package _9000_9999;
import java.util.*;
public class _9461 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int[] dp = new int[101];
		dp[1] = 1;
		dp[2] = 1;
		dp[3] = 1;
		dp[4] = 2;
		dp[5] = 2;
		int n = sc.nextInt();
		
		for(int i = 6; i <= 100; i++) {
			dp[i] = dp[i-1] + dp[i - 5];
		}
		
		for(int i = 0; i < n; i++) {
			int temp = sc.nextInt();
			System.out.println(dp[temp]);
		}
		sc.close();
	}

}
