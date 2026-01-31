package TwoPointers;

import java.util.Arrays;

public class MergeSortedArray {
    public static void main(String[] args) {
        int []nums1 = {0};
        int m = 0, n = 1;
        int [] nums2 = {2};
        merge(nums1,m,nums2,n);
        System.out.println(Arrays.toString(nums1));
    }
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m-1;
        int j = n-1;
        int write = m+n-1;
        while(j >= 0){
            if(i >= 0 && nums1[i] > nums2[j]){
                nums1[write] = nums1[i];
                i--;
            }else{
                nums1[write] = nums2[j];
                j--;
            }
            write--;
        }
    }
}
