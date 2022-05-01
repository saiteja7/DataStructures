
public class RainWaterTrap {
	
	//save max height from starting and ending in two arrays.

	
	public static void main(String[] args) {
		int[] height = {0,1,0,2,1,0,1,3,2,1,2,1};
		
		System.out.println(rainWaterTrap(height));
	}
	
	public static int rainWaterTrap(int[] a) {
		int n =a.length;
		int[] left = new int[n];
		int[] right = new int[n];
		left[0] =a[0];
		for(int i=1;i<n;i++) {
			left[i] = Math.max(left[i-1], a[i]);
		}
		right[n-1] = a[n-1];
		
		for(int i=n-2;i>=0;i--) {
			right[i] = Math.max(right[i+1], a[i]);
		}
		
		int ans=0;
		for(int i =0;i<n;i++) {
			//The max water which can be stores is the min of last height building and the next height building and minus the current heigh
			ans+=(Math.min(left[i], right[i])-a[i]);
		}
		return ans; 
	}
}
