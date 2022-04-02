import java.util.Iterator;

public class MaxSteps {

	
	public static void main(String[] args) {
		
		System.out.println(max_steps(3));
		
	}
	
	  public static int max_steps(int A) {
	      /* write your solution here */
		  
		  //int p = 10**9 +7;
		  int steps[] = new int[A+1];
		  steps[0]=0;
		  steps[1]=1;
		  steps[2]=2;
		  for(int i=3;i<A+1;i++) {
			  steps[i] = steps[i-1]+steps[i-2];
		  }
		  for(int i:steps) {
			  System.out.println(i);
		  }
		  return steps[A];
	  }
}
