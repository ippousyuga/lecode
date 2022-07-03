package July;


import June.TreeNode;
/*
* 617. 合并二叉树
* */

public class Merge_Two_Binary_Trees {
    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        return merge(root1, root2);
    }
    public TreeNode merge(TreeNode root1, TreeNode root2){
        int val = 0;
        TreeNode treeNode = new TreeNode();
        if (root1 == null & root2 == null) return null;

        else if (root1 != null & root2 != null) {
            treeNode.val = root1.val + root2.val;
            treeNode.left = merge(root1.left, root2.left);
            treeNode.right = merge(root1.right, root2.right);
        }
        else if (root1 != null & root2 == null){
            treeNode.val = root1.val;
            treeNode.left = merge(root1.left, null);
            treeNode.right = merge(root1.right, null);
        }
        else if (root1 == null & root2 != null) {
            treeNode.val = root2.val;
            treeNode.left = merge(null, root2.left);
            treeNode.right = merge(null, root2.right);
        }

        return treeNode;
    }
}
