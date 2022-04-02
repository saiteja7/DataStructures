package com.GeekForGeeks;

import java.util.ArrayList;
import java.util.Arrays;

public class CountTripletsSumLessthanGivenNumber {
	public static void main(String[] args) {
		
		long arr[] = {-2, 0, 1, 3};
		
		System.out.println(countTriplets(arr, 4,2));
		
	}
	
	static int countTriplets( long arr[], int n, long  sum)
	{
	  
	  Arrays.sort(arr);
	  int count=0;
	  for(int i=0;i<n-1;i++) {
		  int j=i+1;
		  int k=n-1;
		  while(j<k) {
			  long s =arr[i]+arr[j]+arr[k];
			  if(s>=sum) {
				  k--;
			  }else {
				 count+=(k-j);
				  j++;
			  }
		  }
	  }
	  
	  return count;
	}

}
