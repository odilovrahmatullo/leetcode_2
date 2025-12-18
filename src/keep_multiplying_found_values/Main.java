package keep_multiplying_found_values;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println(findFinalValue(new int[]{5, 3, 6, 1, 12}, 3));
        System.out.println(findFinalValue(new int[]{2, 7, 9}, 4));
        //  System.out.println(findFinalValue(new int[]{3, 2}, 6));
    }

    public static int findFinalValue(int[] nums, int original) {
       /* ArrayList<Integer> expired = new ArrayList<>();
        int result = original;
        for (int num : nums) {
            expired.add(num);
            if (num == result) result = 2 * result;
            while (expired.contains(result)) result = 2 * result;
        }
        return result;*/ //uzimni yechimim

        for(int num: nums){
            if(num==original) return findFinalValue(nums, original*2);
        }
        return original;
    }
}
