package SlidingWindow;

import java.util.HashMap;
import java.util.Map;

public class LongestRepeatingCharacterReplacement {
    public static void main(String[] args) {
        System.out.println(findLength("aabccbb",2));
    }
    public static int findLength(String str, int k) {
        int maxLength = 0;
        int maxCount = 0;
        Map<Character, Integer> freqMap = new HashMap<>();

        for(int left = 0, right = 0; right < str.length(); right++){
            freqMap.put(str.charAt(right), freqMap.getOrDefault(str.charAt(right),0)+1);

            maxCount = Math.max(maxCount,freqMap.get(str.charAt(right)));

            while((right-left+1)-maxCount > k){
                char ch = str.charAt(left);
                freqMap.put(ch, freqMap.get(ch)-1);
                if(freqMap.get(ch) == 0)
                    freqMap.remove(ch);
                left++;
            }
            maxLength = Math.max(maxLength, right-left +1);
        }


        return maxLength;
    }
}
