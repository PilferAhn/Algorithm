package _9000_9999;
import java.util.*;

public class _9019 {
	static boolean[] check;
	static String[] visited;
	
	public static int getL(int n) {
		
		int value = (n % 1000) * 10;
		return value + n / 1000; 
	}
	
	public static int getR(int n) {
		
		int value = (n % 10) * 1000;
		return value + n / 10;
		
	}
	
	public static boolean visit(int n) {
		
		if(check[n] ==  false) return true;
		else return false;
	}
	public static void makeVisited(Queue<Integer> q, String[] visited, int current, int next, char order) {
		
			q.add(next);
			visited[next] = visited[current] +  order;
//			System.out.println(next);
			check[next] = true;
			
			
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		
		for(int i = 0; i < n ; i++) {
			Queue<Integer> q = new LinkedList<Integer>();
			check = new boolean[100001];
			visited = new String[100001];
			int start = sc.nextInt();
			int end = sc.nextInt();
			
			
			q.add(start);
			visited[start] = "";
			
			while(!q.isEmpty()) {	
				int current = q.poll();
				
				if(current == end) break;
				
				// Case of D
				int D = current * 2 >= 10000 ? (current *2 ) % 10000 : current * 2;
				if(visit(D)) makeVisited(q, visited, current, D, 'D');
				
				int S = current;
				if(S - 1 < 0) S = 9999;
                else S = current - 1; 
				if(visit(S)) makeVisited(q, visited, current, S, 'S');
				
				int L = getL(current);
				if(visit(L)) makeVisited(q, visited, current, L, 'L');
				
				int R = getR(current);
				if(visit(R)) makeVisited(q, visited, current, R, 'R');
				
			}
			
			for(int j = 0; j <visited[end].length(); j++) {
				System.out.print(visited[end].charAt(j));
			}
			System.out.println();
		}
		
		sc.close();
		
	}

}
