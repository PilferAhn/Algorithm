package level2;

public class JoyStick {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name = "JAN";
		int len = name.length();
		int sum = 0;
		for(int i = 0; i < len; i++) {
			
			char alpha = name.charAt(i);
			
			if( alpha == 'A') {
				System.out.println(1);
				sum++;		
			}
			else if(alpha >= 'M') {
				System.out.println(2);
				sum += 'M' - alpha;
			}
			else if(alpha > 'M'){
				System.out.println(3);
				sum += 'Z' - alpha + 1;
			}
//			System.out.println(sum);
			
		}
	
		System.out.println(sum);
	}

}
