package level2;
import java.util.*;
public class CorrectParentheses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			
			Stack<Character> s = new Stack<Character>();
//			String[] arr = {"()()", "(())()", ")()(", "(()("};
			String q = "()()";
			boolean answer = true;
			for(int i = 0; i < q.length(); i++) {
				
				char current = q.charAt(i);
				
				if(current == '(') {
					s.add(current);
				}
				else {
					
					if(s.isEmpty()) {
						answer = false;
						break;
					}
					else {
						s.pop();
					}
				}
				
			}
			
			if(!s.isEmpty()) answer = false;
			System.out.print(answer);
			
	}

}
