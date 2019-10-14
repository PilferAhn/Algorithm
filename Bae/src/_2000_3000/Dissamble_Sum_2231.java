package _2000_3000;
import java.util.*;
public class Dissamble_Sum_2231 {

	public static int answer = 0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n;
		
        Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		
		
		for(int i = 1; i <= n; i++) {
			int value = i;
			int sum = value;
			
			do {
				sum += value % 10;
				value = value / 10;

				
				
			}while(value > 0);
			
			
			if(n == sum) {
				answer = i;
				break;
			}
			
			
		}
		
		sc.close();
		System.out.print(answer);

	}

}
