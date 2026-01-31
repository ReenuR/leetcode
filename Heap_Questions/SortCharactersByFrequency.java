package Heap_Questions;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class SortCharactersByFrequency {
    public static void main(String[] args) {
        System.out.println(frequencySort("tree"));
    }
    public static String frequencySort(String s) {

        if(s.length() < 2){
            return s;
        }

        StringBuilder result = new StringBuilder();

        HashMap<Character, Integer> freq = new HashMap<>();
        for(char ch : s.toCharArray()){
            freq.put(ch, freq.getOrDefault(ch, 0) + 1);
        }

        PriorityQueue<Map.Entry<Character, Integer>> pq = new PriorityQueue<>
                ((a, b) -> b.getValue().compareTo(a.getValue()));

        pq.addAll(freq.entrySet());

        while(!pq.isEmpty()){
            char ch = pq.peek().getKey();
            int frequency = pq.poll().getValue();

            while(frequency>0){
                result.append(Character.toString(ch));
                frequency--;

            }

        }

        return result.toString();

    }
}
