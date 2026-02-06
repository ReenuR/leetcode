package HashTable;

import java.util.HashSet;

public class HappyNumber {
    public static void main(String[] args) {
        System.out.println(isHappy(2));
    }
    public static boolean isHappy(int n) {
        HashSet<Integer> seen = new HashSet<>();
        int sq = 0;
        while(n!=1){
            if(seen.contains(n)) return false;
            seen.add(n);

            while(n>0){
                int digit = n%10;
                sq = digit*digit;
                n = n/10;
            }
            n = sq;
        }
        return true;
    }
}
