package level2;
import java.util.*;
public class FinePrime {

	static boolean[] check = new boolean[8];
	static ArrayList<String> arr = new ArrayList<String>();
	static String num = "";
	
	public static void recursive(String number, int len, int depth, String value) {
		
		if(depth >= len) return ;
		
		for(int i = 0; i < len; i ++) {
			
			if(check[i] == false) {
				check[i] = true;
				String temp = value;
				num += number.charAt(i);
				arr.add(num);
				recursive(number, len, depth + 1, num);
				
				num = temp;
				check[i] = false;
				
			}
			
			
			
			
		}
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String number = "17";
		String non = "";
		recursive(number, number.length(), 0, non);
		
		
	}

}
