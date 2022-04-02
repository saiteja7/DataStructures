//import java.util.PriorityQueue;
//
//public class LaregestElementKArray {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		int[] a = {3,2,1,5,6,4};
//		
//		System.out.println(usingQueue(a, 2));
//
//	}
//	
//
//	public static int usingQueue(int[] a , int k) {
//		PriorityQueue<Integer> minheap = new PriorityQueue<Integer>((a,b)->
//        
//         map.get(b)-map.get(a));
//		
//		PriorityQueue<Integer> minheap = new PriorityQueue<Integer>();
//		
//		for (int i = 0; i < a.length; i++) {
//			System.out.println("Adding "+a[i]);
//		minheap.add(a[i]);
//		if(minheap.size()>k) {
//			System.out.println("Removing " + minheap.peek());
//			minheap.poll();
//		}
//		}
//		System.out.println(minheap);
//		
//		return minheap.poll();
//		
//	}
//
//}
