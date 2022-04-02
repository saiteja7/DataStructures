package com.GeekForGeeks;

import java.util.ArrayList;
import java.util.Arrays;

public class CountTriplets {

	public static void main(String[] args) {
		int a[] = {1, 5, 3, 2};
		
		System.out.println(countTriplet(a, 4));

	}
	
	  static int countTriplet(int arr[], int n) {
		
		  Arrays.sort(arr);
	
		  
		 int count=0;

		 for(int i=n-1;i>=2;i--) {
			  int l =0;
			  int r = i-1;
			  while(l<r) {
				 if(arr[l]+arr[r]==arr[i]) {
					 count++;
					 l++;
					 r--;
				 }else if(arr[l]+arr[r]<arr[i]) {
					 l++;
				 }else {
					 r--;
				 }
			  }
			 
		 }
		 
		  
		return count;
	        // code here
	    } 

}
