package com.hpe.acm.leetcode.easy;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.hpe.acm.leetcode.easy.ReverseInteger;

public class ReverseIntegerTest {
	ReverseInteger reverseInteger;

	@Before
	public void setUp() throws Exception {
		reverseInteger = new ReverseInteger();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testRun() {
		int x = -1234;
		long res = 0;
		while (x != 0) {
			res = res * 10 + x % 10;
			x = x / 10;
		}
		if (res > Integer.MAX_VALUE || res < Integer.MIN_VALUE) {
			res = 0;
		}
	}

	@Test
	public void test() {
		assertEquals("", reverseInteger.reverse(123), 321);
		assertEquals("", reverseInteger.reverse(-123), -321);
		assertEquals("", reverseInteger.reverse(99599), 99599);
		assertEquals("", reverseInteger.reverse(-9959), -9599);
		assertEquals("", reverseInteger.reverse(0), 0);
		assertEquals("", reverseInteger.reverse(1534236469), 0);
	}

}
