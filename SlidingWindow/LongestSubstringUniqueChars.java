package SlidingWindow;

import java.util.HashMap;

public class LongestSubstringUniqueChars {
    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("pwwkew"));
    }
    public static int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer> map = new HashMap<>();

        for(int left = 0, right = 0; right<s.length(); right++){
            char ch = s.charAt(right);

        }
        return map.size();
    }
}
