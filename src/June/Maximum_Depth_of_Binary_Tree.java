package June;

import java.util.LinkedList;
import java.util.Queue;
/*
* 104. 二叉树的最大深度
* 层次遍历二叉树，每层存到队列中
* 每层在队列不为空时 层数加1
* */

public class Maximum_Depth_of_Binary_Tree {
    public int maxDepth(TreeNode root) {
        if (root == null) return 0;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        int deep = 0;
        while (!queue.isEmpty()){
            deep++;
            int len = queue.size();
            while (len > 0){
                TreeNode temp = queue.poll();
                if (temp == null) continue;
                if (temp.left != null) queue.offer(temp.left);
                if (temp.right != null) queue.offer(temp.right);
                len--;
            }
        }
        return deep;
    }
}
