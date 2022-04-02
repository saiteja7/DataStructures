import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;

public class TopKFrequentElements {
	
	public static void main(String[] args) {
		String[] words = {"i", "love", "leetcode", "i", "love", "coding"};
		int k=2;
		 HashMap<String,Integer> map = new HashMap<String,Integer>();
	     for(String word:words){
	         map.put(word,map.getOrDefault(word,0)+1);
	     }
	     PriorityQueue<String> heap = new PriorityQueue<>(new Comparator<String>(){
	         @Override
	         public int compare(String word1,String word2){
	             int f1 = map.get(word1);
	             int f2 = map.get(word2);
	             if(f1==f2) return word2.compareTo(word1);
	             return f2-f1;
	                 
	         }
	     });
	     System.out.println(map.toString());
	         for(Map.Entry<String,Integer> entry:map.entrySet()){
	             heap.add(entry.getKey());
	         }
	         System.out.println(heap.toString());
//	         while(!heap.isEmpty()){
//	            System.out.println(heap.poll());
//	         }
	         ArrayList list = new ArrayList();
	         while(!heap.isEmpty()){
	        	 
	             if(list.size()>k-1) {
	            	 heap.poll();
	             }else {
	            	 list.add(heap.poll());
	             }
	         }
	   //	Collections.reverse(list);
	   	System.out.println(list.toString());
	 }
}
