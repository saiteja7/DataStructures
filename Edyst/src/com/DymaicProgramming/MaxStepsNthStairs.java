package com.DymaicProgramming;

public class MaxStepsNthStairs {
	
	public static void main(String[] args) {
		System.out.println(maxSteps(2));
	}
	
	public static int maxSteps(int n) {
		int [] dp= new int[n+1];
		dp[0]=0;
		dp[1]=1;
		dp[2]=2;
		for(int i=3;i<=n;i++) {
			dp[i]=dp[i-1]+dp[i-2];
		}
		
		return dp[n];
	}

}
