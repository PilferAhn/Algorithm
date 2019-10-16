package level3;
import java.util.*;
public class ExpressN {

	static ArrayList<Integer> list=new ArrayList<Integer>();
    static int count=0;
    static int minCount=9;
    
    private static void bfs(int N,int number){
    	
    	
        if(count>=minCount)
            return;
        if(list.size()>=minCount)
            return;
        
        int lastNum=(list.size()==0)?0:list.get(list.size()-1);
        
        if(lastNum==number){
        	
        	for(int i = 0 ; i < list.size(); i++) {
        		System.out.print(list.get(i) + " ");
        	}
        	System.out.println();
            minCount=Math.min(count,minCount);
            return;
        }
        
        
        int n=0;
        int addCount=0;
        
        for(int i=1;i<1000000;i*=10){
            addCount++;
            if(count+addCount>=minCount)
                continue;
            n+=(N*i);
            count+=addCount;
            
            // 덧셈
            list.add(lastNum+n);
            bfs(N,number);
            list.remove(list.size()-1);
            
            // 뺄셈
            if(lastNum-n!=0){
                list.add(lastNum-n);
                bfs(N,number);
                list.remove(list.size()-1);
            }
            
            // 곱셈
            list.add(lastNum*n);
            bfs(N,number);
            list.remove(list.size()-1);
            
            // 나눗셈
            if(lastNum/n!=0){
                list.add(lastNum/n);
                bfs(N,number);
                list.remove(list.size()-1);
            }
            count-=addCount;
        }
        return;
    }
    
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int N = 5;
		int number = 12;
	    bfs(N,number);
        System.out.print(minCount<9?minCount:-1); 

	}

}
