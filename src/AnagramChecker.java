import java.util.Arrays;

public class AnagramChecker {
    public static void main(String[] args) {
        String str = "reenu";

        char[] charArr = str.toCharArray();

        int[] nums = {19,12,3,44,5};
        String[] names = {"John", "Alice", "Bob", "Eve"};
        Arrays.sort(names);
        Arrays.sort(nums);
        for(int num: nums){
            System.out.print(" " +num);
        }
        System.out.println();
        for (String name: names){
            System.out.print(" "+name);
        }

        String srt = Arrays.toString(nums);
        System.out.println(srt);

    }
   /* public static boolean isAnagram(){

    }*/
}
