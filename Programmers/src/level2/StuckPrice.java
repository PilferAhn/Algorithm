package level2;

public class StuckPrice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] price = {1, 2, 3, 2, 3};
		
		int[] answer = new int[price.length];
		
		for(int i = 0; i < price.length; i++) {
			answer[i] =	price.length - 1 - i;
		}
		
		
		
		for(int i : answer) System.out.print(i + " ");
	}

}
