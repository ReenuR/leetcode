package HashTable;

import java.util.HashMap;

public class LongestRepeatingCharReplacement {
    public static void main(String[] args) {
        System.out.println(characterReplacement("AABABBA", 1));
    }
    public static int characterReplacement(String s, int k) {
        HashMap<Character, Integer> map = new HashMap<>();
        int maxLen = 0, maxFreq = 0;
        for(int l =0, r =0; r<s.length(); r++){

            //adding to window rightmost charcter
            char chRight = s.charAt(r);
            map.put(chRight, map.getOrDefault(chRight, 0)+1);
            maxFreq = Math.max(maxFreq, map.get(chRight));

            while(((r-l+1) - maxFreq) > k){
                //shrink window
                char chLeft = s.charAt(l);
                map.put(chLeft, map.get(chLeft)-1);
                //maxFreq sud be the largest count in map
                maxFreq = 0;
                for(int freq : map.values()){
                    maxFreq = Math.max(maxFreq, freq);
                }
                l++;

            }

            maxLen = Math.max(maxLen, r-l+1);
        }
        return maxLen;
    }
}
