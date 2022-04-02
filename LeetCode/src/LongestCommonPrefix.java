import java.util.HashMap;
import java.util.PriorityQueue;

public class LongestCommonPrefix {

	public static void main(String[] args) {
		String s = "test";
		String[] a = {"flower","flow","flight"};
		prefix(a);

	}
	
	public static String prefix(String[] s) {
		String prefix = s[0];
		for (int i = 1; i < s.length; i++) {
			while(s[i].indexOf(prefix)!=0) {
				System.out.println(s[i]);
				
				prefix = prefix.substring(0, prefix.length()-1);
			}
		}
	
		System.out.println(prefix);
		return prefix;
	}

}
