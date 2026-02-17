package minimum_sum_of_four_digits;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(minimumSum(2932));
    }

    public static int minimumSum(int num) {
        int[] arr = new int[4];
        int i = 0;
        while (num > 0) {
            arr[i++] = num % 10;
            num = num / 10;
        }
        Arrays.sort(arr);
        return  arr[0]*10+arr[3] + arr[1]*10+arr[2];
    }
}
