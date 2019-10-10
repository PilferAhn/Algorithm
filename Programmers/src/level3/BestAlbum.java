package level3;
import java.util.*;
public class BestAlbum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap <Integer, Integer> playMap = new HashMap<Integer,Integer>();
        HashMap <Integer, String> genreMap = new HashMap<Integer, String>();
		
		String[] genres = {"classic", "pop", "classic", "classic", "pop"};
		int[] plays = {500,600,150,800,2500};
		
		
		for(int i = 0; i < genres.length; i++){
            // key value
            genreMap.put(i, genres[i]);
            playMap.put(i, plays[i]);
        }
        
        // for(int i = 0; i < genreMap.size(); i++){
        //     System.out.print(genreMap.get(i) + " ");
        //     System.out.print(playMap.get(i) + " ");
        // }
        
        HashSet<String> genreSet = new HashSet<String>();
        for(int i = 0; i < genres.length; i ++){
            genreSet.add(genres[i]);
        }
        
        HashMap<Integer, String> totalPlay = new HashMap<Integer, String>();
        
        // for(String genre : genreSet){
        //     System.out.print(genre + " ");
        // }
        
        for(String genre : genreSet){
            int tempCount = 0;
            for(int i = 0; i < genreMap.size();i++){
                if(genre.equals(genreMap.get(i))){
                    tempCount += playMap.get(i);
                }
            }
            totalPlay.put(tempCount, genre);
        }
        
        TreeMap sort = new TreeMap(totalPlay);
        String[] genreSort = new String[genreSet.size()];
        int index = 0;
        for(Object o : sort.keySet()){
        	genreSort[index++] = sort.get(o).toString(); 
        	// class pop order
        }
        
        ArrayList<Integer> arr = new ArrayList<Integer>();
        for(int i = genreSort.length-1; i >= 0; i--){
            int count = 0;
            
            for(int p1 : genreMap.keySet()){
                if(genreSort[i].equals(genreMap.get(p1))){
//                    System.out.print(p1 + " ");
                	count++;
                }
            }
            
            System.out.println(count);
            
            int[] temp = new int[count];
            int cnt = 0;
//            for(int )
            
        }

	}

}
