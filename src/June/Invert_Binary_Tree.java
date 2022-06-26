package June;
/*
* 226. 翻转二叉树
*
* */

public class Invert_Binary_Tree {
    public TreeNode invertTree(TreeNode root) {
        if (root == null) return root;
        binary(root);
        return root;
    }
    public void binary(TreeNode treeNode){
        if (treeNode == null) return;
        TreeNode temp = treeNode.left;
        treeNode.left = treeNode.right;
        treeNode.right = temp;
        binary(treeNode.left);
        binary(treeNode.right);
    }
}
