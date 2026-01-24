package self_dividing_number;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println(selfDividingNumbers(1, 22));
        System.out.println(selfDividingNumbers(47, 85));
    }

    public static List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> results = new ArrayList<>();
        for (int i = left; i <= right; i++) {
            if (isDivisible(i)) results.add(i);
        }
        return results;
    }

    private static boolean isDivisible(int n) {
        int temp = n;
        while (temp > 0) {
            int q = temp % 10;
            if (q == 0 || n % q != 0)
                return false;
            temp = temp / 10;
        }

        return true;
    }
}
