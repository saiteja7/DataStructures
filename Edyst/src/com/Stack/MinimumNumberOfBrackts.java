package com.Stack;

import java.util.Stack;

public class MinimumNumberOfBrackts {
	public static void main(String[] args) {
		String s = "())";
		System.out.println(minNumberString(s));
		System.out.println(usingStack(s));

	}
	
	//o(n) time and o(1) space
	public static int minNumberString(String s) {
		//(()
		int open = 0;
		int close = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '(') {
				close++;
			} else if (close > 0) {

				close--;
			} else {
				open++;
			}

		}
		return open + close;

	}
	
	
	//o(n) time and o(n) space
	public static int usingStack(String s) {
		Stack<Character> stack =new Stack<Character>();
		int minNumber=s.length();
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '(') {
				stack.add(s.charAt(i));
			}else if(s.charAt(i)==')') {
				if(!stack.isEmpty() && stack.peek()=='(') {
					minNumber-=2;
				stack.pop();
				}
			}
			
	

	}
		return minNumber;
	}}
