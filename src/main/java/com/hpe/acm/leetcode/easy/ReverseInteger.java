package com.hpe.acm.leetcode.easy;

/**
 * https://leetcode.com/problems/reverse-integer/#/description
 * 
 * @author cuizh
 *
 */
public class ReverseInteger {
	/**
	 * 
	 * @param x
	 * @return
	 */
	public int reverse(int x) {
		// considering the overflow and leading zero situations
		long res = 0;
		while (x != 0) {
			res = res * 10 + x % 10;
			x = x / 10;
		}
		if (res > Integer.MAX_VALUE || res < Integer.MIN_VALUE) {
			res = 0;
		}
		return (int) res;
	}
}
