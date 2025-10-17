package string_to_integer;

public class Solution {

    public static int myAtoi(String s) {
        s = s.trim();
        if (s.isEmpty()) return 0;
        char first = s.charAt(0);
        int index = 0;
        int sign = 1;
        if (first == '-') {
            sign = -1;
            index = 1;
        } else if (first == '+'){
            index = 1;
        }
        long result = 0;
        for (int i = index; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c >= '0' && c <= '9') {
                // ASCII code of 0 = 48
                result = result * 10 + c - '0';
                if (result * sign > Integer.MAX_VALUE) return Integer.MAX_VALUE;
                if (result * sign < Integer.MIN_VALUE) return Integer.MIN_VALUE;
            } else break;
        }
        return (int) result * sign;
    }


    public static void main(String[] args) {
        System.out.println(myAtoi("42"));
        System.out.println(myAtoi(" -042"));
        System.out.println(myAtoi("1337c0d3"));
        System.out.println(myAtoi("0-1"));
    }
}
