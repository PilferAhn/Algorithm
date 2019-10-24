package level2;

public class TargetNumber {
	static int answer = 0;
	
	public static void recursive(int[] numbers, int current, int end, int value, int target) {
		
		if(current >= end ) {
			
			if(value == target) {
				answer++;
				return;
				
			}
	
			return ;
			
		}
		
		recursive(numbers, current + 1, end, value + numbers[current], target);
		recursive(numbers, current + 1, end, value - numbers[current], target);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] numbers = {1, 1, 1, 1, 1};
		int target = 3;
		recursive(numbers, 0, numbers.length, 0, target);
		System.out.print(answer);
	}

}
