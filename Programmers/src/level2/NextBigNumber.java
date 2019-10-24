package level2;
import java.util.*;
public class NextBigNumber {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		ArrayList<Integer> arr = new ArrayList<Integer>();
		
		int n = 78;
		int num = 0;
		String temp = Integer.toBinaryString(n);
		
		for(int i = 0; i < temp.length(); i++) {
			if(temp.charAt(i) == '1') num++;
		}
		
		int answer = 0;
		
		while(true) {
			n++;
			temp = Integer.toBinaryString(n);
			int value = 0;
			for(int i = 0; i < temp.length(); i++) {
				if(temp.charAt(i) == '1') value++;
			}
			
			if(value == num) {
				answer = n;
				break;
			}
		}
		
		System.out.print(answer);
	}

}
