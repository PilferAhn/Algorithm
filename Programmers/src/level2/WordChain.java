package level2;
import java.util.*;
public class WordChain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set<String> s = new HashSet<String>();
		int n = 3;
		String[] words = {"tank", "kick", "know", "wheel", "land", "dream", "mother", "robot", "tank"};
//		String[] words = {"hello", "one", "even", "never", "now", "world", "draw"};
//		String[] words = {"land", "dream", "mom", "mom", "ror"};
		s.add(words[0]);
		boolean flag = true;
		for(int i = 1; i < words.length; i++) {
			
			
//			System.out.println(words[i-1].charAt(words[i-1].length()-1) + " " + words[i].charAt(0));
			if(words[i-1].charAt(words[i-1].length()-1) != words[i].charAt(0)) {
				System.out.println(words[i] + " Wrong");
				flag = false;
				
			}
			
			if(s.contains(words[i])) {
				System.out.println(words[i] + " Set");
				flag = false;
				
			}
			
			s.add(words[i]);
			
			if(!flag) {
				
				int round = 0;
				int turn = 0;
				
				round = i / n + 1;
				turn = i % n + 1;
				System.out.print( turn + " " + round);
				break;
			}
			
		}
		
//		System.out.print(words[0].charAt(words[0].length()-1));
		
	}

}

