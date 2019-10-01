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
//		int[][] table = new int[8][8];
		
		String[] temp = {"5D", "8E", "2G"};
		int x = 0;
		int y = 0;
		
		for(int i = 7; i >= 0; i--) {
			for(int j = 0; j < 8; j++){
				tree[i][j] = 5;
			}
		}
		
//		for(int i = 7; i >= 0; i--) {
//			for(int j = 0; j < 8; j++){
//				System.out.print(tree[i][j] + " ");
//			}
//			System.out.println();
//		}
		
		for(String str : temp) {
			y = str.charAt(0) - '0';
			x = (str.charAt(1)) - '0';
			x = x - 17;
			y = y - 1;
			
//			System.out.println(x + " " + y);
		
			int tempx = x;
			int tempy = y;
			
			while(tempx >= 0 || tempy <= 7) {
				tree[tempy][tempx] = 0;
				tempy++;
				tempx--;
			}
			
			tempx = x;
			tempy= y;
			
			while(tempx <= 7 || tempy >= 0) {
				tree[tempy][tempx] = 0;
				tempx++;
				tempy--;
			}
			
			tempx = x;
			tempy= y;
			
			while(tempx<=7 && tempy<=7) {
				tree[tempy][tempx] = 0;
				tempx++;
				tempy++;
			}
			
			while(tempx >= 0 && tempy >= 0) {
				tree[tempy][tempx] = 0;
				tempx--;
				tempy--;
			}
			
			for(int i = 7; i >= 0; i--) {
				for(int j = 0; j < 8; j++){
					System.out.print(tree[i][j] + " ");
				}
				System.out.println();
			}
			
			System.out.println();
			System.out.println();
//			break;
		}
		
		
		
		
		
		
		
//		System.out.print(x + " " + y);
		
		
	}
}
