package HashTable;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class MajorityElement {
    public static void main(String[] args) {
        System.out.println(majorityElement(new int[]{3, 3, 4}));
        LinkedHashMap<String, String> linkedHashMap =  new LinkedHashMap<>();
    }
    public static int majorityElement(int[] nums) {

        int majority = nums.length/2;
        int element = 0;

        HashMap<Integer, Integer> map = new HashMap<>();
        for(int num : nums){
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for(Map.Entry<Integer, Integer> entry: map.entrySet()){
            if(entry.getValue() >= majority)
                element = Math.max(element, entry.getKey());
        }

        return element;

    }
}
