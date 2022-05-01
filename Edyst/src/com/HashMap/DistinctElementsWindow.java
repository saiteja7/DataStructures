package com.HashMap;

import java.util.ArrayList;
import java.util.HashMap;

public class DistinctElementsWindow {
	
	public static void main(String[] args) {
		int [] a= {1, 2, 1, 3, 4, 3};
		System.out.println(distinctElements(a, 3));
	}

	public static int distinctElements(int[] nums,int k){
		HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
		ArrayList list = new ArrayList();
	
		for(int i=0;i<k;i++) {
			map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
		}
		list.add(map.size());
		for(int i=k;i<nums.length;i++) {
			if(map.get(nums[i-k])==1) {
				map.remove(nums[i-k]);
			}else {
				map.put(nums[i-k], map.get(nums[i-k])-1);
			}
			map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
			list.add(map.size());
			
		}
		System.out.println(list);
		return 0;
		
	}
}
