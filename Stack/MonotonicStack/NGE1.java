package Stack.MonotonicStack;

import java.util.Arrays;

public class NGE1 {
    public static void main(String[] args) {
        int [] nums1 = new int[] {1,3,5,2,4};
        int [] nums2 = new int[] {6,5,4,3,2,1,7};

        System.out.println(Arrays.toString(nextGreaterElement(nums1,nums2)));
    }
    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {

        int[] ans = new int[nums1.length];
        for(int i =0; i<nums1.length; i++){
            int index = findSameNumber(nums1[i], nums2);
            for( int j = index + 1; j <nums2.length ; j++){
                if(nums1[i] < nums2[j]){
                    ans[i] = nums2[j];
                    break;
                }

            }
            if(ans[i] == 0){
                ans[i] = -1;
            }
        }
        return ans;

    }
    public static int findSameNumber(int n, int[] nums2){
        for(int i = 0; i< nums2.length; i++){
            if(nums2[i] == n)
                return i;
        }
        return 0;
    }
}
