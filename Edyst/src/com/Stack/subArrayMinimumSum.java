package com.Stack;

import java.util.Arrays;

public class subArrayMinimumSum {

	public static void main(String[] args) {
		int a[] = {3,1,2,4};
		sum(a);
		
	}
	public static Integer sum(int[] a) {
		
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length;j++) {
				System.out.println("array is ,"+a[i]+","+a[j]);
			
			}
		}
		return 0;
	}
	 public static int[] subArray(int[] array, int beg, int end) {
	        return Arrays.copyOfRange(array, beg, end + 1);
	    }
}
