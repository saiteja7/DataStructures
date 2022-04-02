import java.util.HashSet;

public class LongestSubstring {

	public static void main(String[] args) {
		System.out.println(substring("baababbbb"));
		
	}
	
	public static int substring(String s) {
		int start =0;
		int next =0;
		int max=0;
		HashSet<Character> set =new HashSet<Character>();
		while(next<s.length()) {
			if(!set.contains(s.charAt(next))) {
				set.add(s.charAt(next));
				next++;
				max = Math.max(set.size(), max);	
			}else {
				set.remove(s.charAt(start));
				start++;
			}

		}
		return max;
	}
}
