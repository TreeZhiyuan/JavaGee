package com.hpe.acm.leetcode;

/**
 * https://leetcode.com/problems/3sum/#/description
 */
import java.util.ArrayList;
import java.util.List;

public class ThreeSum {
	/**
	 * 
	 * @param nums
	 * @return
	 */
	public List<List<Integer>> threeSum(int[] nums) {
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		List<Integer> triplets = new ArrayList<Integer>(3);
		int k = 2, len = nums.length;
		for (int i = 0; i < len - 2; i++) {
			k = i + 2;
			while (k < len) {
				if (nums[i] + nums[i + 1] + nums[k] == 0) {
					triplets.add(nums[i]);
					triplets.add(nums[i + 1]);
					triplets.add(nums[k]);
					result.add(triplets);
					triplets = new ArrayList<Integer>(3);
				}
				k++;
			}
		}
		return result;
	}
}
