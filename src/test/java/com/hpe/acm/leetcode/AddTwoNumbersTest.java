package com.hpe.acm.leetcode;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class AddTwoNumbersTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		AddTwoNumbers addTwoNumbers = new AddTwoNumbers();
		addTwoNumbers.addTwoNumbers(addTwoNumbers.initList(new int[] { 2, 4, 3 }),
				addTwoNumbers.initList(new int[] { 5, 6, 4 }));
	}

	@Test
	public void initListTest() {
		AddTwoNumbers addTwoNumbers = new AddTwoNumbers();
		ListNode l1 = addTwoNumbers.initList(new int[] { 2, 4, 3 });
		ListNode l2 = addTwoNumbers.initList(new int[] { 5, 6, 4 });
	}

}
