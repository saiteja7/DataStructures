import java.util.HashMap;
import java.util.HashSet;

public class FirstUniqueCharacter {

	public static void main(String[] args) {
		
		System.out.println(firstUnique("loveleetcode"));

	}
public static int firstUnique(String name) {
	for(int i=0;i<name.length();i++) {
		boolean seen = false;
		for(int j=0;j<name.length();j++) {
			if(name.charAt(i)==name.charAt(j)&&(i!=j)) {
				
				seen =true;
				break;
				
			}
			
		}
		if(!seen) return i;
		
	}
	
	
	return '_';
}
}
