package com.hpe.acm.leetcode;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class PalindromeNumberTest {
	PalindromeNumber palindromeNumber;

	@Before
	public void setUp() throws Exception {
		palindromeNumber = new PalindromeNumber();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testRun() {
	}

	@Test
	public void test() {
		assertEquals("", palindromeNumber.isPalindrome(-2147447412), false);
		assertEquals("", palindromeNumber.isPalindrome(1534236469), false);
		assertEquals("", palindromeNumber.isPalindrome(4), true);
		assertEquals("", palindromeNumber.isPalindrome(-0), true);
	}

}
