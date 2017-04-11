package com.hpe.acm.leetcode;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class AddTwoNumbersTest {
	AddTwoNumbers addTwoNumbers;

	@Before
	public void setUp() throws Exception {
		addTwoNumbers = new AddTwoNumbers();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		addTwoNumbers.addTwoNumbers(addTwoNumbers.initList(new int[] { 2, 4, 3 }),
				addTwoNumbers.initList(new int[] { 5, 6, 4 }));
	}

	@Test
	public void initListTest() {
		ListNode l1 = addTwoNumbers.initList(new int[] { 2, 4, 3 });
		ListNode l2 = addTwoNumbers.initList(new int[] { 5, 6, 4 });
	}

}
