package com.hpe.acm.leetcode.easy;

import java.util.Stack;

/**
 * https://leetcode.com/problems/valid-parentheses/#/description
 * 
 * @author cuizh
 *
 */
public class ValidParentheses {
	public boolean isValid(String s) {
		Stack<Character> stack = new Stack<Character>();
		for (char c : s.toCharArray()) {
			switch (c) {
			case ')':
				stack.push(c);
				break;
			case '}':
			case ']':

			default:
				if (stack.isEmpty() || stack.pop() != c) {
					return false;
				}
			}
		}
		return stack.isEmpty();
	}
}
