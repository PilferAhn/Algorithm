package level2;
import java.util.*;
public class MakeBigNumber {

	static Stack<Character> s = new Stack<Character>();
	static char[] answer;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		String number = "4177252841";
		int k = 4;
		
		int len = number.length() - k;
		answer = new char[len];
//		
		for(int i = 0; i < number.length(); i++) {
			
			char c = number.charAt(i);
			
			while(!s.isEmpty() && s.peek() < c && k -- > 0) {
			
				s.pop();
			}
			
			s.add(c);
		}
		
		for(int i = 0; i< answer.length; i ++) {
			answer[i] = s.get(i);
		}
		
		for(char i : answer) System.out.print(i);
			
		
		
		

	}

}
