package level3;
import java.util.*;
public class LongestNode {
	static Queue<Integer> q = new LinkedList<Integer>();
	static int n = 7;
	static int answer = 0;
	static boolean[] check= new boolean[20000];
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//[[3, 6], [4, 3], [3, 2], [1, 3], [1, 2], [2, 4], [5, 2]]
		int[][] tree = new int[20000][20000];
		int[][] node = {{3,6}, {4,3}, {3,2}, {1,3}, {1,2}, {2,4}, {5,2}};
		
		for(int i = 0; i < 7; i++) {
			int x = node[i][1];
			int y = node[i][0];
			
			tree[x][y] = tree[y][x] = 1;
//			System.out.println(tree[x][y]);
		}
		
		
		
		
//		q.add(1);
//		check[1] = true;
//		
//		while(!q.isEmpty()) {
//			
//			int temp = q.poll();
//			answer++;
//			for(int i = 1; i <= 6; i++) {
//				if(check[i] == false && tree[temp][i] == 1) {
//					check[i] = true;
//					System.out.print(i + " ");
//					q.add(i);
//					
//				}
//				
//			}
//			
//		}
		
//		check[1] = true;
		
		System.out.print("Answer is " + answer);
		
	}

}
