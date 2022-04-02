package com.GeekForGeeks;

public class ReverseString {

	public static void main(String[] args) {
 String s="i.like.this.program.very.much";
 System.out.println( reverseWords(s));

	}
	
	static String reverseWords(String s)
    {
		String[] s1=s.split("\\.");
		StringBuffer s2 = new StringBuffer("");
		for(int i=s1.length-1;i>=0;i--) {
			if(i!=s1.length-1) {
				s2.append(".");
			}
			
		  s2.append(s1[i]);
		 
		}

		
		return s2.toString();
    }

}
