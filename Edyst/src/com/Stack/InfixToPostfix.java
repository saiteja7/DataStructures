package com.Stack;

import java.util.Stack;

public class InfixToPostfix {

	public static void main(String[] args) {
		String s = "a+(b*d)";

		System.out.println(postfix(s));
	}

	public static String postfix(String s1) {
		Stack<Character> stack = new Stack<Character>();
		String s = "";
		for (int i = 0; i < s1.length(); i++) {
			Character ch = s1.charAt(i);
			if (Character.isAlphabetic(ch)) {
				s += ch;
			} else if (ch == '(') {
				stack.push(ch);
			} else if (ch == ')') {
				while (stack.peek() != '(') {
					s += stack.peek();
					stack.pop();
				}if(!stack.isEmpty()) {
					stack.pop();
				}
			} else {
				while (!stack.isEmpty() && higherPrec(stack.peek()) > higherPrec(ch)) {
					s += stack.pop();
				}
				stack.push(ch);
			}
		}
		while (!stack.isEmpty()) {
			s += stack.pop();
		}

		return s;
	}

	public static int higherPrec(Character ch) {
		if (ch == '^') {
			return 3;
		}
		if (ch == '*' || ch == '/') {
			return 2;
		}
		if (ch == '+' || ch == '-') {
			return 1;
		}
		return -1;
	}
}
