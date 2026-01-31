package MediumProblems;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class TopKFrequentElement {
    public static void main(String[] args) {
        int[] result = topKFrequent(new int[] {1,1,1,2,2,3}, 2);
        System.out.println(Arrays.toString(result));
    }
    public static int[] topKFrequent(int[] nums, int k) {
        int[] result = new int[nums.length];
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int num : nums){
            map.put(num, map.getOrDefault(num, 0) +1);
        }

        PriorityQueue<Map.Entry<Integer, Integer>> pq = new PriorityQueue<>((a, b) -> b.getValue() - a.getValue());
        pq.addAll(map.entrySet());

        for(int i =0; i<k; i++){
            result[i] = pq.poll().getKey();

        }
        return  result;
    }
}
