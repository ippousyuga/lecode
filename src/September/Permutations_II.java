package September;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/*
* 47. 全排列 II
* 回溯算法
* 跟全排列I相似，需要先对数组进行排序，然后在同层内看是否上次回溯过该值若回溯过就continue
* 即增加p19\p29\p30即可
* */

public class Permutations_II {
    List<Integer> path = new ArrayList<>();
    List<List<Integer>> res = new ArrayList<>();
    int used[];
    public List<List<Integer>> permuteUnique(int[] nums) {
        used = new int[nums.length];
        Arrays.sort(nums);
        backTrack(nums);
        return res;
    }
    public void backTrack(int[] nums){
        if (path.size() == nums.length){
            res.add(new ArrayList<>(path));
            return;
        }
        for (int i = 0; i < nums.length; i++){
            if (i > 0 && nums[i - 1] == nums [i] && used[i - 1] == 1) continue;
            if (used[i] == 0){
                used[i] = 1;
                path.add(nums[i]);
                backTrack(nums);
                path.remove(path.size() - 1);
                used[i] = 0;
            }
        }
    }
}
