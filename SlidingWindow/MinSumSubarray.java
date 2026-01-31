package SlidingWindow;

public class MinSumSubarray {
    public static void main(String[] args) {
        System.out.println(minSubArrayLen(7, new int[]{2, 3, 1, 2, 4, 3}));
    }
    public static int minSubArrayLen(int target, int[] nums) {
        int left = 0, sum =0;
        int right = 0;
        while( right < nums.length ){
            sum += nums[right];
            while(sum >= target){
                sum -= nums[left];
                left++;
            }
            right++;
        }
        return sum<target ? 0 : right-left+1;
    }
}
