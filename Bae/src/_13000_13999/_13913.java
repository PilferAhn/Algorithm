package _13000_13999;
import java.util.*;
public class _13913 {
	
	static int MAX = 100005;
	static boolean[] check = new boolean[MAX];
	static int[] answer = new int[MAX];
	static int cnt = 0;
	
	
	public static boolean NumInspection(int n) {
		if(n < 0 || n > MAX) return false;
		return true;
	}
	
	public static boolean visit(int n) {
		if(check[n] == true) return false;
		
		check[n] = true;
		return true;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int start = 5;
		int end = 17;
		
		Queue<Integer> q = new LinkedList<Integer>();
		
		q.add(start);
		check[start] = true;
		while(!q.isEmpty()) {
			
			
			int current = q.poll();
			
			int plus = current + 1;
			if(NumInspection(plus) && visit(plus)) {
				q.add(plus);
				
			}
			
			
		}
		
//		for(Object i : q) System.out.print(i + " ");
//		
//		System.out.print(answer[end]);
	}

}
