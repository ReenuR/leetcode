package TwoPointers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
    public static void main(String[] args) {
        System.out.println(threeSum(new int[] {-1,0,1,2,-1,-4}));
    }

    public static List<List<Integer>> threeSum(int[] nums) {
            List<List<Integer>> result = new ArrayList<>();
            int left = 1;
            int right = nums.length - 1;
            Arrays.sort(nums);
            for (int i = 0; i < nums.length; i++) {
                int sum = nums[left] + nums[right];
                if (nums[i] == -(sum)) {
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    left++;
                    right--;
                } else if (sum > 0) {
                    left++;
                } else right--;
            }
            return result;

    }
}
