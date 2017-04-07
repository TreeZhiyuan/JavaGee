/*
 * My solution for test on https://www.codewars.com/kata/broken-sequence/train/java
 * Description: 
 * You have a sequence of positive numbers starting with 1, but one number is missing!
 * Find out the missing number; if the sequence is not broken, you should return 0.
 * Each sequence always increments by 1. 
 * In short: an invalid sequence (a string with non numeric character) must return 1, 
 * an already complete (or empty) sequence must return 0; 
 * a broken sequence with more than one number missing should return the lowest missing number; 
 * otherwise return the missing number.Note that the input may be with random order.
 */
package com.hpe.acm.codewars;

import java.util.Arrays;

public class BrokenSequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}

	/**
	 * sequence of positive numbers
	 * 
	 * @param sequence
	 * @return
	 */
	public int findMissingNumber(String sequence) {
		if (sequence.isEmpty())
			return 0;
		String[] oriStr = sequence.split(" ");
		int[] oriNum = new int[oriStr.length];

		for (int i = 0; i < oriStr.length; ++i) {
			// match one integer or negative integer
			if (!oriStr[i].matches("^-?\\d+$"))
				return 1;
			oriNum[i] = Integer.parseInt(oriStr[i]);
		}

		Arrays.sort(oriNum);
		for (int i = 1; i <= oriNum.length; i++) {
			if (oriNum[i - 1] != i)
				return i;
		}
		return 0;
	}
}
