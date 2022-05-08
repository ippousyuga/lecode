package May;
/*
*
* */

import java.util.*;

public class Sum_III {
    public List<List<Integer>> threeSum(int[] nums) {
        HashMap hashmap <Integer, Integer[]> = new HashMap<>();
        for (int i = 0; i < nums.length; i++){
            for (int j = i; j < nums.length; j++){
                int sumII = nums[i] + nums[j];
                int []temp = {i, j, 1};
                if (! hashmap.containsKey(sumII)){
                    hashmap.put(sumII, temp);
                }
                else {
                    sumII[3] += 1;
                    hashmap.put(sumII, temp);
                }
            }
        }
        for (int k =0; j < nums.length; k++){
            int remain = 0 - nums[k];
            if ()
        }
    }
}
