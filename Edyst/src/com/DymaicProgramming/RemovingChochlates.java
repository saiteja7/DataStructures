package com.DymaicProgramming;


/*
 * A box contains a number of chocolates that can only be removed 1 at a time or 3 at a a time. How many ways can the box be emptied?

The answer can be very large so return it modulo of 10^9+7

For example, there are n = 7 chocolates initially. They can be removed nine ways as follows:
(1,1,1,1,1,1,1)
(1,1,1,1,3)
(1,1,1,3,1)
(1,1,3,1,1)
(1,3,1,1,1)
(3,1,1,1,1)
(1,3,3)
(3,1,3)
(3,3,1)

answer = 9 ways

 */
public class RemovingChochlates {
	public static void main(String[] args) {
		System.out.println(removeChochlates(7));
	}
	
	public static int removeChochlates(int n) {
		int[] result = new int[n+1];
		result[1]=1;
		result[2]=1;
		result[3]=2;
		for(int i=4;i<=n;i++) {
			result[i]=result[i-1]+result[i-3];
		}
		
		return result[n];
		
	}

}
