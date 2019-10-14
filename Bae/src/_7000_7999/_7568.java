package _7000_7999;
import java.util.*;
public class _7568 {
	
	public static boolean[] check;
	public static int n;
	public static int[] height, weight;
	public static ArrayList<Integer> arr = new ArrayList<Integer>();
	public static int cnt = 0;
	public static void bfs(int person, int rank, int depth) {
		
		if(depth >= n) {
			cnt++;
			arr.add(rank);
			return ;
		}
		
		for(int i = 0; i < n; i++) {
			if(check[i] == false) {
				
				check[i] = true;
				if(height[i] < height[person] && weight[i] < weight[person]) {
					rank++;
				}
				bfs(person, rank, depth+1);
				
				
				check[i] = false;
			}
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		n = sc.nextInt();
		
		height = new int[n];
		weight = new int[n];
		check = new boolean[n];
		
		
		
		for(int i = 0; i < n; i++) {
			int h , w;
			h = sc.nextInt();
			w = sc.nextInt();
			height[i] = h;
			weight[i] = w;
		}
		
		
//		bfs(0, 1, 0);
		
		for(int i = 0; i < n; i++) {
			int rank = 1;
			for(int j = 0; j < n; j++) {
				if(i != j) {
					
					if(height[i] < height[j] && weight[i] < weight[j]) {
						rank++;
					}
					
				}
				
			}
			arr.add(rank);
			
		}
		
		
		sc.close();

		for(int i = 0; i < arr.size() - 1; i++) {
			System.out.println(arr.get(i));
		}
		System.out.print(cnt);
	}

}
