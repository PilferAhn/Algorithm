package _1000_1999;

import java.util.*;

public class _1018 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int n,m;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		
		int[] arr = new int[m];
		int cnt = 0;
		String line = "";
		for(int i = 1; i <= n; i++ ) {
			line = sc.next();
			
			for(int j = 1; j <= m; j++) {
				arr[j-1] = line.charAt(j-1);
				
				if(i % 2 == 1) {
					// odd
					
					if(j % 2 == 1) {
						if(arr[j-1] != 'W') {
							cnt ++;
							break;
						}
						
					}
					else {
						if(arr[j-1] != 'B') {
							cnt++;
							break;
						}
					}
					
				}
				else {
					
					if(j%2 ==1) {
						if(arr[j-1] != 'B') {
							cnt++;
							break;
						}
					}
					else {
						if(arr[j-1] != 'W') {
							cnt++;
							break;
						}
					}
				}
			}
			
			
		}
			
		
		System.out.print(cnt);
		
		
		sc.close();
	}

}
