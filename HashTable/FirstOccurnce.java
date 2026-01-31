package HashTable;

import java.util.HashMap;

public class FirstOccurnce {
    public static void main(String[] args) {
        System.out.println(firstUniqChar("abab"));
    }
    public static int firstUniqChar(String s) {
        // ToDo: Write Your Code Here.
        // I'll create a hashmap of the S with frequency and then scan array with it linearly.

        HashMap<Character, Integer> map = new HashMap<>();
        char[] chArr = s.toCharArray();
        for(char ch:chArr) {
            map.put(ch, map.getOrDefault(map.get(ch),0)+1);
        }
        for(int i = 0; i<chArr.length;i++){
            if(map.get(chArr[i]) == 1){
                return i;
            }
        }

        return -1;
    }
}
