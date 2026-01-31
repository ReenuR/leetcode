package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class Palindrome_Queue {
    public static void main(String[] args) {
        System.out.println(checkPalindrome("radar"));
    }
    public static boolean checkPalindrome(String s) {
        Queue<Character> queue= new LinkedList<>();
        s = s.toLowerCase();

        char[] charArray = s.toCharArray();

        for(int i=charArray.length-1; i>=0; i-- ){
            queue.add(charArray[i]);
        }

        StringBuilder sb = new StringBuilder();
        while(!queue.isEmpty()){
            sb.append(String.valueOf(queue.poll()));
        }


        return s.equals(sb.toString());
    }
}

