
public class LongestPalindrome {
	int resultstart ;
	int resultLength ;

	public static void main(String[] args) {
		LongestPalindrome pal = new LongestPalindrome();
		System.out.println(pal.largestPalindrome("abacde"));

	}

	public String largestPalindrome(String s) {

		for (int start = 0; start < s.length(); start++) {
			expandRange(s, start, start);
			//expandRange(s, start, start + 1);
		}
		//System.out.println(resultstart + " , "+ resultLength);
		System.out.println(s.substring(resultstart, resultstart + resultLength).length());

		return s.substring(resultstart, resultstart + resultLength);

	}

	private void expandRange(String s, int begin, int end) {
		while(begin>=0 && end<s.length() && s.charAt(begin)==s.charAt(end)) {
			end++;
			begin--;
		}
	System.out.println(end + " " + begin);
		
		if(resultLength<end-begin-1) {
			System.out.println( end-begin-1 );
			resultstart = begin+1;
			resultLength = end-begin-1;
		}

	}

}
