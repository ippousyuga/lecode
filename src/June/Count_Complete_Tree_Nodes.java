package June;
/*
* 222. 完全二叉树的节点个数
* 这是当作普通二叉树（非完全二叉树的递归方法
* 折腾的是全局变量这块才能再递归中改变参数值，最后return
* 形参做不到。
* */

public class Count_Complete_Tree_Nodes {
    int count = 0;
    public int countNodes(TreeNode root) {
        if (root == null) return count;
        countchild(root);
        return count;

    }
    public void countchild(TreeNode node){
        if (node == null) return;
        count++;
        countchild(node.left);
        countchild(node.right);
    }
}
