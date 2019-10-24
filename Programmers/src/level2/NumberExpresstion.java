package level2;

public class NumberExpresstion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int n = 15;
		int answer = 0;
		for(int i = 1; i <= n; i++) {
			
			int value = i;
			
			if(i == n) {
				answer++;
				break;
			}
			
			for(int j = i + 1; j <= n; j++) {
				
				value += j;
				
				if(value == n) {
					answer++;
					break;
				}
				else if(value > n) break;
				
			}
		}
		
		System.out.print(answer);
	}

}
