package June;
/*
*112. 路径总和
* */

public class Path_Sum {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null) return false;
        int sum = 0;
        return PathCheck(root, targetSum, sum);
    }
    public boolean PathCheck(TreeNode treeNode, int target, int sum){
        if (treeNode == null) return false;
        sum += treeNode.val;
        if (sum == target & treeNode.left == null & treeNode.right == null) return true;
        return PathCheck(treeNode.left, target, sum) || PathCheck(treeNode.right, target, sum);
    }

}
