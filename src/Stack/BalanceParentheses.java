package Stack;

import java.util.Stack;

public class BalanceParentheses {
    public static void main(String[] args) {
        String s = "(())";
        System.out.println(balanceParntehse(s));

    }

    private static boolean balanceParntehse(String str) {
        Stack<Character> stack = new Stack<>();
        for(char ch : str.toCharArray()){
            if(ch=='['|| ch =='{' || ch == '('){
                stack.push(ch);
            }else{
                if(stack.isEmpty())
                    return false;
                char top = stack.pop();
                if(ch == ']' && top!= '[')
                    return false;
                if(ch == '}' && top != '{')
                    return false;
                if(ch == ')' && top != '(')
                    return false;
            }
        }
        return stack.isEmpty();
    }
}
