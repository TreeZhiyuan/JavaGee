package com.hpe.acm.leetcode.easy;

public class PalindromeNumber {
	/**
	 * solution whether an integer is a palindrome number. Do this without extra
	 * space. Reverse it, if equal to previous returns true else return false
	 * negative numbers are not palindrome number
	 * 
	 * @param x
	 * @return
	 */
	public boolean isPalindrome(int x) {
		if (x < 0) {
			return false;
		}
		long res = 0, pre = x;
		while (x != 0) {
			res = res * 10 + x % 10;
			x = x / 10;
		}
		return res == pre;
	}
}
