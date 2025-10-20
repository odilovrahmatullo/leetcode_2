package first_occurence;

public class Solution {
    public static void main(String[] args) {
        System.out.println(strStr("sadbutsad", "sad"));
        System.out.println(strStr("leetcode", "leeto"));
    }

    public static int strStr(String haystack, String needle) {
        int n = needle.length();
        int h = haystack.length();
        for (int i = 0; i <= h - n; i++) {
            String check = haystack.substring(i, i + n);
            if (needle.equals(check)) return i;
        }
        return -1;
    }

}
