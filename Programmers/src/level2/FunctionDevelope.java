package level2;
import java.util.*;
public class FunctionDevelope {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int[] pregresses = {93,30,55};
		int[] speeds = {1,30,5};	
		Queue<Integer> q = new LinkedList<Integer>();
		ArrayList<Integer> arr = new ArrayList<Integer>();
		
		int index = 0;
		int counter = 0;
		
		while(index < pregresses.length) {
			int pop = 0;
			for(int i = 0; i < pregresses.length;i++) {
				pregresses[i]+= speeds[i];
			}
			
			
			while(index < pregresses.length && pregresses[index] >= 100) {
				index++;
				pop++;
			}
			
			if(pop!=0) {
				arr.add(pop);
			}
		}
		
		for(int i = 0; i < arr.size(); i++) {
			System.out.print(arr.get(i) + " ");
		}
		
	}

}
