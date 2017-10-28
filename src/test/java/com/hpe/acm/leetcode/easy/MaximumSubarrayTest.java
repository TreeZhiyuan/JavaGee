package com.hpe.acm.leetcode.easy;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * @author: zhiyuan
 * @date: 2017年10月28日
 * @project: javagee
 * @description:
 */
public class MaximumSubarrayTest {
    MaximumSubarray maximumSubarray = new MaximumSubarray();

    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub

    }

    @Test
    public void test() {
        assertEquals("", 6, maximumSubarray.maxSubArray(new int[] { -2, 1, -3, 4, -1, 2, 1, -5, 4 }));
    }

}
