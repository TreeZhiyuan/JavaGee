package com.hpe.acm.leetcode;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CountAndSayTest {
    CountAndSay countAndSay = new CountAndSay();

    /**
     *  1. 1
     *  2. 11
     *  3. 21
     *  4. 1211
     *  5. 111221
     *  6. 312211
     */
    @Test
    public void testGenerateSay() {
        assertEquals("111221",countAndSay.generateSay("1211"));
    }
    
    @Test
    public void testCountAndSay() {
        assertEquals("1", countAndSay.countAndSay(1));
        assertEquals("11", countAndSay.countAndSay(2));
        assertEquals("21", countAndSay.countAndSay(3));
        assertEquals("1211", countAndSay.countAndSay(4));
        assertEquals("111221", countAndSay.countAndSay(5));
        assertEquals("312211", countAndSay.countAndSay(6));
    }
}
