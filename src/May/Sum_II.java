package May;
import java.util.*;
/*
* 454.四数相加 II
* 先计算两个数组之和，存入hashmap，key为和值，value为该和的出现次数。
* 计算后两数组之和与0的差值，查询hashmap中是否存在该值，存在则累加该值的value到count。
* */


public class Sum_II {
    public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
        HashMap <Integer, Integer> hashmap = new HashMap<>();
        int count = 0;
        for (int i : nums1){
            for (int j : nums2){
                int temp = i + j;
                if (hashmap.containsKey(temp))
                    hashmap.put(temp, hashmap.get(temp) + 1);
                else hashmap.put(temp, 1);
            }
        }
        for (int i : nums3){
            for (int j : nums4){
                if (hashmap.containsKey(0 - i -j))
                    count += hashmap.get(0 - i -j);
            }
        }
        return count;
    }
}
