package _2000_2999;
import java.util.*;
public class _2217 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		
		for(int i = 0; i < n; i ++) arr[i] = sc.nextInt();
		Arrays.sort(arr);
		
		int answer = 0;
		
		for(int i = 1; i <= 10000; i++) {
			
			if( i / n < arr[0]) continue;
			else {
				answer = i;
				break;
			}
			
		}
		System.out.print(answer);
	}

}
