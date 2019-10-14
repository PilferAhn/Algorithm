package binaryTree;
import java.util.*;
public class PocketMonster {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n,m;
		Scanner sc = new Scanner(System.in);
		
		n = sc.nextInt();
		m = sc.nextInt();
		
//		
		int index = 1;
		HashMap <Integer,String> map = new HashMap<Integer,String>();
		for(int i = 0; i < n; i++) {
			String monster = sc.next();
			map.put(index++, monster);
		}
		
		for(int i = 0; i < m; i++) {
			
			String temp = sc.next();
			if('0' <= temp.charAt(0) && temp.charAt(0) <= '9') {
				int number = temp.charAt(0) - '0';
				System.out.println(map.get(number-1));
			}
			else {
				
				System.out.println(map.containsValue(temp));
				
			}
				
		}
		
		sc.close();
	}

}
