package Miscll;

import java.util.Arrays;

public class Merge2SortedArray {
    public static void main(String[] args) {
        int nums1[] = {0,0,0,0,0};
        int nums2[] = {1,2,3,4,5};
        merge(nums1, 0, nums2, 5);
        System.out.println(Arrays.toString(nums1));
    }
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        for(int j=0, i = m; j<n; i++, j++){
            nums1[i] = nums2[j];
        }
        if(m==0)
            return;
        for(int i =0 , j= m; i< n; i++){
            if(nums1[i] > nums1[j]){
                int temp = nums1[i];
                nums1[i] = nums1[j];
                nums1[j] = temp;
                j++;
            }

        }
    }
}
