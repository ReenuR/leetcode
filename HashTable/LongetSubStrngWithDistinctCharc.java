package HashTable;

import java.util.HashSet;

public class LongetSubStrngWithDistinctCharc {
    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("abcabcbb"));
    }
    public static int lengthOfLongestSubstring(String s) {
        int maxLen = -1;

        HashSet<Character> set = new HashSet<>();
        //add letter to set, keep adding untill u find duplicate.
        for(int l=0, r=0; r<s.length(); r++){

            char ch =s.charAt(r);

            //if duplicate found, start removing charcters from left and store maxLen
            while(set.contains(ch)){
                char chLeft = s.charAt(l);
                set.remove(chLeft);
                l++;
            }
            set.add(ch);
            maxLen = Math.max(maxLen, r-l+1);
        }
        return maxLen;
    }
}
/* if(!set.contains(ch)){
                set.add(ch);
            }
*
* */
