import java.util.Arrays;
import java.util.HashSet;

public class LongestWordDictionary {
	public static void main(String[] args) {
		String[] words = {"w","wo","wor","worl", "world"};
		System.out.println(longestWord(words));
	}
	public static String longestWord(String [] words) {
		
		Arrays.sort(words);
		String result = "";
		HashSet<String> set = new HashSet<String>();
		for (String w: words) {
			if(w.length()==1||set.contains(w.substring(0,w.length()-1))) {
				if(w.length()>result.length()) {
					result =w;
				}
				set.add(w);
			}
		}
		return result;
		
		
	}

}
