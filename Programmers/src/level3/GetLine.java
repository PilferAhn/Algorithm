package level3;

import java.util.*;

public class GetLine {
	static int n = 3;
	static int k = 5;
	static boolean[] check = new boolean[20];
	static int depth = 0;
	static int cnt = 0;
	static ArrayList<Integer> arr = new ArrayList<Integer>();
	
	public static void dfs() {
		
		
//		System.out.print("Test");
		if(arr.size() == 3) {
			
			cnt++;
			if(cnt == k) for(int num : arr) System.out.print(num);
			
		}
		else {
			
			for(int i = 1; i <= n; i++) {
				if(check[i] == false) {
					
					check[i] = true;
					arr.add(i);
					depth++;
					dfs();
					arr.remove(arr.size() - 1);
					check[i] = false;
					
				}
			}
			
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		dfs();
		
		
	}

}
