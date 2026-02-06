package SlidingWindow;

import java.util.HashMap;
import java.util.Map;

public class Permutation_str1 {
    public static void main(String[] args) {
        System.out.println(checkInclusion(  "ab",  "eidbaooo"));
    }
    public static boolean checkInclusion(String s1, String s2) {

        Map<Character, Integer> freqS2 = new HashMap<>();


        for(int i = 0; i<s2.length(); i++){
            char ch = s2.charAt(i);
            freqS2.put(ch, freqS2.getOrDefault(ch,0)+1);
        }

        for(int i = 0; i<s1.length(); i++){
            char ch = s1.charAt(i);
            if(freqS2.containsKey(ch)){
                freqS2.put(ch, freqS2.get(ch)-1);
                if(freqS2.get(ch) == 0)
                    freqS2.remove(ch);
            }
            else
                return false;
        }
        return true;
    }
}
