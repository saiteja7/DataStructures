package com.DymaicProgramming;


/*
 * Uncertain Steps
Codu is trying to go down stairs from his building to ground floor.

He can go 3 ways:

Walk 1 step at a time.
Extend his legs and go 2 steps at a time.
Jump down 3 steps at a time.
Given n steps, calculate the number of possible ways to reach the ground floor, provided he can jump 3 steps at most once during this process.

That is, he can jump down 3 steps only once, but at any time, if he wishes, while walking down the stairs.

Constraints
1 <= N <= 1000000.
Input Format
Single Integer denoting the number of Steps, N
Output
Number of ways to reach ground floor.
As the number can be huge, give output modulo 1000000007.
Example Input 1
4
Output
7
Explanation
1, 1, 1, 1
1, 2, 1
1, 1, 2
1, 3
2, 1, 1
2, 2
3, 1
Number of ways = 7.

 */
public class UncertainSteps {

	public static void main(String[] args) {
		System.out.println(numberOfSteps(4));
		System.out.println(numberOfSteps2(6));
		
	}
	
	
	public static int numberOfSteps(int n) {
		int[] dp = new int[n+1];
		dp[1] =1;
		dp[2]=2;
		dp[3]=4;
		int count=0;
		for(int i=4;i<=n;i++) {
			if(count<=1) {
				dp[i]=dp[i-1]+dp[i-2]+dp[i-3];
				count++;
			}else {
				dp[i]=dp[i-1]+dp[i-2];
			}
			
		}
		return dp[n];
		
	}
	
	
	//with out if condition
	/*
	 * 7-1=6;
	 * 7-3
	 */
	public static int numberOfSteps2(int n) {
		int[] dp = new int[n+1];
		dp[1] =1; //1-1 //1
		dp[2]=1; //2-1 //1,1
		dp[3]=2;//1,1,1 // 3
		dp[4]=3; //[1,1,1,1],[3,1] 4-1 // 4-3
		dp[5]=5; //5-1 + 5-3 +5-5
		//[1,1,1,1,1], [5]
		for(int i=6;i<=n;i++) {
	
				dp[i]=dp[i-1]+dp[i-3]+dp[i-5];
				
			
		}
		return dp[n];
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
