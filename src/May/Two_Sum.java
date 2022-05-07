package May;
import java.util.*;
/*
* 1
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
                result[1] = j;
            }
        }
        return result;
    }
}
