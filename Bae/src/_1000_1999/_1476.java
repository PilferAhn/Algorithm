package _1000_1999;
import java.util.*;
public class _1476 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int limit_e = 15;
		int limit_s = 28;
		int limit_m = 19;
		
		Scanner sc = new Scanner(System.in);
		
		int e = sc.nextInt();
		int s = sc.nextInt();
		int m = sc.nextInt();
		
		sc.close();
		
		
		
		// Case of E first
		// if E is over than 15;
		int counter = 0;
		
		while(true) {
		
			
			int temp_e = counter % limit_e;
			//     0    =  15  %  15;
			//     나올수 있는 값의 범위는 0 ~ 14;
			//     실제 값은 1 ~ 16; 
			//		애초에 E값을 -1 해주면.
			//		
			   
			int temp_s = counter % limit_s;
			int temp_m = counter % limit_m;
			
			if(temp_e == e - 1 && temp_s == s  - 1 && temp_m == m - 1) {
//				System.out.println(temp_e + " " + temp_s + " " + temp_m);
				break;
			}
			counter++;
		}
		
		System.out.print(counter+1);
		
		
	}

}
