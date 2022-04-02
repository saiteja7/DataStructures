import java.security.KeyStore.Entry;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Map;

public class FindDifference {

	public static void main(String[] args) {
	
		String s = "abcde";
	    String  t = "abeecd";
	    System.out.println(findDiff(s, t));

	}
	public static char findDiff(String name,String name2) {
		HashMap<Character,Integer> map = new HashMap<Character,Integer>();
		for(char c: name.toCharArray()) {
			map.put(c, map.getOrDefault(c, 0)+1);
		
			
		}
		
		for(char c: name2.toCharArray()) {
			System.out.println(map.get(c));
		if(map.containsKey(c)&&map.get(c)==0||!map.containsKey(c)) {
			return c;
		}else{
			map.put(c, map.get(c)-1);
		}
			
		}
		
		
		
		return '!';
	}
}
