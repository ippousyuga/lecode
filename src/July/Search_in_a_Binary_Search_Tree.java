package July;

import June.TreeNode;
/*
* 700. 二叉搜索树中的搜索
* */

public class Search_in_a_Binary_Search_Tree {
    public TreeNode searchBST(TreeNode root, int val) {
        if (root == null) return null;
        else if (root.val == val) return root;
        else if (root.val > val) return searchBST(root.left, val);
        else if (root.val < val) return searchBST(root.right, val);
        return null;
    }
}
