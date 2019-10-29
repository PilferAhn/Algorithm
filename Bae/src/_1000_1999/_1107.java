package _1000_1999;
import java.util.*;
public class _1107 {
	static boolean[] check = new boolean[11];
	public static int getChannel(int n) {
		
//		if(check[n] == true) return 0;
		int cnt = 0;
		if(n == 0) {
			if(check[n]==true) return 0;
			else return 1;
		}
		
		while(n > 0) {
			
			if(check[n % 10] == true) return 0;				
			
			n/=10;
			cnt++;	

		}
		return cnt;
		
	}
	
	public static void main(String[] args) {
		
        Scanner sc = new Scanner(System.in);
        int channel = sc.nextInt();
        int n = sc.nextInt();
        for(int i = 0; i < n; i++){
            int temp = sc.nextInt();
            check[temp] = true;
        }
		
		
		
//		for(int i = 0; i < n; i++) {
//			check[arr[i]] = true;
//		}
		
		int answer = Math.abs(channel - 100);
		
		for(int i = 0; i <= 1000000; i++) {
			
			
			int len = getChannel(i);
			if(len > 0) {
				int btnClick = Math.abs(i - channel);
//				System.out.print("zero Value printing" + temp);
				
				answer = Math.min(answer, btnClick + len);
//				
			}
		}
		sc.close();
		System.out.print(answer);
	}

}
