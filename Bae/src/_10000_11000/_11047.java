package _10000_11000;
import java.util.*;
public class _11047 {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i < n; i++) {
			
			arr[i] = sc.nextInt();
		}
		sc.close();
		int sum = 0;
		int temp = 0;
		Arrays.sort(arr);
		for(int i = 0; i < n; i++) {
			temp += arr[i];
			sum += temp;
		}
		
		System.out.print(sum);
	}

}
