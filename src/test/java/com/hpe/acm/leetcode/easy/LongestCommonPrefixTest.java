package com.hpe.acm.leetcode.easy;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * @author: zhiyuan
 * @date: 2017年10月19日
 * @project: javagee
 * @description:
 */
public class LongestCommonPrefixTest {
    LongestCommonPrefix commonPrefix = new LongestCommonPrefix();

    @Test
    public void testCountAndSay() {
        assertEquals("", commonPrefix.longestCommonPrefix(new String[] { "2222333", "123", }));

        assertEquals("", commonPrefix.longestCommonPrefix(new String[] {}));

        assertEquals("", commonPrefix.longestCommonPrefix(new String[] { "2222333", "", }));
        
        assertEquals("2", commonPrefix.longestCommonPrefix(new String[] { "2222333", "2345", }));
        
        assertEquals("22", commonPrefix.longestCommonPrefix(new String[] { "2222333", "225", }));

    }
}
