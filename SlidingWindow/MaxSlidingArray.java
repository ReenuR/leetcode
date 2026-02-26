package SlidingWindow;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class MaxSlidingArray {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(maxSlidingWindow(new int[]{1, 3, -1, -3, 5, 3, 6, 7}, 3)));
    }
    public static int[] maxSlidingWindow(int[] nums, int k) {
        Deque<Integer> dq = new ArrayDeque<>();
        int maxArr[] = new int[nums.length-2];
            dq.addFirst(0);
        for(int i =0, right =1; right<nums.length; right++){


            //keep only max or nums which can be max in future in dq;
            if( nums[dq.peekLast()]<nums[right]){
                dq.removeLast();
                dq.addLast(right);
            }



            //valid window formed
            if(right+1 >= k){
                maxArr[i++] = nums[dq.peekFirst()];
            }
        }
        return maxArr;
    }
}
