package Stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class RemoveAllAdjacentDuplicatesInString {
    public static void main(String[] args) {
        String s = "abbaca";
        System.out.println("After removal of duplicates: "+removeDuplicates(s));
    }
    public static  String removeDuplicates(String s) {
        Deque<Character> stack = new ArrayDeque<>();

        for(int i = 0; i< s.length(); i++) {
            char curr = s.charAt(i);
            if (!stack.isEmpty() && curr == stack.peek()) {
                stack.pop();
            } else {

                stack.push(curr);
            }
        }
        StringBuilder sb = new StringBuilder();

        while(!stack.isEmpty()){
            sb.append(stack.pop());
        }
        return sb.reverse().toString();
    }
}

