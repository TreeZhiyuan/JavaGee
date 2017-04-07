package com.hpe.acm.codewars;

import junit.framework.TestCase;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class BrokenSequenceTest extends TestCase {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test1() {
		assertEquals("", 4, new BrokenSequence().findMissingNumber("1 2 3 5"));
	}

	@Test
	public void test2() {
		assertEquals("", 2, new BrokenSequence().findMissingNumber("1 3"));
	}

	@Test
	public void test3() {
		assertEquals("", 0, new BrokenSequence().findMissingNumber(""));
	}

	@Test
	public void test4() {
		assertEquals("", 1, new BrokenSequence().findMissingNumber("2 1 4 3 a"));
		assertEquals("", 0,
				new BrokenSequence()
						.findMissingNumber("1 2 4 3 5 6 7 8 9 10 11 12 13"));
	}
}
