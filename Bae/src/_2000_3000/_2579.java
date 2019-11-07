package _2000_3000;
import java.util.*;
public class _2579 {
	static int[] points = new int[301];
	static int[] dp = new int[301];
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int n = sc.nextInt();
		
		
		for(int i = 0; i < n; i++) points[i] = sc.nextInt();
		sc.close();
		
		dp[0] = points[0];
		dp[1] = Math.max(points[0] + points[1], points[1]);
		dp[2] = Math.max(points[0] + points[2], points[1] + points[2]);
		
		for(int i = 3; i < n; i++) dp[i] = Math.max(dp[i-2] + points[i], points[i-1] + points[i] + dp[i - 3]);
		
		System.out.print(dp[n-1]);
	}

}
