import java.util.ArrayList;

public class AddOneNumber {
	
	public static void main(String[] args) {
		ArrayList l = new ArrayList();
		l.add(9);
		l.add(9);
		l.add(9);
	System.out.println(plusOne(l).toString());
//	for (Object a:a1) {
//		System.out.println(a);
//	}
	}

	
	  public static ArrayList<Integer> plusOne(ArrayList<Integer> a) {
	      /* write your solution here */
	       int i = a.size()-1;
	       int carry=1;
		  while(i>=0) {
			 
			  if(a.get(i)==9 && carry ==1) {
				  a.set(i, 0);
				  carry=1;
			  }else {
				a.set(i, a.get(i)+carry);
				carry=0;
			  }
			 i--;
			
		  }
		  if(carry==1) {
			  a.add(0, 1);
		  }
		  while(a.get(0)==0) {
			  a.remove(0);
		  }
		  return a;
	  }
}
