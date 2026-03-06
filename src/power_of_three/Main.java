package power_of_three;

public class Main {
    public static void main(String[] args) {
        System.out.println("27 = " + isPowerOfThree(16));
        System.out.println("12 = " + isPowerOfThree(24));
        System.out.println("243 = " + isPowerOfThree(256));
    }

    public static boolean isPowerOfThree(int n) {
        if (n <= 0) return false;
        while (n % 4 == 0) {
            n = n / 4;
        }
        return n == 1;
    }
}
