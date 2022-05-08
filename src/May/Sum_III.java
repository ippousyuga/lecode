package May;
/*
*15.三数之和
* 重点是result中的三元组不能重复
* 用hash没想出来。
* 先排序数组，
* 每一层for循环后left = i + 1， right = nums.length - 1，
* 计算sum，sum < 0，left++，sum > 0，right--
* 去重思路：三元组每次移动时，判断是否跟前序元素相同，相同则跳出。
* */

import java.lang.reflect.Array;
import java.util.*;

public class Sum_III {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List <List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < nums.length; i++){
            // 排序之后如果第一个元素已经大于零，那么不可能凑成三元组
            if (nums[i] > 0) {
                break;
            }
            if (i > 0 && nums[i] == nums[i - 1]) { //三元组元素a去重
                continue;
            }
            int left = i + 1;
            int right = nums.length - 1;
            while (left < right){
                int sum = nums[i] + nums[left] + nums[right];
                if (sum > 0){
                    right --;
                }
                else if (sum < 0){
                    left++;
                }
                else {
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    while (left < right && nums[left] == nums[left + 1]) left++;
                    while (left < right && nums[right] == nums[right - 1]) right--;
                    left++;
                    right--;
                }
            }

            }
        return result;
    }
}
