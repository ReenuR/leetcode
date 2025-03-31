package Stack;

import java.util.Stack;

public class MakeStringGreat {
    public static void main(String[] args) {
        System.out.println(makeStringGreat("AaBbCcDdEeff"));
    }
    public static String makeStringGreat(String str){
        Stack<Character> stack = new Stack<>();
        for(char ch : str.toCharArray()){
            if(stack.isEmpty())
                stack.push(ch);
           else if(!stack.isEmpty() && Math.abs(ch - stack.peek()) == 32)
                stack.pop();
             else stack.push(ch);
        }
        StringBuilder sb = new StringBuilder();
        for (char c : stack) {
            sb.append(c);
        }

        // Convert the StringBuilder to a string and return the result.
        return sb.toString();
    }
}
