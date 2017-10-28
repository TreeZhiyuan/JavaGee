package com.hpe.acm.leetcode.easy;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * @author: zhiyuan
 * @date: 2017年10月20日
 * @project: javagee
 * @description:
 */
public class LongestNonRepeatedSubstringTest {

    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        String s = "东方\u0041\u00DF\u6771\ud801\uDC00";  
        for(int i = 0; i < s.length(); i++) {  
            System.out.println(s.charAt(i));
        }
        System.out.println("--------------");
        for(char c: s.toCharArray()) {
            System.out.println(c);
        }
    }

    LongestNonRepeatedSubstring lss = new LongestNonRepeatedSubstring();

    @Test
    public void test() {
        assertEquals("", 2, lss.lengthOfLongestSubstring("aac"));
        assertEquals("", 1, lss.lengthOfLongestSubstring("cccc"));
        assertEquals("", 4, lss.lengthOfLongestSubstring("abcadd"));
        assertEquals("", 6, lss.lengthOfLongestSubstring("dbcvracadd"));
        assertEquals("", 0, lss.lengthOfLongestSubstring(""));
        assertEquals("", 4, lss.lengthOfLongestSubstring("abcdd"));
        assertEquals("", 3, lss.lengthOfLongestSubstring("pwwkew"));
    }

}
