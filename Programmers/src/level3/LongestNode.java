package level3;
import java.util.*;
public class LongestNode {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//[[3, 6], [4, 3], [3, 2], [1, 3], [1, 2], [2, 4], [5, 2]]
		int answer = 0;
		int[][] edges = {{3,6}, {4,3}, {3,2}, {1,3}, {1,2}, {2,4}, {5,2}};
		int n = 6;
		
		ArrayList<Integer>[] tree = (ArrayList<Integer>[]) new ArrayList[n+1];
		int[] distance = new int[n+1];
		
		int max = 0;
		Queue <Integer> q = new LinkedList<Integer>();
		boolean check[] = new boolean[n+1];
		
		for(int i = 1; i <= n; i++) {
			tree[i] = new ArrayList<>();
		}
		
		for(int i = 0; i < edges.length; i++) {
			tree[edges[i][0]].add(edges[i][1]);
			tree[edges[i][1]].add(edges[i][0]);
		}
		
//		for(int temp : tree[2]) System.out.print(temp + " ");
//		System.out.println();
//		
//		
//		for(int temp : tree[3]) System.out.print(temp + " ");
//		System.out.println();
		
		q.add(1); 
		check[1] = true; 
		distance[1] = 0;
		
		while(!q.isEmpty()) {
			int temp = q.remove();
			
			for(int node : tree[temp]) {
				if(check[node] == false) {
					q.add(node);
					System.out.print(node + " ");
					check[node] = true;
					distance[node] += distance[temp] + 1;
//					System.out.println(node + " 의 거리는 " + distance[node]);
					max = Math.max(distance[node], max);
				}
			}
		}
		
		
//		for(int i = 1 ; i <= 6; i++) {
//			for(int temp : tree[i] ) System.out.print("Node " + i + " == " +temp + " ");
//			System.out.println();
//		}
		
		for(int depth : distance) {
			if(depth == max) answer ++;
		}
		
//		System.out.print(answer);
		
	}
}
	
