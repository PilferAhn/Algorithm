package _2000_3000;
import java.util.*;
public class _2748 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		if(n == 1) {
			System.out.print(1);
		}
		else if(n == 0)System.out.print(0);
		else {
			
			long[] arr = new long[n+1];
			
			arr[0] = 0;
			arr[1] = 1;
			
			for(int i = 2; i <= n; i++) {
				arr[i] = arr[i-1] + arr[i-2];
				System.out.println(arr[i]);
			}
			
//			System.out.print(arr[n]);
		}
		
		
		
		
		sc.close();
	}

}
