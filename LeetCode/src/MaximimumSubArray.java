
public class MaximimumSubArray {
	public static void main(String[] args) {
		int[] a = {-2,1,-3,4,-1,2,1,-5,4};
		System.out.println(	subArraySum(a));
		
	}
public static int subArraySum(int[] a) {
	
	int maxSum = a[0],sum=a[0];
	
	for (int i = 0; i < a.length; i++) {
		if(sum<0) {
			sum=a[i];
		}else {
			sum=sum+a[i];
		}
		maxSum = Math.max(sum, maxSum);
		
	}

	
	return maxSum;
}
}
