package SlidingWindow;

public class MaximumSumSubarraySizeK {
    public static void main(String[] args) {
        int[] array = {2, 3};
        System.out.println(maxSumSubarray(array, 3));
    }
    public static int maxSumSubarray(int[] arr, int k){
        int maxSum = 0;
        int sum = 0;
        for(int left = 0, right = 0; right< arr.length; right++){
            sum += arr[right];
            if(right - left + 1 > k){
                sum -= arr[left];
                left++;
            }
            maxSum = Math.max(maxSum, sum);
        }
        return maxSum;
    }
}
