
public class SumQueryImmutable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	int dp[];
	
	public  void  numArray(int[] nums) {
		dp = new int[nums.length];
		dp[0]=0;
		for (int i = 1; i < nums.length; i++) {
			dp[i] =dp[i-1]+nums[i-1]; 
		}
	}
	
	public int sumRange(int i,int j) {
		
		return dp[i+1]-dp[j];
	}

}
