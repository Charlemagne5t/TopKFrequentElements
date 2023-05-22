package org.example;

import java.util.*;

public class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int x: nums) {
            if(!map.containsKey(x)){
                map.put(x, 1);
            }else {
               int newValue = map.get(x) + 1;
               map.put(x, newValue);
            }
        }

        int[] result =  new int[k];

        Comparator<Map.Entry<Integer, Integer>> comparator = Comparator.comparingInt(Map.Entry::getValue);
        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(map.entrySet().stream().toList());
        Collections.sort(list, comparator);
        for (int i = 0; i < k; i++) {
            result[i] = list.get(list.size() - 1 - i).getKey();
        }
        return result;
    }
}
