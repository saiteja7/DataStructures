package com.HashMap;

import java.util.ArrayList;
import java.util.HashMap;

public class PairsOfSum {

	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4, 5, 6, 7, 7, 7, 8 };
		System.out.println(getTargetSumPairs(a, 8));

	}
//use it only when the given is sorted 
	public static Integer pairs(int[] a, int target) {

		int count = 0;
		int start = 0;
		int end = a.length - 1;
		while (start < end ) {
			if (a[start] + a[end] == target) {
				count++;
		
				System.out.println("pairs are " +a[start] + ","+ a[end]);
				end--;
			}

			else if (a[start] + a[end] < target) {
				start++;
				
			}
			else if (a[start] + a[end] > target) {
				end--;
			
			}
			
			
		}

		return count;
	}
	
    public static int getTargetSumPairs(int[] nums, int target) {
    	int count=0;
    	HashMap< Integer, Integer> map = new HashMap();
    	for(int i=0;i<nums.length;i++) {
    		//{2,2,2,7,7,11,15}
    		int complement = target - nums[i];
    		if(map.containsKey(complement)) {
    			count+=map.get(complement);
    		}
    		if(map.containsKey(nums[i])) {
    			map.put(nums[i], map.get(nums[i])+1);
    		}else {
    			map.put(nums[i], 1);
    		}
    	}
    	
    	return count;
    }
}
