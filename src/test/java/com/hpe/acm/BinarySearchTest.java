package com.hpe.acm;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class BinarySearchTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		assertEquals("", new BinarySearch().findIndex(new int[] { 1, 2, 3, 4, 6 }, 4), 3);
		assertEquals("", new BinarySearch().findIndex(new int[] { 1, 2, 3, 4, 6 }, 6), 4);
		assertEquals("", new BinarySearch().findIndex(new int[] { 1, 2, 4, 6 }, 5), -1);
		assertEquals("", new BinarySearch().findIndex(new int[] { 5 }, 5), 0);
		assertEquals("", new BinarySearch().findIndex(new int[] { 5, 6 }, 5), 0);
		assertEquals("", new BinarySearch().findIndex(new int[] {}, 5), -1);
	}

	@Test
	public void testGetLowerIndex() {
		assertEquals("", new BinarySearch().findLowerIndex(new int[] { 1, 2, 2, 3, 4, 4, 4, 6 }, 4), 4);
		assertEquals("", new BinarySearch().findLowerIndex(new int[] { 1, 2, 4, 4, 6, 7, 8 }, 4), 2);
		assertEquals("", new BinarySearch().findLowerIndex(new int[] { 1, 2, 4, 6 }, 5), -1);
		assertEquals("", new BinarySearch().findLowerIndex(new int[] { 6, 7 }, 5), -1);
		assertEquals("", new BinarySearch().findLowerIndex(new int[] { 5, 5 }, 5), 0);
		assertEquals("", new BinarySearch().findLowerIndex(new int[] { 5, 6 }, 5), 0);
		assertEquals("", new BinarySearch().findLowerIndex(new int[] {}, 5), -1);
	}

	@Test
	public void testGetHigherIndex() {
		assertEquals("", new BinarySearch().findHigherIndex(new int[] { 1, 2, 2, 3, 4, 4, 4, 6 }, 4), 6);
		assertEquals("", new BinarySearch().findHigherIndex(new int[] { 1, 2, 4, 4, 6, 7, 8 }, 4), 3);
		assertEquals("", new BinarySearch().findHigherIndex(new int[] { 1, 2, 4, 6 }, 5), -1);
		assertEquals("", new BinarySearch().findHigherIndex(new int[] { 6, 7 }, 5), -1);
		assertEquals("", new BinarySearch().findHigherIndex(new int[] { 5, 5 }, 5), 1);
		assertEquals("", new BinarySearch().findHigherIndex(new int[] { 5, 6 }, 5), 0);
		assertEquals("", new BinarySearch().findHigherIndex(new int[] {}, 5), -1);
	}

}
