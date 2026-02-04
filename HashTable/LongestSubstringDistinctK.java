package HashTable;

import java.util.HashMap;

public class LongestSubstringDistinctK {
    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstringKDistinct("eceba", 2));
    }
    public static int lengthOfLongestSubstringKDistinct(String s, int k) {
        if(k>s.length())
            return 0;
        int maxLen = Integer.MIN_VALUE;
        HashMap<Character, Integer> map = new HashMap<>();

        /*keep adding letters to a window untill its valid(k<=2) the moment its get invalid --> start
        removing from left */
        // condition to check --> hashmap.size() <= k

        for(int left = 0, right = 0; right < s.length(); right++){
            char ch = s.charAt(right);
            map.put(ch, map.getOrDefault(ch,0)+1);

            while(map.size() > k){
                char chLeft = s.charAt(left);
                map.put(chLeft, map.get(chLeft)-1);
                if(map.get(chLeft)==0)
                    map.remove(chLeft);
                left++;
            }
            maxLen = Math.max(maxLen, right-left+1);
        }
        return maxLen==Integer.MAX_VALUE ? 0 : maxLen;
    }
}
