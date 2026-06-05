package SlidingWindow;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class MaxSlidingArray {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(maxSlidingWindow(new int[]{1, 3, -1, -3, 5, 3, 6, 7}, 3)));
    }
    public static int[] maxSlidingWindow(int[] nums, int k) {


        int[] result = new int[nums.length];
        Deque<Integer> deq = new ArrayDeque<>();
        int maxNum = Integer.MIN_VALUE;
        for(int r = 0, l=0, i =0; r<nums.length; r++){


            while(!deq.isEmpty() && deq.getLast()<nums[r]){
                deq.removeLast();
            }
            deq.add(nums[r]);
            if(r >= k-1){
                result[i++] = deq.getFirst();
                if(nums[l] == deq.getFirst())
                    deq.remove(nums[l]);
                l++;
            }
        }
        return result;
    }
}














   /* public static int[] maxSlidingWindow(int[] nums, int k) {
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
}*/
