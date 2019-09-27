package level12_Queue;
import java.util.*;
public class 전염병 {
	static final int max = 100001;
	static int cnt = 10;
	
	static boolean[] check = new boolean[100];
	static Queue <Integer> q = new LinkedList<Integer>();
	
	public static void bfs(int n) {
		
		q.add(n);
		check[n] = true;
		
		while(!q.isEmpty()) {
			
			cnt--;
			int temp = q.peek();
			q.remove();
			int times = temp * 2;
			int divide = temp / 3;
			
			
				
			if(check[times] == false && times <=10)
			{
				
				bfs(times);
			}
				
			if(check[divide] == false && divide >= 1) {
				
				bfs(divide);
			}
		
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// bfs 문제다. 
		
		int vilige = 10;
		int start = 3;
		
		
		
		
		bfs(start);
		System.out.print(cnt);

	}

}
