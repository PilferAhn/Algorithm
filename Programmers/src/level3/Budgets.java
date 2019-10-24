package level3;

public class Budgets {
	static int answer = 0;
	public static void Bsearch(int start, int end, int[] budgets, int M) {
		
		
		if(start >= end) return ;
		
		int mid = (start + end) / 2;
		
		int sum = 0;
		for(int budget : budgets) {
			
			if(budget > mid) {
				sum += mid;
			}
			else {
				sum += budget;
				
			}
			
		}
		
		if(sum > M) {
			end = mid - 1;
		}
		else {
			start = mid + 1;
			answer = mid;
		}
		
		Bsearch(start, end, budgets, M);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] budgets = {120, 110, 140, 150};
		int M = 485;

		int end = 0;
		for(int i : budgets) end = Math.max(end, i);
		
		int start = 1;
		
		Bsearch(start, end, budgets, M);
		System.out.print(answer);
	}

}

/*
 * class Solution {
    
    
    public int solution(int[] budgets, int M) {
        int answer = 0;
        
        int start = 1;
        int end = 0;
        for(int budget : budgets){
            if(budget > end){
                end = budget;
            }
        }
        
        while(start<=end){
            int mid = (start + end) / 2;
            int sum = 0;
            for(int i = 0 ; i < budgets.length; i++){
                if(budgets[i] <= mid){
                    sum += budgets[i];
                }
                else{
                    sum += mid;
                }
            }
            
            if(sum <= M){
                answer = mid;
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }
        return answer;
    }
}
 * */
