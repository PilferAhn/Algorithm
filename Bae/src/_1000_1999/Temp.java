package _1000_1999;
import java.util.*;
public class Temp{
	static int limit = 100000;
	static int answer = 100000;
	static boolean[] check = new boolean[limit + 1];
	static int[] distance = new int[limit + 1];
	static Queue<Integer> q = new LinkedList<Integer>();
	
	public static boolean block(int n) {
		
		if(n < 0 || n > limit) return false;
		
		return true;
		
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int destination = sc.nextInt();
		sc.close();
		q.add(n);
		check[n] = true;
		
		while(!q.isEmpty()) {
			
			int peek = q.poll();
			
			int add = peek + 1;
			if(block(add) && !check[add])
			{
				check[add] = true;
				distance[add] = distance[peek] + 1;
				q.add(add);
			}
			
			int distract = peek - 1;
			if(block(distract) && !check[distract]) {
				check[distract] = true;
				distance[distract] = distance[peek] + 1;
				q.add(distract);
				
			}
			
			int times = peek * 2;
			if(block(times) && !check[times]) {
				check[times] = true;
				distance[times] = distance[peek] + 1;
				q.add(times);
			}
		}
		
		
		System.out.print(distance[destination]);
		
		
	}
}