
import java.util.*;
public class Temp {

	public static int getBlock(int width, int height){
        int block = 0;
        
        if(width < 2){
            return 0;
        }
        else{
            
            for(int i = 1; i < height * 2; i++){
                if(i * i > width * height){
                    block = i - 1;
                    break;
                }
            }         
        }
        
        return block;
    }
	
	public static void main(String[] args) {
		int answer = 0;
		int w = 6;
		int h = 8;
		
		// h is always longer than w;
		
		int longer = 0;
		int shorter = 0;
		
		if( w > h) {
			int temp = w;
			w = h;
			h = temp;
		}
		
		longer = h;
		shorter = w;
		// h is always longer
		
		int x = longer;
		int y = shorter;
		while(true) {
			
			int remain = longer % shorter;
			if(remain == 0) {
				
				x = shorter;
				y = longer;
				break;
			}
			
			longer = shorter;
			shorter = remain;
		}
		
		System.out.print(longer + " " + shorter);
		
		
//		if(w > h) {
//			int temp = w;
//			w = h;
//			h = temp;
//		}
//		
//		int a = w;
//		int b = h;
//		int remain = 0;
//		
//		if(a < b)
//		{
//			int temp = a;
//			a = b;
//			b = temp;
//			
//		}
//		
//		while(true) {
//			
//			remain = a % b;
//			if(remain == 0) break;
//			
//			a = b;
//			b = remain;
//		}
//		
//		
//		int width = w / b;
//		int height = h / b;
//		
//		int capa = height * width;
//		int numOfBlock = getBlock(width, height);
//		int temp = (w * h) / (capa);
//
//		int capa_sqrt = (int) Math.sqrt(temp);
//
//		answer = (capa * (temp - capa_sqrt) + (numOfBlock * capa_sqrt));
//		System.out.print(answer);
		
	}

}
