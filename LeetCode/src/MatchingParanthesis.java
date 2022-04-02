import java.util.Stack;

public class MatchingParanthesis {

	public static void main(String[] args) {
		
		String s = "({(})";
		System.out.println(paranthesisCheck(s));

	}

	
	public static boolean paranthesisCheck(String s) {
		Stack<Character> stack = new Stack<Character>();
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if(c =='(' || c== '{' || c =='[') {
				stack.add(c);
				
			}else {
				if(stack.empty()) {
					return false;
				}else {
					if(c==')'&&stack.pop()!='(') {
						return false;
					}else if(c=='}'&&stack.pop()!='{') {
						return false;
					}else if(c==']'&&stack.pop()!='[') {
						return false;
					}
				}
			}
			
		}
		
		return stack.isEmpty()?true:false;
	}
}
