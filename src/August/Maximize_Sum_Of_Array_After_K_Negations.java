package August;

import java.util.Arrays;
/*
* 1005. K 次取反后最大化的数组和
* 先排序，在k值内将所有负值置正
* k的余值用来置换最小的正数或最大的负数
* */

public class Maximize_Sum_Of_Array_After_K_Negations {
    public int largestSumAfterKNegations(int[] nums, int k) {
        Arrays.sort(nums);
        int remain = 0;
        for (int i = 0; i < k; i++){
            if (i > nums.length - 1){
                if ((k - i) % 2 == 1) nums[i - 1] = -nums[i - 1];
                break;
            }
            if (nums[i] < 0) nums[i] = -nums[i];
            else if (nums[i] >= 0) {
                if ((k - i) % 2 == 1) {
                    if (i == 0) nums[i] = -nums[i];
                    else if (i > 0 & Math.abs(nums[i]) < nums[i - 1])
                    nums[i] = -nums[i];
                    else nums[i - 1] = - nums [i - 1];
                }
                break;
            }
        }
        return Arrays.stream(nums).sum();
    }
}
