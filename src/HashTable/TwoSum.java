package HashTable;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {3,3};
        int target = 6;
        System.out.println(Arrays.toString(twoSum(nums, target)));
    }
    public static int[] twoSum(int[] arr, int target){
        Map<Integer, Integer> map = new HashMap<>();
        for(int i =0 ; i<arr.length; i++){
            map.put(arr[i], i);
        }
        for(int i =0 ; i<arr.length; i++){
            int complement = target - arr[i];
            if(map.containsKey(complement) && map.get(complement) != i){
                return new int[] {i,map.get(complement)};
            }
        }
        return new int[] {0, 0};
    }
}
