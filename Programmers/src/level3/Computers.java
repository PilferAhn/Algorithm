package level3;

public class Computers {

	static int answer = 0;
	static boolean[] visited = new boolean[201];
	
	public static void dfs(int[][] computers, boolean[] visited, int current) {
		
		visited[current] = true;
		
		for(int i = 0; i < computers.length; i++) {
			
			if(computers[current][i] == 1 && !visited[i]) {
				dfs(computers, visited, i);
			}
			
		}
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int[][] computers = {{1, 1, 0}, {1, 1, 0}, {0, 0, 1}};	
		int len = computers.length;
		
		for(int i = 0; i < len; i++) {
			if(visited[i] == false) {
				dfs(computers, visited, i);
				System.out.print(i + " ");
				answer++;
				
			}
		}
		
		
	}

}
