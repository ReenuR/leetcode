package Stack;

import java.util.Stack;

public class ReverseAString {
    public static void main(String[] args) {
        System.out.println(reverseString("OpenAI"));
    }
    public static String reverseString(String s) {
        Stack<Character> stack = new Stack<>();
        for (char ch : s.toCharArray())
            stack.push(ch);
        StringBuilder str = new StringBuilder();
        while(!stack.isEmpty()) {
            str.append(stack.pop());
        }
        return str.toString();
    }
}
