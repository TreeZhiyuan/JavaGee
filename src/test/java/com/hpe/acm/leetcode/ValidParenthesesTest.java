package com.hpe.acm.leetcode;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ValidParenthesesTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		assertEquals("", new ValidParentheses().isValid("{()[]{}{}}("), false);
	}

}
