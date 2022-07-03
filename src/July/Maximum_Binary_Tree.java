package July;

import June.TreeNode;

import java.util.Arrays;
/*
* 654. 最大二叉树
* */

public class Maximum_Binary_Tree {
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        return construct(nums);
    }
    public TreeNode construct(int[] nums){
        if (nums.length == 0) return null;
        int max = nums[0];
        int max_index = 0;
        for (int i = 0; i < nums.length; i++){
            if (nums[i] > max) {
                max = nums[i];
                max_index = i;
            }
        }
        TreeNode treeNode = new TreeNode(max);
        int[] left_child  = Arrays.copyOfRange(nums, 0, max_index);
        int[] right_child = Arrays.copyOfRange(nums, max_index + 1, nums.length);
        treeNode.left = construct(left_child);
        treeNode.right = construct(right_child);
        return treeNode;

    }

}
