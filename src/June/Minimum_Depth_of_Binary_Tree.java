package June;

import java.util.LinkedList;
import java.util.Queue;
/*
* 111. 二叉树的最小深度
* 叶子节点为没有左右子节点的节点，所以code 22为&&
* */

public class Minimum_Depth_of_Binary_Tree {
    public int minDepth(TreeNode root) {
        if (root == null) return  0;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        int deep_min = 0;
        while (!queue.isEmpty()){
            deep_min++;
            int len = queue.size();
            while (len > 0){
                TreeNode temp = queue.poll();
                if (temp.left == null && temp.right == null) return deep_min;
                if (temp.left != null) queue.offer(temp.left);
                if (temp.right != null) queue.offer(temp.right);
                len--;
            }
        }
        return deep_min;
    }
}
