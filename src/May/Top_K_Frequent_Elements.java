package May;
import java.util.*;
/*
* 先用hash存放数值-次数
* 新建优先级队列，按值 Value 升序排的初始化方法为code 16
* 入队时会判断与队内元素大小，确保对内为升序
* 判断当前循环value值大于对头value ，队头出队，循环key入队
* */

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
