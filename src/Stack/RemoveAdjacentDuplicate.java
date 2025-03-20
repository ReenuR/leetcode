package Stack;

import java.util.Stack;

public class RemoveAdjacentDuplicate {
    public static void main(String[] args) {
        String str = "abbaca";
        System.out.println(removeDuplicates(str));
    }
    public static String removeDuplicates(String str){
        Stack<Character> stack = new Stack<>();
        for(char ch : str.toCharArray()){
            if(stack.isEmpty() || ch != stack.peek())
                stack.push(ch);
            else stack.pop();
        }
        StringBuilder result = new StringBuilder();
        while (!stack.isEmpty()) {
            result.append(stack.pop());
        }
        return result.reverse().toString();
    }
}