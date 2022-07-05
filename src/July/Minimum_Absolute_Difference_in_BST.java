package July;

import June.TreeNode;

import java.util.ArrayList;
import java.util.List;
/*
* 530. 二叉搜索树的最小绝对差
* */

public class Minimum_Absolute_Difference_in_BST {
    List<Integer> inorder_val = new ArrayList<>();
    public int getMinimumDifference(TreeNode root) {
        if (root == null) return 0;
        inorder(root);
        int difference = inorder_val.get(1) - inorder_val.get(0);
        for (int i = 0; i < inorder_val.size() - 1; i++){
            if (inorder_val.get(i + 1) - inorder_val.get(i) < difference)
                difference = inorder_val.get(i + 1) - inorder_val.get(i);
            }
        return difference;
    }
    public void inorder(TreeNode treeNode){
        if (treeNode == null) return;
        inorder(treeNode.left);
        inorder_val.add(treeNode.val);
        inorder(treeNode.right);
    }
}
