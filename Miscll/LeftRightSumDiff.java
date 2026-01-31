package Miscll;

import java.util.Arrays;

public class LeftRightSumDiff {
    public static void main(String[] args) {
        int[] nums = {3, 3, 3};
        System.out.println(Arrays.toString(findDifferenceArray(nums)));

    }
    public static int[] findDifferenceArray(int[] nums){
        int leftSum =0;
        int rightSum = 0;
        int[] differenceArray = new int[nums.length];

        for(int i=1; i<nums.length; i++){
            rightSum = rightSum + nums[i];
        }

        for(int i =0; i<nums.length; i++){

            differenceArray[i] = Math.abs(leftSum - rightSum);
            leftSum += nums[i];
            if(i==nums.length-1)
                rightSum = 0;
            else
                rightSum -= nums[i+1];

        }

        return differenceArray;
    }
}
