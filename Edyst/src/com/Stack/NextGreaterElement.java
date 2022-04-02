package com.Stack;

import java.util.ArrayList;
import java.util.Stack;

public class NextGreaterElement {
	
	public static void main(String[] args) {
		int a[]= {4,5,26,25};
		int b[] = NGE1(a);
		for(int i=0;i<b.length;i++) {
			System.out.println(b[i]);
		}
		
	}
	
	public static int[] NGE1(int a[]){
		
		int ans[] = new int[a.length];
		Stack<Integer> stack = new Stack<Integer>();

		for(int i=a.length-1;i>=0;i--) {
			while(!stack.isEmpty()&& stack.peek()<=a[i]) {
				stack.pop();
			}
			if(stack.isEmpty()) {
				ans[i]=-1;
			}else{
				ans[i]=stack.peek();
			}
			stack.push(a[i]);
		}
		
		
		return ans;
	}
	
	public static int[] NGE2(int a[]){
		
		int ans[] = new int[a.length];
		int n = a.length;
		Stack<Integer> stack = new Stack<Integer>();
		for(int i=2*a.length-1;i>=0;i--) {
			while(!stack.isEmpty()&& stack.peek()<=a[i%n]) {
				stack.pop();
			}
			if(i<n) {
				if(stack.isEmpty()) {
					ans[i]=-1;
				}else{
					ans[i]=stack.peek();
				}
			
			}
			stack.push(a[i%n]);
		}
		
		
		return ans;
	}

}
