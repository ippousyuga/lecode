package July;

import June.TreeNode;

import java.util.ArrayList;
import java.util.List;
/*
*98. 验证二叉搜索树
* 思路：用主序遍历的数组应该是递增的
* */

public class Validate_Binary_Search_Tree {
    List<Integer> inorder_list = new ArrayList();
    public boolean isValidBST(TreeNode root) {
        if (root == null) return false;
        inorder(root);
        for (int i = 1; i < inorder_list.size(); i++){
            if (inorder_list.get(i) > inorder_list.get(i - 1)) continue;
            else if (inorder_list.get(i) <= inorder_list.get(i - 1)) return false;
        }
        return true;
    }
    public void inorder(TreeNode root){
        if (root == null) return;
        inorder(root.left);
        inorder_list.add(root.val);
        inorder(root.right);
    }
}
