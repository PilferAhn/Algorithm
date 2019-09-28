package level11_DFS_BFS;
import java.util.*;
public class BFS_DFS {
	static int n = 9;
	static int m = 12;
	static int[][] tree = new int[12][12];
	static ArrayList<Integer> arr = new ArrayList<Integer>();
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// value
		// 0 1 0 2 0 3 1 5 2 5 3 4 4 5 5 6 5 7 5 8 6 7 7 8
		int[][] table = new int[8][8];
		
		String[] temp = {"5D", "E8", "G2"};
		int x = 0;
		int y = 0;
		for(int i = 8; i > 0; i--) {
			for(int j = 0; j < 8; j++){
				table[i][j] = 1;
			}
		}
		for(String str : temp) {
			y = str.charAt(0) - '0';
			x = (str.charAt(1)) - '0';
			x = x - 17;
			y = y - 1;
			
			
			int tempx = x;
			int tempy = y;
			table[y][x] = 0;
			
			while(x > 0 && y <= 7) {
				x--;
				y++;
				table[y][x] = 0;
			}
			
			while(y > 0 && x <= 7) {
				x++;
				y--;
				table[y][x] = 0;
			}
			
			x = tempx;
			y = tempy;
			while(x < 7 && y < 7) {
				x++;
				y++;
				table[y][x] = 0;
			}
			
			x = tempx;
			y = tempy;
			while(x > 0 &&  y > 0) {
				x--;
				y--;
				table[y][x] = 0;
			}
			int answer = 0;
			for(int i = 7; i >= 0; i--) {
				for(int j = 0; j < 8; j++){
					System.out.print(table[i][j] + " ");
					if(table[i][j] == 1) {
						answer ++;
					}
				}
				System.out.println();
			}
			
//			System.out.print(answer);
		}
		
		
		
		
		
		
		
//		System.out.print(x + " " + y);
		
		
	}
}
