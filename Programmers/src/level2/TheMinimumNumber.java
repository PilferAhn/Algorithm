package level2;

import java.util.*;

public class TheMinimumNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int lcm = 0;
		
		int n = 0;
		Queue<Integer> q = new LinkedList<Integer>();
		
		int[] arr = {2,6,8,14};
		for(int i : arr) q.add(i);
		
		while(!q.isEmpty()) {
			
			
			int a = q.poll();
			int b = q.poll();
			lcm = a > b ? a : b;
			while(true) {
				
				if(lcm % a == 0 && lcm % b ==0) {
					n = lcm;
					q.add(n);
					break;
				}
				lcm ++;
			}

			if(q.size() == 1) break;
		}
		System.out.print(n);
	}

}
