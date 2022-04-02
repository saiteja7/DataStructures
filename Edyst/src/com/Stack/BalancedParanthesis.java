package com.Stack;

import java.util.Stack;

public class BalancedParanthesis {

	public static void main(String[] args) {
		String s = "}{()}})";
		System.out.println(balancedParanthesis(s));
	}

	public static boolean balancedParanthesis(String s) {
		Stack<Character> stack = new Stack<Character>();
		for (Character ch : s.toCharArray()) {
			if (ch == '{' || ch == '(' || ch == '[') {
				stack.push(ch);
			} else {
				if (stack.isEmpty()) {
					return false;
				} else if (ch == ')' && stack.pop() != '(') {
					return false;
				} else if (ch == '}' && stack.pop() != '{') {
					return false;
				} else if (ch == ']' && stack.pop() != '[') {
					return false;
				}
			}
		}

		return true;
	}
}
