package com.hpe.acm.leetcode.easy;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Hashtable;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.hpe.acm.leetcode.easy.TwoSum;

public class TwoSumTest {
	TwoSum ts;

	@Before
	public void setUp() throws Exception {
		ts = new TwoSum();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testRun() {
		int[] nums = new int[] { 2, 4, 7, 9, 10 }, result;
		int target = 9;

		Hashtable<Integer, Integer> table = new Hashtable<Integer, Integer>();
		for (int i = 0, length = nums.length; i < length; i++) {
			if (table.get(target - nums[i]) != null) {
				result = new int[] { table.get(target - nums[i]), i };
				break;
			} else {
				table.put(nums[i], i);
			}
		}
	}

	@Test
	public void test() {
		assertEquals("", Arrays.equals(ts.twoSum(new int[] { 2, 4, 7, 9, 10 }, 9), new int[] { 0, 2 }), true);
	}

}
