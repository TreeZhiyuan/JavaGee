package com.hpe.acm.leetcode.easy;

/**
 * @author: zhiyuan
 * @date: 2017年10月19日
 * @project: javagee
 * @description: https://leetcode.com/problems/longest-common-prefix/description/
 */
public class LongestCommonPrefix {
    public static void main(String[] args) {
        String firstString = "蒋辽werr";
        for (int j = 0; j < firstString.length(); j++) {
            // System.out.println(firstString.charAt(j));
            System.out.println(firstString.substring(0, j) + ">" + j);
        }
    }

    /**
     * get the longest common prefix string amongst an array of strings
     * 
     * @param strs
     * @return
     */
    public String longestCommonPrefix(String[] strs) {
        String commonPrefix = "";
        if (strs.length == 0) {
            return commonPrefix;
        }
        String firstString = strs[0];
        for (int j = 0; j < firstString.length(); j++) {
            boolean hasCommonPrefix = true;
            for (int i = 1; i < strs.length; i++) {
                if (!strs[i].startsWith(firstString.substring(0, j + 1))) {
                    hasCommonPrefix = false;
                    break;
                }
            }
            if (hasCommonPrefix) {
                commonPrefix = firstString.substring(0, j + 1);
            }
        }
        return commonPrefix;
    }
}
