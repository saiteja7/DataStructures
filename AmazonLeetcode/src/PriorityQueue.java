import java.util.Collection;
import java.util.Collections;

public class PriorityQueue {

	
	public static void main(String[] args) {
		int[] nums = {3,2,1,5,6,7,4};
		java.util.PriorityQueue<Integer> q = new java.util.PriorityQueue<>();
		for(int ele: nums) {
			q.add(ele);
			if(q.size()>3) {
				//System.out.println(q.peek());
				q.poll();
			}
	
		}
		System.out.println(q.size());
		System.out.println(q.poll());
		
	}
}
