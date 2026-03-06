package intersection_two_array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(intersection2(
                new int[]{1, 2, 2, 1, 3, 4, 5},
                new int[]{2, 2, 3, 3, 3, 3, 3, 5}
        )));
    }

    public static int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        for (Integer num : nums1) {
            set1.add(num);
        }
        Set<Integer> set2 = new HashSet<>();
        for (Integer num : nums2) {
            set2.add(num);
        }
        Set<Integer> resultSet = new HashSet<>();
        for (Integer num : set1) {
            if (set2.contains(num)) resultSet.add(num);
        }
        int[] result = new int[resultSet.size()];
        int i = 0;
        for (Integer num : resultSet) {
            result[i++] = num;
        }
        return result;
    }

    public static int[] intersection2(int[] nums1, int[] nums2) {
        boolean[] bool = new boolean[1001];
        for (int num : nums1) {
            bool[num] = true;
        }
        int index = 0;
        for (int num : nums2) {
            if (bool[num]) {
                nums2[index++] = num;
                bool[num] = false;
            }
        }

        return Arrays.copyOf(nums2, index);
    }

}
