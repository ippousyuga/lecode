package June;
/*
*101. 对称二叉树
* 递归的编写步骤：
* 1、终止条件，左右为空状况与val不等状况。剩余即为左右val相等情况。
* 2、递归参数，左节点的左，右节点的右；左节点的右，右节点的左
* 3、return 的bool值为左右对称的判断
* */
public class Symmetric_Tree {
    public boolean isSymmetric(TreeNode root) {
        return symmetric(root.left, root.right);
    }
    public boolean symmetric(TreeNode left, TreeNode right){
        if (left == null && right != null) return false;
        if (left != null && right == null) return false;
        if (left == null && right == null) return true;
        if (left.val != right.val) return false;
        boolean bool1 = symmetric(left.left, right.right);
        boolean bool2 = symmetric(left.right, right.left);
        return bool1 & bool2;
    }
}
