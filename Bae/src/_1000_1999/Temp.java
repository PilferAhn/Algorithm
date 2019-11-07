package _1000_1999;
import java.util.*;
public class Temp{
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		ArrayList<Integer> arr = new ArrayList<Integer>();
		int n = sc.nextInt();
		int answer = 0;
		int limit = sc.nextInt();
		
		
		
		for(int i = 0; i < n; i++) {
			
			int w = sc.nextInt();
			int v = sc.nextInt();
			arr.add(w);
			map.put(w, v);
			
		}
		
		for(int i = 0; i < n; i++) {
			for(int j = 1; j < n - 1; j++) {
				
				int a = arr.get(i) + arr.get(j);
				if(a <= limit) answer = Math.max(answer, map.get(arr.get(i)) + map.get(arr.get(j)));
				
			}
		}
		
		System.out.print(answer);
		sc.close();
		
	}
}