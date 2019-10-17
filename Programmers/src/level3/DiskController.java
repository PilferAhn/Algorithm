package level3;

import java.util.*;


public class DiskController {
	static int sum = 0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] jobs = {{0, 3}, {1, 9}, {2, 6}};
		
		
        Queue <Integer> pq = new PriorityQueue<Integer>();
        int cnt = 0;
        
        HashMap<Integer,Integer> hash = new HashMap<Integer,Integer>();
        HashMap<Integer,Integer> out = new HashMap<Integer,Integer>();
        for(int i = 0; i < jobs.length; i++){
            int key = jobs[i][0];
            int value = jobs[i][1];
            
            hash.put(key, value);
            out.put(value, key);
        }
        
        
        int second = 0;
        int total = 0;
//        System.out.println(hash.get(cnt));
        
        do {
        	
        	if(cnt < jobs.length) {
//        		time.add(hash.get(cnt));
        		pq.add(hash.get(cnt++));
        	}
        	
        	second++;
        	
        	if(second == pq.peek()) {
//        		System.out.print(out.get(second)+ " ");
        		
        		int current = pq.poll();
        		total += current;
        		sum += total - out.get(second);
        		
//        		System.out.print(sum + " ");
        	
        	}
        	
        	
        	
        	
        }while(!pq.isEmpty());
        
        
        System.out.print(sum / jobs.length);
//        while(cnt++ < tempMax){
//            
//            pq.add(hash.get(cnt));
//            sum += cnt - hash.get(cnt);
//            if(pq.peek() == cnt) {
//            	pq.remove();
//            }
//               // System.out.print(cnt + " ");
//        }
        
        
//        System.out.print(sum);

	}

}
