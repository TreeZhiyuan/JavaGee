package com.hpe.datest;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * @author: zhiyuan
 * @date: 2018-03-29
 * @project: javagee
 * @description:
 */

public class StringTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		String str2 = new String("str") + new String("01");
		str2.intern();
		String str1 = "str01";
		assertEquals(true, str2 == str1);
	}

	@Test
	public void test2() {
		String str2 = new String("str") + new String("01");
		String str1 = "str01";
		str2.intern();
		assertEquals(false, str2 == str1);
	}
	
	@Test
	public void test3() {
		String s1 = "abc"; 
		String s2 = "abc"; 
		assertEquals(true, s2 == s1);
	}

}
