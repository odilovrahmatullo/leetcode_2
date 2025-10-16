public class Main {
    public static void main(String[] args) {
        int[] nums = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        System.out.println((twoSum(nums)));
    }


    private static int twoSum(int[] height) {
        int result = 0;
        int firstIndex = 0;
        int lastIndex = height.length - 1;
        for (int i = 0; i < height.length; i++) {
            int firstValue = height[firstIndex];
            int lastValue = height[lastIndex];
            int sum = Math.min(lastValue, firstValue) * (lastIndex - firstIndex);
            if (sum > result) result = sum;
            if (firstValue < lastValue) firstIndex++;
            else lastIndex--;
        }
        return result;
    }

}