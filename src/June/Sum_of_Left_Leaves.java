package June;
/*
* 404. 左叶子之和
* 还是用的全局变量
* 要注意的是终止条件除了code 17外还有code 23（用到嵌套判断
* */
public class Sum_of_Left_Leaves {
    int count = 0;
    public int sumOfLeftLeaves(TreeNode root) {
        if (root.left == null && root.right == null) return 0;
        if (root == null) return 0;
        sumcount(root);
        return count;
    }
    public void sumcount(TreeNode treeNode){

        if (treeNode == null) return;
        if (treeNode.left == null && treeNode.right == null) count += treeNode.val;
        if (treeNode.left != null){
            sumcount(treeNode.left);
        }
        if (treeNode.right != null){
            if (treeNode.right.left == null & treeNode.right.right == null) return;
            sumcount(treeNode.right);
        }


    }
}
