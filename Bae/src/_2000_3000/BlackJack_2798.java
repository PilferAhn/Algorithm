package _2000_3000;
import java.util.*;
public class BlackJack_2798 {
	static int answer = 0;
	static boolean[] check;
	
	
	public static void recursive(int[] arr, int depth, int n, int m, int value) {
		
		
		
		if(depth == 3) {
			if(value <= m) answer = Math.max(answer, value);
			return ;
		}
		
		for(int i = 0 ; i < n; i++) {
			
			if(check[i] == false) {
				
				check[i] = true;
				value += arr[i];
				recursive(arr, depth+1, n, m, value);
				
				value -= arr[i];
				check[i] = false;
			}
			
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int n,m;
		
		Scanner sc = new Scanner(System.in);
		
		n = sc.nextInt();
		m = sc.nextInt();
		check = new boolean[n];
		int[] arr = new int[n];
		
		for(int i = 0; i < n; i++) {
			int temp = sc.nextInt();
			arr[i] =  temp;
		}
		
		recursive(arr, 0,n, m,0);
		
		sc.close();
		
//		for(int i = 0 ; i < n -1; i++) {
//			int biggest = 0;
//			for(int j = i + 1; j < n; j++) {
//				biggest = arr[i] + arr[j];
//				if(biggest <= m) {
//					answer = Math.max(biggest, answer);
//				}
//			}
//		}
		
		System.out.print(answer);
		
		

	}

}
