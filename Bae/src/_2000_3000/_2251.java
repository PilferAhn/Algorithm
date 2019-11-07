package _2000_3000;
import java.util.*;
public class _2251 {
	static int MAX = 201;
	static boolean[][] check = new boolean[MAX][MAX];
	static boolean[] answer = new boolean[MAX];
	static int A,B,C;
	public static void dfs(int a, int b, int c) {
		
		// pure A to B
		// If B maximum capacity exceeds, Cup A can not pure everythings,
		if(a + b > B) dfs(a + b - B, B , 0);
		else dfs(0 , B, C);
		
		// Pure B to A
		if(a+b > A) dfs(A, a + b - A, 0);
		else dfs(A, 0, C);
		
		// Pure C to A
//		if(a + c > A) dfs(A, ,c+a-A)
//		else dfs(a+c, b, 0)
		
		
	}

	public static void main(String[] args) {
		// The Question is incredibly fucking hard to understand shit.
		// Read more than 20 times, still even can not understood. 
		
		int A,B,C;
		Scanner sc = new Scanner(System.in);
		
		A = sc.nextInt();
		B = sc.nextInt();
		C = sc.nextInt();
		
//		System.out.println(a);
//		System.out.println(b);
//		System.out.println(c);

	}

}
