package May;
import java.util.*;
/*
* 1.两数之和
* 另一种方法：在for循环后直接判断target-nums[i]是否在hashmap中。
* 若不存在，将nums[i]存入hashmap中。
* */

public class Two_Sum {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hashmap = new HashMap<>();
        int [] result = new int[2];
        for (int i = 0; i < nums.length; i++){
            hashmap.put(i, nums[i]);
        }
        for (int j = 0; j < nums.length; j++){
            int temp = target - nums[j];
            result[0] = j;
            hashmap.remove(j);
            if (hashmap.containsValue(temp)){
                for (int value : hashmap.keySet()){
                    if (hashmap.get(value).equals(temp)) {
                        result[1] = value;
                        return result;
                    }
                }
            }
        }
        return result;
    }
}
