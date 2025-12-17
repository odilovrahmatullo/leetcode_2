import java.util.ArrayList;
import java.util.List;

public class DailySolution2 {
    public static void main(String[] args) {
        System.out.println(prefixesDivBy5(new int[]{0, 1, 1}));
     //   System.out.println(prefixesDivBy5(new int[]{1, 1, 1}));
    }

    public static List<Boolean> prefixesDivBy5(int[] nums) {
        List<Boolean> results = new ArrayList<>();
        StringBuilder number = new StringBuilder();
        for (int num : nums) {
            number.append(num);
            results.add(to10(number));
        }
        return results;
    }

    private static Boolean to10(StringBuilder nums) {
        double sum = 0;
        int last = nums.length() - 1;
        for (double i = 0; i < nums.length(); i++) {
            int ch = nums.charAt(last)-48;
            System.out.println(ch);
            sum += Math.pow(2,i)*ch;
            System.out.println(sum);
            last--;
        }
        return sum % 5 == 0;
    }

}
