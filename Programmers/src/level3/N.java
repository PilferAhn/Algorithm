package level3;
import java.util.*;
public class N {
	static Stack<Integer> s = new Stack<Integer>();
	
	public static int dp(int n, int num, int limit, Stack<Integer> s, int depth) {
		if(depth == limit) return -1;
		
		int sum = 0;
		for(int i = 0; i < s.size(); i++) {
			sum += s.get(i);
		}
//		System.out.println(sum);
		if(sum == num) {
			System.out.println(sum);
			return s.size();
		}
		
		
		s.add(n);
		dp(n, num, limit, s, depth + 1);
		
		int temp = 0;
		temp = s.peek();
		s.pop();
		temp = temp - n;
		s.add(temp);
		dp(n, num, limit, s, depth + 1);
		
		temp = s.peek();
		s.pop();
		temp = temp / n;
		s.add(temp);
		dp(n, num, limit, s, depth + 1);
		
		
		return sum;
	}	
	
	public static void main(String[] args) {

			int n = 2;
			int num = 11;
			int limit = 8;
			int depth = 0;
			s.add(n);
			int answer = dp(n, num, limit, s, depth);
//			System.out.print(answer);
		

	}

}
