package com.hpe.acm.leetcode.easy;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @author: zhiyuan
 * @date: 2017年10月20日
 * @project: javagee
 * @description: https://leetcode.com/problems/longest-substring-without-repeating-characters/description/
 */
public class LongestNonRepeatedSubstring {

    /**
     * @param args
     */
    public static void main(String[] args) {
        // Queue FIFO
        String str = "adcgdhj";
        ArrayDeque<Character> subStrQueue = new ArrayDeque<Character>();
        for (char a : str.toCharArray()) {
            subStrQueue.push(a);
        }
        System.out.println(subStrQueue);
        subStrQueue.pop();
        System.out.println(subStrQueue);
        subStrQueue.push('V');
        System.out.println(subStrQueue);
        subStrQueue.remove();
        System.out.println(subStrQueue);
        subStrQueue.removeLast();
        System.out.println(subStrQueue);

        List<Character> subStrQueue2 = new LinkedList<Character>();
        for (char a : "ADBSCHTFG".toCharArray()) {
            subStrQueue2.add(a);
        }
        System.out.println(subStrQueue2);
        subStrQueue2 = subStrQueue2.subList(subStrQueue2.indexOf('B') + 1, subStrQueue2.size());
        subStrQueue2.add('B');
        System.out.println(subStrQueue2);
    }

    /**
     * this is my solution which failed to pass leetcode
     *
     * @param s
     *            input parameter
     * @return length of longest substring
     */
    public int lengthOfLongestSubstringFailed(String s) {
        int size = 0;
        List<Character> subStrQueue = new LinkedList<Character>();
        for (char a : s.toCharArray()) {
            if (subStrQueue.contains(a)) {
                subStrQueue = subStrQueue.subList(subStrQueue.indexOf(a) + 1, subStrQueue.size());
            }
            subStrQueue.add(a);
            size = subStrQueue.size() > size ? subStrQueue.size() : size;
        }
        return size;
    }

    /**
     * leetcode accepted solution
     * https://leetcode.com/problems/longest-substring-without-repeating-characters/solution/
     *
     * @param s
     * @return
     */
    public int lengthOfLongestSubstringWithSet(String s) {
        int n = s.length();
        Set<Character> set = new HashSet<Character>();
        int ans = 0, i = 0, j = 0;
        while (i < n && j < n) {
            // try to extend the range [i, j]
            if (!set.contains(s.charAt(j))) {
                set.add(s.charAt(j++));
                ans = Math.max(ans, j - i);
            } else {
                set.remove(s.charAt(i++));
            }
        }
        return ans;
    }

    public int lengthOfLongestSubstring(String s) {
        int n = s.length(), ans = 0;
		Map<Character, Integer> map = new HashMap<Character, Integer>(); // current index of character
        // try to extend the range [i, j]
        for (int j = 0, i = 0; j < n; j++) {
            if (map.containsKey(s.charAt(j))) {
                i = Math.max(map.get(s.charAt(j)), i);
            }
            ans = Math.max(ans, j - i + 1);
            map.put(s.charAt(j), j + 1);
        }
        return ans;
    }

}
