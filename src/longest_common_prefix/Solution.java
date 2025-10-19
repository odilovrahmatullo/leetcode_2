package longest_common_prefix;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        System.out.println(longestCommonPrefix(new String[]{"salom", "salyut", "salkam"}));
        System.out.println(longestCommonPrefix(new String[]{"flower","flow","flight"}));
        System.out.println(longestCommonPrefix(new String[]{"dog","racecar","car"}));


    }

    public static String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        StringBuilder result = new StringBuilder();
        int i = 0;
        String firstValue = strs[0];
        String lastValue = strs[strs.length - 1];
        while (i < firstValue.length() && i < lastValue.length()) {
            if(firstValue.charAt(i)!=lastValue.charAt(i)){
                break;
            }
            result.append(firstValue.charAt(i));
            i++;
        }
        return result.toString();
    }
}
