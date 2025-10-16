package zig_zag;

class Solution {
    public static String convert(String s, int numRows) {
        if (numRows == 1) return s;
        StringBuilder[] arr = new StringBuilder[numRows];
        for (int i = 0; i < numRows; i++) arr[i] = new StringBuilder();
        int curRow = 0;
        boolean ball = false;
        for (char c : s.toCharArray()) {
            arr[curRow].append(c);
            if (curRow == 0 || curRow == numRows - 1) ball = !ball;
            curRow += ball ? 1 : -1;
        }
        StringBuilder result = new StringBuilder();
        for (StringBuilder one : arr) {
            result.append(one);
        }
        return result.toString();
    }

    public static void main(String[] args) {
        String text = "PAYPALISHIRING";
        for (int n = 1; n <= 6; n++) {
            System.out.println("n = " + n + "; " + convert(text, n));
        }
    }
}
