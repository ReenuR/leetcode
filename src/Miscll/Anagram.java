package Miscll;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        System.out.println(isAnagram("listen1","silent"));
    }
    public static boolean isAnagram(String s, String t) {
        char[] s1 = s.toCharArray();
        Arrays.sort(s1);
        char[] s2 = t.toCharArray();
        Arrays.sort(s2);
        String sortedS = new String(s1);
        String sortedT = new String(s2);

        return sortedS.equals(sortedT);
    }
}
