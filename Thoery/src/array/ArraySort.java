package array;

import java.util.*;




public class ArraySort {
	
	public static boolean cmp(String a, String b) {
		
		String A = a;
		String B = b;
		boolean answer = Integer.parseInt(A + B) > Integer.parseInt(B + A) ? true : false;
		
		return answer;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {3, 30, 34, 5, 9};
		
		Arrays.sort(arr);
		
	}

}
