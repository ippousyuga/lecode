package September;

import java.util.ArrayList;
import java.util.List;
/*
* 46.全排列
* 回溯算法
* 用类的数据成员存放每次遍历的路径以及最后的总结果
* 设置数组used代表该次遍历及回溯过程 当前节点是否再路径中
* 当前节点进入路径则used置1，回溯过程中used置0
* 回溯时要移除当前路径最后一个节点，list.remove(list.length - 1)
* 在总结果插入时，要新建list把path的值放进去，否则path值改变总结过存放的path全部改变。
* */

public class Permutations {
    List<List<Integer>> res = new ArrayList<>();
    List<Integer> path = new ArrayList<>();
    int used [];
    public List<List<Integer>> permute(int[] nums) {
        used = new int[nums.length];
        permuteHelp(nums);
        return res;
    }
    public void permuteHelp(int[] nums){
        if (path.size() == nums.length){
            res.add(new ArrayList<>(path));
            return;
        }
        for (int i = 0; i < nums.length; i++){
            if (used[i] == 1) continue;
            used[i] = 1;
            path.add(nums[i]);
            permuteHelp(nums);
            path.remove(path.size() - 1);
            used[i] = 0;
        }
    }

    public static void main(String[] args) {
        Permutations permutations = new Permutations();
        permutations.permute(new int[]{1, 2, 3});
    }
}
