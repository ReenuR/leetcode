package HashTable;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class NoOfOccurenceOfChar {
    public static void main(String[] args) {
        String s = "abacbbc";
        System.out.println(areOccurrencesEqual(s));
    }
    public static boolean areOccurrencesEqual(String s) {

        char [] charArray = s.toCharArray();
        Map<Character, Integer> freqMap = new HashMap<>();

        for(int i=0; i<charArray.length; i++){
            freqMap.put(charArray[i], freqMap.getOrDefault(charArray[i], 1)+1);
        }

        Collection<Integer> values = freqMap.values();
        int firstValue = values.iterator().next();

        for(int value : values){
            if(value != firstValue)
                return false;
        }
        return true;

    }
}
