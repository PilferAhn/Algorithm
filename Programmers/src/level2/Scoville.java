package level2;
import java.util.*;
public class Scoville {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] scoville = {1, 2, 3, 9, 10, 12};	
		int K = 7;
		Queue<Integer> q = new PriorityQueue<Integer>();
		
		for(int i : scoville) q.add(i);
		int answer = 0;
		while(q.peek()< K) {
			answer++;
			int first = q.poll();
			int second = q.poll();
			
			int mix = first + (second * 2);
			
			q.offer(mix);
			
		}
		
		if(scoville.length <= 1 && scoville[0] < K) answer = -1;
		
		System.out.print(answer);
		
	}

}
