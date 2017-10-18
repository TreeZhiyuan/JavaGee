package com.hpe.acm.leetcode;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.hpe.acm.leetcode.easy.ThreeSum;

public class ThreeSumTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		new ThreeSum().threeSum(new int[] { -1, 0, 1, 2, -1, -4 });
		for (char c : "ssss".toCharArray()) {
			System.out.print(c == 's');

		}
	}

}
