import java.util.Stack;

public class Solution {
    public static void main(String[] args) {
        System.out.println(longestValidParentheses("(()")); //2
        System.out.println(longestValidParentheses(")()())")); //4
        System.out.println(longestValidParentheses("()(()"));//2
        System.out.println(longestValidParentheses("(()())"));///6
        System.out.println(longestValidParentheses("()(())"));//6
    }

    public static int longestValidParentheses(String s) {
        Stack<Character> stacks = new Stack<>();
        int count = 0;
        for (char ch : s.toCharArray()) {
            if (ch == '(') stacks.push(')');
            else if (!stacks.isEmpty()){
                count++;
                stacks.pop();
            }
            //  if(!stacks.isEmpty()) count--;
        }
        return count * 2;
    }
}


