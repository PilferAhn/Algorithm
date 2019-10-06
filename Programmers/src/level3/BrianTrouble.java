package level3;

public class BrianTrouble {
//	static char change;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String sentence = "HaEaLaLaObWORLDb";
		
		String answer = "";
		
		for(int i = 0 ; i < sentence.length(); i++) {
			int temp = (int)sentence.charAt(i);
			if(97 <= temp && temp <= 122) {
				
				 continue;
			}
			else answer += sentence.charAt(i);
		}
		
		System.out.print(answer);
	}
	
	

}
