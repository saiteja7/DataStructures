import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.PriorityQueue;

public class FrequencyCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		freqCount("geekk");

	}
	
	public static String freqCount(String s) {
		StringBuilder sb = new StringBuilder();
		HashMap<Character, Integer>  map = new HashMap<Character, Integer>();
			
			for (int j = 0; j < s.length(); j++) {
			map.put(s.charAt(j),map.getOrDefault(s.charAt(j), 0)+1);
				
			}
		PriorityQueue<Character> queue = new PriorityQueue<Character>((a,b)->map.get(b)-map.get(a));
		queue.addAll(map.keySet());
		while (!queue.isEmpty()) {
			char c= queue.poll();
			for (int i = 0; i < map.get(c); i++) {
				sb.append(c);
			}
			
		}
		System.out.println(sb.toString());
		return sb.toString();
			
	}

}
