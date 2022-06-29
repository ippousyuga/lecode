package June;
/*
* 110. 平衡二叉树
* 递归思路：
* 1、终止条件 root == null
* 2、单次递归：左节点、右节点，左节点和右节点不满足平衡返回-1
* 如果满足平衡返回左子树和右子树两者中的最深层数再+1，作为当前递归root的代表深度
* 如果不满足平衡（左-右的绝对值 大于1） 返回 -1
* */

public class Balanced_Binary_Tree {
    public boolean isBalanced(TreeNode root) {
        return banlanced(root)  != -1;

    }
    public int banlanced(TreeNode root){
        if (root == null) return 0;
        int left_len = banlanced(root.left);
        if (left_len == -1) return -1;
        int right_len = banlanced(root.right);
        if (right_len == -1) return -1;
        int result = 0;
        if (Math.abs(left_len - right_len) > 1) result = -1;
        if (Math.abs(left_len - right_len) <= 1) result = 1 + Math.max(left_len, right_len);
        return result;
    }
}
