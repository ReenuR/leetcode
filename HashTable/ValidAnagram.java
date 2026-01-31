package HashTable;

public class ValidAnagram {
    public static void main(String[] args) {
        System.out.println(isAnagram("rat", "car"));
    }
    public static boolean isAnagram(String s, String t) {
        if(s.length() != t.length())
            return false;

        char ch;
        int[] freqArray = new int[26];
        char[] sArray = s.toCharArray();
        char[] tArray = t.toCharArray();
        for(int i=0; i<sArray.length; i++){
            ch = sArray[i];
            freqArray[ch-'a']++;
        }
        for(int i = 0; i<tArray.length; i++){
            ch = tArray[i];
            if(--freqArray[ch-'a'] < 0)
                return false;
        }

        return true;
    }
}
