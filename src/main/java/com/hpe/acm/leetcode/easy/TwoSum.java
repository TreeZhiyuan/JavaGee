package com.hpe.acm.leetcode.easy;

import java.util.Hashtable;

/**
 * https://leetcode.com/problems/two-sum/#/description
 * 
 * @author cuizh
 *
 */
public class TwoSum {
	/**
	 * 
	 * @param nums
	 * @param target
	 * @return
	 */
	public int[] twoSum(int[] nums, int target) {
		int[] result = null;
		Hashtable<Integer, Integer> table = new Hashtable<Integer, Integer>();
		for (int i = 0, length = nums.length; i < length; i++) {
			if (table.get(target - nums[i]) != null) {
				result = new int[] { table.get(target - nums[i]), i };
				break;
			} else {
				table.put(nums[i], i);
			}
		}
		return result;
	}
}
