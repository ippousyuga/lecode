package May;

import java.util.*;

public class Top_K_Frequent_Elements {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int num : nums){
            if (hashMap.containsKey(num)) hashMap.replace(num, hashMap.get(num) + 1);
            else hashMap.put(num, 0);
        }
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> hashMap.get(a) - hashMap.get(b));

        for (int key : hashMap.keySet()){
            if (pq.size() < k) pq.offer(key);
            else if (hashMap.get(key) > hashMap.get(pq.peek())){
                pq.poll();
                pq.offer(key);
            }
        }
        int res [] = new int[k];
        for (int i = 0; i < k; i++){
            res[i] = pq.poll();
        }
        return res;
    }
}
