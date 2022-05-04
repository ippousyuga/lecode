package May;
import java.util.*;
/*
* 349.两个数组的交集
* HashSet的应用，该数据结构不允许集合中出现重复元素，仅存储对象。
* hashmap的containKey方法查询是否存在该key值。
* hashset的.add方法增加元素，.size方法获取长度。
* 迭代器Iterator获取哈希数据结构的键值或对象，用next完成遍历。
* */

public class Intersection_of_Two_Arrays {
    public int[] intersection(int[] nums1, int[] nums2) {
    Map<Integer, Integer> map = new HashMap<>();
    Set<Integer> set = new HashSet<>();
    for (int i = 0; i < nums1.length; i++){
        map.put(nums1[i], i);
    }
    for (int j = 0; j < nums2.length; j++){
        if (map.containsKey(nums2[j])){
            set.add(nums2[j]);
        }
    }
    int [] result = new int [set.size()];
    int setsize = set.size();
    Iterator iterator = set.iterator();
    for (int x = 0; x < setsize; x++){
        result[x] = (int)iterator.next();
    }
    return result;
}
}
