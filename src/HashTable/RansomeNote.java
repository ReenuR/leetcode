package HashTable;

import java.util.HashMap;

public class RansomeNote {
    public static void main(String[] args) {
        System.out.println(canConstruct("apple", "pale"));
    }
    public static boolean canConstruct(String ransomNote, String magazine) {
        // ToDo: Write Your Code Here.
        if(ransomNote.length() > magazine.length())
            return false;

        HashMap<Character, Integer> ransomeFreq = new HashMap<>();
        HashMap<Character, Integer> magazineFreq = new HashMap<>();

        for(char ch: ransomNote.toCharArray()){
            ransomeFreq.put(ch, ransomeFreq.getOrDefault(ch,0)+1);
        }

        for(char ch: magazine.toCharArray()){
            magazineFreq.put(ch, magazineFreq.getOrDefault(ch,0)+1);
        }

        for(char ch : ransomeFreq.keySet()){
            if(!(magazineFreq.containsKey(ch) && (magazineFreq.get(ch) >= ransomeFreq.get(ch))))
                return false;
        }
        return true;
    }

}
