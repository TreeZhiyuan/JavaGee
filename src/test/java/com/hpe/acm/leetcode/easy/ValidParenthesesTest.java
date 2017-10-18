package com.hpe.acm.leetcode.easy;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.hpe.acm.leetcode.easy.ValidParentheses;

public class ValidParenthesesTest {
    ValidParentheses validParentheses = new ValidParentheses();

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void test() {
        assertEquals("", validParentheses.isValid(""), true);
        assertEquals("", validParentheses.isValid("{)[]{}{}}("), false);
        assertEquals("", validParentheses.isValid("{()[]{}{}}("), false);
        assertEquals("", validParentheses.isValid("{()[]{}{}}"), true);
        assertEquals("", validParentheses.isValid("{()[()]{}}"), true);
    }
}
