package com.kangfw.dp;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * 无重复字符的最长子串
 *
 * 给定一个字符串，请你找出其中不含有重复字符的 最长子串 的长度。
 *
 * @author kfw
 * @since 2019/3/19 20:10
 */
public class lengthOfLongestSubstring {
    // 滑动窗口
    public int lengthOfLongestSubstring1(String s) {
        int i = 0, j = 0, result = 0;
        Set<Character> temp = new HashSet<>();
        while (i < s.length() && j < s.length()) {
            if (temp.contains(s.charAt(j))) {
                temp.remove(s.charAt(i));
                i++;
            } else {
                temp.add(s.charAt(j++));
                result = Math.max(j - i, result);
            }
        }
        return result;
    }

    // 改进滑动窗口
    public int lengthOfLongestSubstring2(String s) {
        int n = s.length(), ans = 0;
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0, j = 0; j < n ; j++) {
            if (map.containsKey(s.charAt(j))) {
                i = Math.max(map.get(s.charAt(j)), i);
            }
            ans = Math.max(ans, j - i + 1);
            map.put(s.charAt(j), j + 1);
        }
        return ans;
    }
}
