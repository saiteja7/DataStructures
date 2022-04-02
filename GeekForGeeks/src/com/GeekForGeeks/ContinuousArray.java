
package com.GeekForGeeks;

import java.util.ArrayList;

public class ContinuousArray {

	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 7, 5 };
		
		System.out.println(subarraySum(a, 5, 3));

	}

	static ArrayList<Integer> subarraySum(int[] a, int n, int s) {
		int sum = 0;
		int start = 1;
		int i = 0;
		boolean found=false;
		while (i <= n - 1) {
			sum += a[i];
			if (sum == s) {
				found=true;
				break;
			}
			if (sum > s) {
			start++;
			sum=0;
			i=start-1;
			}else {
				i++;
			}
		}
		ArrayList list = new ArrayList();
		if(found) {
			list.add(start);
			list.add(i);
		}else {
			list.add(-1);
		}
	
		return list;
	}
}
