package Miscll;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        System.out.println( withoutString("Hello there", "llo"));
       // System.out.println("yak zak --> " + countYZ("yak zak"));
      /*  int[] nums1 = {4,3,2,3,1};
        int[] nums2 = {2,2,5,2,3,6};

        Set<Integer> set1 = new HashSet(Arrays.asList(nums1));
        System.out.println(set1.toString());


        Set<Integer> set2 = Arrays.stream(nums2).boxed().collect(Collectors.toSet());
        System.out.println(set2.toString());*/

       // System.out.println(centeredAverage(new int[]{1, 2, 3, 4, 100}));

    }

    public static String withoutString(String base, String remove) {
        char[] arr = new char[base.length()];
        int count = 0;
        int i = 0;

        while(i <= base.length() - remove.length()) {
            if(base.substring(i, i + remove.length()).toLowerCase().equals(
                    remove.toLowerCase())) {
                i += remove.length();
            } else {
                arr[count] = base.charAt(i);
                count++;
                i++;
            }
        }

        while(i < base.length()) {
            arr[count] = base.charAt(i);
            count++;
            i++;
        }
        //return String.valueOf(arr);
        return new String(arr,0,count);
    }

    public static int centeredAverage(int[] nums) {
        int min= nums[0];
        int max = nums[0];
        int sum = nums[0];
        for(int i=1, count=0; i< nums.length; i++){
            min= Math.min(min,nums[i]);
            max = Math.max(max, nums[i]);
            sum = sum + nums[i];
        }
        sum = (sum - max) - min;
        return sum/nums.length;
    }

    public int countEvens(int[] nums) {
        int evenCount =0;
        for(int i=0; i< nums.length; i++){
            if(nums[i]%2==0)
                evenCount++;
        }
        return evenCount;
    }



    public static int countYZ(String str) {
        int length = str.length();
        int count =0;
        for(int i=0; i<length-1; i++)
        {
            if(!Character.isLetter(str.charAt(i+1)) && (Character.toLowerCase(str.charAt(i)) == 'y' || Character.toLowerCase(str.charAt(i)) == 'z'))
            count++;
        }
        if(Character.toLowerCase(str.charAt(length-1)) == 'y'||
                Character.toLowerCase(str.charAt(length-1)) == 'z')
            count++;
        return count;
    }



    public static int[] findIntersectionValues(int[] nums1, int[] nums2) {
        int[] anwser = new int[2];

        Set<Integer> set1 = new HashSet(Arrays.asList(nums1));
        Set<int[]> set2 = new HashSet<>();
        set2.add(nums1);

        return anwser;
    }

    public static  String repeatEnd(String str, int n) {

        String result = str.substring(str.length()-n);
        while(n>1){
            result += result;
            n--;
        }
        return result;
    }
    public static String mixString(String a, String b) {
        String result = "";

        for(int j =0, i=0;  i<a.length() && i<b.length(); i++){
            result += a.substring(i,i+1);
            result += b.substring(i,i+1);
        }
        return result;
    }
}

