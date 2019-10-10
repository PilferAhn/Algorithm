package temp;
import java.util.*;
public class Lamda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PriorityQueue<Integer> arr = new PriorityQueue<Integer>((x,y) -> y -x);
		
		arr.add(5);
		arr.add(3);
		arr.add(1);
		arr.add(9);
		
		
		System.out.print(arr.poll());
		

	}

}
