package _9000_9999;

import java.util.*;
public class _9019{
	
	public static int getL(int n) {
		
		int value = (n % 1000) * 10;
		return value + n / 1000; 
	}
	
	public static int getR(int n) {
		
		int value = (n % 10) * 1000;
		return value + n / 10;
		
	}
	
    public static void main(String[] args){
        
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        
        for(int Z = 0; Z < n; Z++) {
			String[] check = new String[100001];
			boolean[] visited = new boolean[100001];

			
			int start = s.nextInt();
			int end = s.nextInt();
			
			
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
				int L = getL(current);
				if(visited[L] == false) {
					check[L] = check[current] + 'L';
					q.add(L);
					visited[L] = true;
				}
				
				
				
				
				
				
//				String tempString = Integer.toString(current);
//				char tempC = tempString.charAt(0);
//				Character[] arr = new Character[tempString.length()];
//				for(int i = 0; i < tempString.length() - 1; i++) {
//					arr[i] = tempString.charAt(i + 1);
//				}
//				arr[tempString.length()-1] = tempC;
//				
//				String temp = "";
//				for(Character c : arr) temp += c;
//				int L = Integer.parseInt(temp);
//				
//				if(visited[L] == false) {
//					check[L] = check[current] + 'L';
//					q.add(L);
//					visited[L] = true;
//				}
				
				
				 		
				
				//Case of R
				
				int R = getR(current);
				if(visited[R] == false) {
					check[R] = check[current] + 'R';
					q.add(R);
					visited[R] = true;
				}
				
//				tempC = tempString.charAt(tempString.length() - 1);
//				arr = new Character[tempString.length()];
//				for(int i = tempString.length() -1; i > 0 ; i--) {
//					arr[i] = tempString.charAt(i-1);
//				}
//				arr[0] = tempC;
//				temp = "";
//				for(Character c : arr) temp+=c;
//				int R = Integer.parseInt(temp);
////				check[R] = check[current] + 'R';
//				
//				if(visited[R] == false) {
//					check[R] = check[current] + 'R';
//					q.add(R);
//					visited[R] = true;
//				}
				
				
			}
			
			for(int i = 0; i < check[end].length(); i++) {
				System.out.print(check[end].charAt(i));
			}
			
			System.out.println();
			
		}
        s.close();
        
    }
    
}