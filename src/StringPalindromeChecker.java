public class StringPalindromeChecker {
    public static void main(String[] args) {
        String str = "rerer";
        System.out.println("Is "+ str + " palindronme? " + isPallindrome(str.toLowerCase()));
    }
    public static boolean isPallindrome(String s){
        int i =0;
        while(i < s.length()/2){
            if(s.charAt(i) != s.charAt(s.length()-1-i)){
                return false;
            }
            i++;
        }
        return true;
    }
}
