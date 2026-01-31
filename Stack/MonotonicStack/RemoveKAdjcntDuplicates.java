package Stack.MonotonicStack;

import java.util.Stack;

public class RemoveKAdjcntDuplicates {
    public static void main(String[] args) {
        System.out.println(removeDuplicates("abbbaaca",3));
    }
    public static String removeDuplicates(String s, int k) {
        Stack<int[]> stack = new Stack<>();
        char[] charArr = s.toCharArray();

        for(char ch: charArr) {
            if (!stack.isEmpty() && stack.peek()[0] == ch && stack.peek()[1] < k)
                stack.peek()[1]++;

            if (!stack.isEmpty() && stack.peek()[1] == k) {
                stack.pop();
            } else {
                stack.push(new int[]{ch, 1});
            }
        }



        StringBuilder sb = new StringBuilder();
        for(int i =0; i<stack.size(); i++){
            sb.append(String.valueOf((char) stack.get(i)[0]).repeat(stack.get(i)[1]));

        }

        return sb.toString();
        }
    }

