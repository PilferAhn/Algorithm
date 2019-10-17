package level2;

public class OneTwoFour {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 10;
		
		int temp = (n - 1) / 3;
		if(temp == 3) temp = 4;
//	      System.out.print(temp);
	      
	      int remain = n % 3;
	      if(remain == 0) remain = 4;
	      
	      
	      String number = Integer.toString(temp);
	      
	      if(number.equals("0")) number = "";
	      String left = Integer.toString(remain);
	      
	      String answer = number+left;
	      
	      System.out.print(answer);

	}

}
