package com.hpe.acm.leetcode.easy;

/**
 * @author: zhiyuan
 * @date: 2017年10月28日
 * @project: javagee
 * @description: https://leetcode.com/problems/remove-element/description/
 */
public class RemoveElement {

    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
    }

    public int removeElement(int[] nums, int val) {
        int size = nums.length;
        for (int i = 0; i < nums.length; i++) {
            while (nums[i] == val && i < size) {
                nums[i] = nums[--size];
            }
        }
        return size;
    }

}
