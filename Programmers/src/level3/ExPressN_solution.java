package level3;
import java.util.*;
public class ExPressN_solution {

	static ArrayList<Integer> arr = new ArrayList<Integer>();
	static int minVal = 9;
	static int cnt = 0;
	static int maxVal = 1000000;
	static int answer = 9;
	public static void bfs(int n, int number) {
		
		int lastIndex = 0;
		if(arr.size() == 0) {
			lastIndex = 0;
		}
		else lastIndex = arr.size()-1;
		
		if(cnt >= minVal) {
			return ;
		}
		
		
		
		if(lastIndex == number) {
			
			for(int i = 0; i < arr.size(); i++) {
				System.out.print(arr.get(i));
				
			}
			System.out.println();
			
			
			answer = Math.min(answer, lastIndex);
			
			return ;
			
			
		}
		Queue<Integer> pq = new PriorityQueue<Integer>();
		
		int temp = 0;
		for(int i = 1; i < maxVal; i = i * 10) {
			cnt++;
			temp += (n * i);
			
			// sum
			arr.add(lastIndex + temp);
			bfs(n, number);
			arr.remove(arr.size()-1);
			
			// distract
			if(lastIndex - temp != 0) {
				
				arr.add(lastIndex - temp);
				bfs(n , number);
				arr.remove(arr.size()-1);
			}
			
			arr.add(lastIndex * temp);
			bfs(n, number);
			arr.remove(arr.size()-1);
			
			if(lastIndex / temp != 0) {
				arr.add(lastIndex / temp);
				bfs(n, number);
				arr.remove(arr.size()-1);
			}
			
		}
		
		
//		for(int i = 0; i < )
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int N = 5;
		int number = 12;
		
//		for(int i = 1; i < 1000000; i *= 10) {
//			System.out.println(i);
//		}
		
//		bfs(N,number);
		
		if(answer >= 9) System.out.print(-1);
		else System.out.print(answer);
		

	}

}
