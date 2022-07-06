package July;

import June.TreeNode;
/*
* 236. 二叉树的最近公共祖先
* 递归过程
* 如果找到p或q就return 该节点
* 如果最后找到了p和q则return root即为祖先节点
* 如果只找到p或q中的一个，则return left或right即找到p或q的存储节点
* 否则return null
* */

public class Lowest_Common_Ancestor_of_a_Binary_Tree {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null || root == p || root == q){
            return root;
        }
        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);

        if (left == null & right != null) return right;
        else if (left != null & right == null) return left;
        else if(left == null && right == null) return null;
        return root;
    }

}
