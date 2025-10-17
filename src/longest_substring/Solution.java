package longest_substring;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("abcabcbb"));
        System.out.println(lengthOfLongestSubstring("bbbbb"));
        System.out.println(lengthOfLongestSubstring("pwwkew"));

    }

    public static int lengthOfLongestSubstring(String s) {
        int start = 0;
        int end = 0;
        int result = 0;
        List<Character> chars = new ArrayList<>();
        while (end < s.length()) {
            Character one = s.charAt(end);
            if (!chars.contains(one)) {
                chars.add(one);
                end++;
                if (result < chars.size()) {
                    result = chars.size();
                }
            } else {
                chars.remove(Character.valueOf(s.charAt(start)));
                start++;
            }
        }
        return result;
    }

}
