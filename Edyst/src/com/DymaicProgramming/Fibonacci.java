package com.DymaicProgramming;

public class Fibonacci {
	
	public static void main(String[] args) {
		//System.out.println(fib(100));
		System.out.println(fibDP(6));
	}
	
	//using reccursion time O(2^n) and space o(1) and auxilary space O(N) for recurssion
	public static int fib(int n) {
		if(n<=1) {
			return n;
		}
		
		return fib(n-1)+fib(n-2);
	}
	
	
	//using DP time O(n) and space o(N)
	public static int fibDP(int n) {
		int[] result = new int[n+1];
		result[0]=0;
		result[1]=1;
		for(int i=2;i<=n;i++) {
			result[i]=result[i-1]+result[i-2];
		}
		
		return result[n];
		
	}

}
