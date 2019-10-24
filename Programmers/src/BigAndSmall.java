import java.util.*;

public class BigAndSmall {
	static boolean[] check = new boolean[20001];
	static int answer = 0;
	public static void bfs(int current, int result, int len, int depth) {
		
//		if(depth >= len) return ;
//		if(current == result) {
//			
//		}
//		
//		
//		// Case of D
//		int D = 0;
//		if(current * 2 >= 10000) {
//			D = (current * 2) % 10000;
//		}
//		else D = current;
//		
//		if(D == result) {
//			answer = D;
//			return;
//		}
//		else bfs(D, result, len, depth + 1);
//
//		
//		//Case of S
//		int S = current;
//		if(current == 0) S = 9999;
//		else S = current - 1;
//		bfs(S, result, len, depth);
//
//		
//		//Case of L
//		String tempString = Integer.toString(current);
//		char tempC = tempString.charAt(0);
//		Character[] arr = new Character[tempString.length()];
//		for(int i = 0; i < tempString.length() - 1; i++) {
//			arr[i] = tempString.charAt(i + 1);
//		}
//		arr[tempString.length()-1] = tempC;
//		
//		String temp = "";
//		for(Character c : arr) temp += c;
//		int L = Integer.parseInt(temp);
//		bfs(L, result, len, depth + 1);
//
//		
//		//Case of R
//		
//		tempC = tempString.charAt(tempString.length() - 1);
//		arr = new Character[tempString.length()];
//		for(int i = tempString.length() -1; i > 0 ; i--) {
//			arr[i] = tempString.charAt(i-1);
//		}
//		arr[0] = tempC;
//		temp = "";
//		for(Character c : arr) temp+=c;
//		int R = Integer.parseInt(temp);
//		bfs(R, result, len, depth + 1);
////		System.out.println(R);
		
		
		
		//Case of D
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int n = 3;
		
		int[] a = {1234,1000,1};
		int[] b = {3412, 1, 16};
		
		for(int Z = 0; Z < n; Z++) {
			String[] check = new String[100001];
			boolean[] visited = new boolean[100001];
			Scanner s = new Scanner(System.in);
			
			int start = a[Z];
			int end = b[Z];
			
			s.close();
			
			check[start] = "";
			Queue<Integer> q = new LinkedList<Integer>();
			
			q.add(start);
			int D = 0;
			while(!q.isEmpty()) {
				
				int current = q.poll();
				if(current == end) break;
				
				
				// Case of D
				if(current * 2 >= 10000) {
					D = 10000;
				}
				else D = current * 2;
				
				if(visited[D] == false) {
					q.add(D);
					check[D] = check[current] + 'D';
					visited[D] = true;
				}
				 
				
				
				//Case of S
				
				
				int S = current;
				if(current == 0) S = 9999;
				else S = current - 1;
				
				if(visited[S] == false) {
					check[S] = check[current] + 'S'; 
					q.add(S);
					visited[S] = true;
				}
				
				
				
				
				//Case of L
				String tempString = Integer.toString(current);
				char tempC = tempString.charAt(0);
				Character[] arr = new Character[tempString.length()];
				for(int i = 0; i < tempString.length() - 1; i++) {
					arr[i] = tempString.charAt(i + 1);
				}
				arr[tempString.length()-1] = tempC;
				
				String temp = "";
				for(Character c : arr) temp += c;
				int L = Integer.parseInt(temp);
				
				if(visited[L] == false) {
					check[L] = check[current] + 'L';
					q.add(L);
					visited[L] = true;
				}
				 
				
				
				//Case of R
				tempC = tempString.charAt(tempString.length() - 1);
				arr = new Character[tempString.length()];
				for(int i = tempString.length() -1; i > 0 ; i--) {
					arr[i] = tempString.charAt(i-1);
				}
				arr[0] = tempC;
				temp = "";
				for(Character c : arr) temp+=c;
				int R = Integer.parseInt(temp);
//				check[R] = check[current] + 'R';
				
				if(visited[R] == false) {
					check[R] = check[current] + 'R';
					q.add(R);
					visited[R] = true;
				}
				
				
			}
			
			for(int i = 0; i < check[end].length(); i++) {
				System.out.print(check[end].charAt(i));
			}
			
			System.out.println();
			
		}
		
//		int start = 1000;
//		int end = 1;
		
		
		
	}

}
