package roman_to_integer;

import java.util.HashMap;

public class Solution {
    public static void main(String[] args) {
        System.out.println(romanToInt("III"));
        System.out.println(romanToInt("LVIII"));
        System.out.println(romanToInt("MCMXCIV"));
        System.out.println(romanToInt("CM"));
    }

    public static int romanToInt(String s) {
        HashMap<Character, Integer> builder = new HashMap<>();
        builder.put('I', 1);
        builder.put('V', 5);
        builder.put('X', 10);
        builder.put('L', 50);
        builder.put('C', 100);
        builder.put('D', 500);
        builder.put('M', 1000);
        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            int current = builder.get(s.charAt(i));
            if (i + 1 < s.length()) {
                int next = builder.get(s.charAt(i + 1));
                if (current < next) {
                    result -= current;
                    continue;
                }
            }
            result += current;
        }

        return result;
    }

}
