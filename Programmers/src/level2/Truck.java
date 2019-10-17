package level2;
import java.util.*;
public class Truck {

	static public int bridge_length(int n) {
		
		if(n == 1) return 2;
		else return 100;

	}
	
	static public int weight(int n) {
		if(n==1) return 10;
		else return 100;
	}
	
	static public int[] trucks(int n) {
		
		int[] a = {7,4,5,6};
		int[] b = {10};
		int[] c = {10,10,10,10,10,10,10,10,10,10};
		
		if(n==1) return a;
		else if(n==2) return b;
		else return c;
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int example = 3;
		
		int len = bridge_length(example);
		int w = weight(example);
		int[] arr = trucks(example);
		
//		for(int i : arr) System.out.print(i + " ");
		
		Queue<Integer> q = new LinkedList<Integer>();
		
		int tw = 0;
		int cnt = 0;
		
		for(int i = 0; i < arr.length; i++) {
			
			int t = arr[i];
			
			if(q.isEmpty()) {
				q.add(arr[i]);
				cnt++;
				tw+=t;
			}
			else {
				
				while(true){
                    
                    if(q.size() == len)
                    {
                        tw-=q.peek();
                        q.remove();
                        
                        
                    }
                    else if(tw + t <= w){
                        tw += t;
                        q.add(t);
                        cnt++;
                        break;
                        
                    }
                    else
                    {
                        q.add(0);
                        cnt++;
                    }
                    
                }
				
			}
			
			
		}
		
		
		System.out.print(cnt + len);
		
	}

}
