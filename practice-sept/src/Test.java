import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class Test {

	public static void main(String[] args) {
		
        String s1 = "Sai";
        String s2 = "ias"; 
        boolean status = true;  
        if (s1.length() != s2.length()) {  
            status = false;  
        } else {  
            char[] arrayS1 = s1.toLowerCase().toCharArray();  
            char[] arrayS2 = s2.toLowerCase().toCharArray();  
            Arrays.sort(arrayS1);  
            Arrays.sort(arrayS2);  
            status = Arrays.equals(arrayS1, arrayS2);  
        }  
        if (status) {  
            System.out.println(s1 + " and " + s2 + " are anagrams");  
        } else {  
            System.out.println(s1 + " and " + s2 + " are not anagrams");  
        }  
	}

}
