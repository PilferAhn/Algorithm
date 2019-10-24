package level2;

public class Baseball {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int answer = 0;
		int [][] baseball = {{123, 1, 1}, {356, 1, 0}, {327, 2, 0}, {489, 0, 1}};
		boolean[] check = new boolean[999];
		for(int i = 123; i < 999; i++) {
			String temp = Integer.toString(i);
			
			char first = temp.charAt(0);
			char second = temp.charAt(1);
			char thrid = temp.charAt(2);
			
			if(first == '0' || second == '0' || thrid == '0') check[i] = true;
			if(first == second || first == thrid || second == thrid) check[i] = true;
		}
		
		for(int i = 123; i < 999; i++) {
			String temp = Integer.toString(i);
		
			for(int j = 0; j < baseball.length; j++) {
				
				String shot = Integer.toString(baseball[j][0]);
				int guess_s = baseball[j][1];
				int guess_b = baseball[j][2];
				int strike = 0;
				int ball = 0;
				
				for(int x = 0; x < temp.length(); x++) {
					for(int y = 0; y < shot.length(); y++) {
						if(temp.charAt(x) == shot.charAt(y)) {
							
							if(x == y) strike++;
							else ball++;
							
							
						}
					}
				}
				if(guess_s != strike || guess_b != ball) check[i] = true;
			}
		}
		
		for(int i = 123; i < 999; i++) {
			if(check[i] == false) answer++;
		}
		System.out.print(answer);
	}

}
