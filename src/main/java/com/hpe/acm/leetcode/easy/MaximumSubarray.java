package com.hpe.acm.leetcode.easy;

/**
 * @author: zhiyuan
 * @date: 2017年10月28日
 * @project: javagee
 * @description: https://leetcode.com/problems/maximum-subarray/description/
 */
public class MaximumSubarray {

    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub

    }

    /**
     * 
     * @param nums
     * @return
     */
    public int maxSubArray(int[] nums) {
        int max = Integer.MIN_VALUE, sum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (sum < 0)
                sum = nums[i];
            else
                sum += nums[i];
            if (sum > max)
                max = sum;
        }
        return max;
    }
}
