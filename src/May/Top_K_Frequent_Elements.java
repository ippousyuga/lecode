package May;

import java.util.*;

public class Top_K_Frequent_Elements {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int num : nums){
            if (hashMap.containsKey(num)) hashMap.replace(num, hashMap.get(num) + 1);
            else hashMap.put(num, 0);
        }
        return nums;
    }
}
