package com.greatlearning.ques1;

import java.util.Stack;

public class BalancingBracket {

	// function to check if brackets are balanced
	static boolean areBracketsBalanced(String expression) {

		Stack<Character> stack = new Stack<Character>();
		for (int i = 0; i < expression.length(); i++) {
			char x = expression.charAt(i);
			if (x == '(' || x == '[' || x == '{') {
				stack.push(x);
				continue;
			}
			if (stack.isEmpty())
				return false;
			char check;
			switch (x) {
			case ')':
				check = stack.pop();
				if (check == '{' || check == '[')
					return false;
				break;

			case '}':
				check = stack.pop();
				if (check == '(' || check == '[')
					return false;
				break;

			case ']':
				check = stack.pop();
				if (check == '(' || check == '{')
					return false;
				break;
			}
		}
		return (stack.isEmpty());
	}
}
