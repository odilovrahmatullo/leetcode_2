package firstUniqChar;

import java.util.*;

public class Solution {
    public static void main(String[] args) {
//        System.out.println(firstUniqChar("leetcode"));
//        System.out.println(firstUniqChar("aabb"));
//        System.out.println(firstUniqChar("aadadaad"));
        //      System.out.println(firstUniqChar("loveleetcode"));
       // System.out.println(firstUniqChar("aaadd"));
        System.out.println(firstUniqChar("dddccdbba"));
    }

    public static int firstUniqChar(String s) {
        List<Character> chars = new ArrayList<>();
        for (char c : s.toCharArray()) {
            chars.add(c);
        }
        for (int i = 0; i < s.length(); i++) {
            if (!chars.isEmpty()) {
                Character removed = chars.remove(0);
                System.out.println(removed);
                if (chars.contains(removed)) {
                    chars.removeIf(c -> c == removed);
                    System.out.println(Arrays.toString(chars.toArray()));
                } else return i;
            }
        }
        return -1;
    }
}
