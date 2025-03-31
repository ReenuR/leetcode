package Stack;

import java.util.Stack;

public class RemoveStar {
    public static void main(String[] args) {
        System.out.println(removeStar("abc*de*f"));
    }
    public static String removeStar(String string){
        Stack<Character> stack = new Stack<>();
        for(char ch : string.toCharArray()){
            if((ch =='*') && !stack.isEmpty())
                    stack.pop();
            else
                stack.push(ch);
        }
        StringBuilder stringBuilder =  new StringBuilder();
        while(!stack.isEmpty()){
            stringBuilder.append(stack.pop());
        }
        return stringBuilder.reverse().toString();
    }
}
