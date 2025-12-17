package minimum_operations;

public class Main {
    public static void main(String[] args) {
        System.out.println(minOperations(new int[]{3, 9, 7}, 5));
        System.out.println(minOperations(new int[]{4, 1, 3}, 4));
        System.out.println(minOperations(new int[]{3, 2}, 6));
    }

    public static int minOperations(int[] nums, int k) {
        int sum = 0;
        for (int n : nums) {
            sum += n;
        }
        return sum % k;
    }
}
