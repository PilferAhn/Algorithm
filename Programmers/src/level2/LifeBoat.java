package level2;


public class LifeBoat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] pp = {70,50,80,50};
		int limit = 100;
		
		int start = 0;
		int end = pp.length - 1;
		int cnt = 0;
		while(start < end) {
			cnt++;
			if(pp[start] + pp[end] < limit) {
				start++;
				end++;
			}
			else start++;
			
		}
		
		System.out.print(cnt);

	}

}
