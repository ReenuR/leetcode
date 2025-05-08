package TwoPointers;

public class ValidPallindromeII {
    public static void main(String[] args) {
        System.out.println(validPalindrome("deeee"));
    }
    public static boolean validPalindrome(String s) {
        int p1 = 0;
        int p2 = s.length()-1;

        while(p1 < p2){
            if(s.charAt(p1) != s.charAt(p2) && p2-p1 >=2){
                return false;
            }
            p1++;
            p2--;
        }
        return true;
    }
}
