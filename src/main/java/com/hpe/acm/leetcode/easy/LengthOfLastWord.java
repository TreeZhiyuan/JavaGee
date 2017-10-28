package com.hpe.acm.leetcode.easy;

/**
 * @author: zhiyuan
 * @date: 2017年10月28日
 * @project: javagee
 * @description: https://leetcode.com/problems/length-of-last-word/description/
 */
public class LengthOfLastWord {

    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
    }

    /**
     * 
     * @param s
     * @return
     */
    public int lengthOfLastWord(String s) {
        return s.trim().length() - s.trim().lastIndexOf(" ") - 1;
    }

}
