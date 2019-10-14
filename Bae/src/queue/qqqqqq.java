package queue;
import java.util.*;

class Queue{
	
	LinkedList<Integer> arr = new LinkedList<Integer>();
	
	public void push(int x) {
		arr.add(x);
	}
	
	public int pop() {

		if(arr.size() == 0) {
			return -1;
		}
		
		int front = arr.get(0);
		arr.remove(0);
		return front;
	}
	
	public int size() {
		
		return arr.size();
	}
	
	public int empty() {
		if(arr.size() == 0) {
			return 1;
		}
		
		return 0;
	}
	
	public int front() {
		if(arr.size() == 0) {
			return -1;
		}
		
		return arr.get(0);
	}
	
	public int back() {
		if(arr.size() == 0) {
			return -1;
			
		}
		
		return arr.get(arr.size() - 1);
	}
	
};

public class qqqqqq {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Queue q = new Queue();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int i = 0 ; i < n; i++) {
			
			String order = sc.next();
			
			int number = 0;
			if(order.equals("push")) {
				number = sc.nextInt();
				q.push(number);
			}
			else if(order.equals("pop")) {
				System.out.println(q.pop());
			}
			else if(order.equals("size")) {
				System.out.println(q.size());
			}
			else if(order.equals("empty")) {
				System.out.println(q.empty());
			}
			else if(order.equals("front")) {
				System.out.println(q.front());
			}
			else if(order.equals("back")) {
				System.out.println(q.back());
			}
				
			
		}
		
		sc.close();
//		System.out.println();
//		System.out.println();
//		for(int i = 0; i < q.arr.size(); i++) {
//			System.out.print(q.arr.get(i));
//		}
		

	}

}
