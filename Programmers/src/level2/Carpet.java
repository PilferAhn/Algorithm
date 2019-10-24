package level2;

public class Carpet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 
		 예를 들어 숫자 n 이 24 라고 할때 24의 제곱근은 4.xxxx 이므로 
		 한 쪽은 항상 4.xxxx 이하의 값을 갖게 되고 한 쪽은 
		 항상 4.xxxx 이상의 값을 갖게 되는 것이다.

		24를 두 수의 곱으로 나타내보면 
		[ 1x24, 2x12, 3x8, 4x6 ], [ 6x4, 8x3, 12x2, 24x1 ] 
		으로 나타낼 수 있는데 왼쪽이 제곱근 이하의 값일땐 오른쪽이 항상 제곱근 이상의 값이고 
		반대의 경우에도 같은 성질을 갖는것을 확인할 수 있다.
		
		*/
		
		/*
		 * 
		 * 만약에 내가 찾는 값이 12라
		 * 3.xxxxxxx가 되는거고. 
		 * [1,12][2,6][3,4] 	[4,3][6,2][1,12]이렇게 된다. 
		 * 
		 * 그리고 가로의 길이가 항상 세로보다 크니까. 
		 * 가능한 경우의 수는 
		 * [4,3][6,2][1,12] 이렇게 되겠지. 
		 * 
		 * 여기서 입력받은 빨간색의 갯수가 2개라면 그리고 그 갯수가 가로라고 가정을 하면
		 * 빨간색의 최대 
		 * */
		
		int brown = 10;
		int red = 2;
		int sum = brown + red;
		int red_sqrt = (int) Math.sqrt(red);
		int[] answer = new int[2];
		System.out.print(red_sqrt);
		
		// 레드의 가로. 

		for(int i = 1 ; i <= red_sqrt; i++) {
			
			if(red % i == 0) {
				
				if(brown == (i * 2) + ((red / i) * 2) + 4){

					answer[0] = (red / i) + 2;
					answer[1] = i + 2;
					
					
				}
				
			}
			
		}
		
		System.out.print(answer[0] + " " + answer[1]);
		
		
	}

}
