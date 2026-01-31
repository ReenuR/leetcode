package Miscll;

import java.util.Arrays;

public class SortColors {
    public static void main(String[] args) {
        int nums[] = {2,0,2,1,1,0};
        sortColors(nums);
        System.out.println(Arrays.toString(nums));
    }
    public static void sortColors(int[] nums) {
        for(int left = 0, right = nums.length-1; left <= nums.length/2 && right>0; )   {
            if(nums[right] == 0 ){
                int temp = nums[right];
                nums[right] = nums[left];
                nums[left] = temp;
                left++;
            }
            if((nums[right] == 1) && nums[left]!=0 ){
                int temp = nums[right];
                nums[right] = nums[left];
                nums[left] = temp;

            }
            right--;
        }
    }
}
