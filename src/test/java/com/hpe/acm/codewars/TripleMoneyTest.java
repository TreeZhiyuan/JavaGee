package com.hpe.acm.codewars;

import org.junit.Test;

import junit.framework.TestCase;

public class TripleMoneyTest extends TestCase {

	public TripleMoneyTest(String name) {
		super(name);
	}

	protected void setUp() throws Exception {
		super.setUp();
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}

	@Test
	public void test() {
		System.out.println("Fixed Tests calculateYears");
		assertEquals(3, TripleMoney.calculateYears(1000, 0.05, 0.18, 1100));
		assertEquals(14, TripleMoney.calculateYears(1000, 0.01625, 0.18, 1200));
		assertEquals(0, TripleMoney.calculateYears(1000, 0.05, 0.18, 1000));
	}

}
