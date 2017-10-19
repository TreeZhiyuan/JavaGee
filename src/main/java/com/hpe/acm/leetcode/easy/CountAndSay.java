package com.hpe.acm.leetcode.easy;

import java.util.Stack;

/**
 * @author zhiyuan
 * @description: https://leetcode.com/problems/count-and-say/description/
 */
public class CountAndSay {
    /**
     * 
     * @param preSay
     * @return
     */
    public String generateSay(String preSay) {
        StringBuilder sb = new StringBuilder();
        Stack<Character> container = new Stack<Character>();
        for (char c : preSay.toCharArray()) {
            if (container.empty()) {
                container.push(c);
            } else {
                if (container.peek() == c) {
                    container.push(c);
                } else {
                    sb.append(container.size() + "" + container.pop().toString());
                    container.clear();
                    container.push(c);
                }
            }
        }
        if (!container.empty()) {
            sb.append(container.size() + "" + container.pop().toString());
        }
        return sb.toString();
    }

    /**
     * 
     * @param n get the nth count and say result
     * @return result
     */
    public String countAndSay(int n) {
        String say = new String();
        if (n == 1) {
            return "1";
        }
        say = generateSay(countAndSay(n - 1));
        return say;
    }
}
