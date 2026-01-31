package SlidingWindow;

public class MaxSumDistintSubArrayK {
    public static void main(String[] args) {
        System.out.println(maximumSubarraySum(new int []{1,5,4,2,9,9,9}, 3));
    }
    public static long maximumSubarraySum(int[] nums, int k) {
        //HashSet<Integer> set = new HashSet<>();
        int left =0;
        int right =0;
        int sum = 0;
        int maxSum = 0;
        for(right = 0,left = 0; right<nums.length; right++){
            sum += nums[right];
            if(right>0 && nums[right]==nums[right-1]){
                sum = 0;
            }
            if(right>=k-1){
                maxSum = Math.max(maxSum, sum);
                sum-= nums[left];
                left++;
            }
        }
        return maxSum;
    }
}
