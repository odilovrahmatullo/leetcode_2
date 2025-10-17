package longest_palindromic_substring;

public class Solution {
    public static void main(String[] args) {
        System.out.println(longestPalindrome("babad"));
        System.out.println(longestPalindrome("cbbd"));
        System.out.println(longestPalindrome("babadada"));
    }

    static class Result {
        int maxLength = 0;
        int start = 0;
        int end = 0;
    }

    public static String longestPalindrome(String s) {
        if (s.length() <= 1) return s;
        int n = s.length();
        Result result = new Result();

        for (int i = 0; i < n - 1; ++i) {
            calculate(i, i, n, s, result);
        }
        for (int i = 0; i < n - 1; ++i) {
            calculate(i, i+1, n, s, result);
        }
        return s.substring(result.start, result.end + 1);
    }

    private static void calculate(int leftIndex, int rightIndex, int n, String s, Result result) {
        while (leftIndex >= 0 && rightIndex < n) {
            if (s.charAt(leftIndex) == s.charAt(rightIndex)) {
                leftIndex--;
                rightIndex++;
            } else break;
        }
        int length = rightIndex - leftIndex - 1;
        if (length > result.maxLength) {
            result.maxLength = length;
            result.start = leftIndex + 1;
            result.end = rightIndex - 1;
        }
    }
}
