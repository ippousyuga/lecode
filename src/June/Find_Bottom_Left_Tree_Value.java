package June;

import java.util.LinkedList;
import java.util.Queue;
/*
* 513. 找树左下角的值
* 用到层次遍历
* 另一种递归，借助全局变量去判断是否最高层是否最左。
* */

public class Find_Bottom_Left_Tree_Value {
    public int findBottomLeftValue(TreeNode root) {
        int ichibanmigi = root.val;
        if (root.left == null & root.right == null) return ichibanmigi;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()){
            int len = queue.size();
            ichibanmigi = queue.peek().val;
            while (len > 0){
                TreeNode node = queue.poll();
                if (node.left != null) queue.offer(node.left);
                if (node.right != null) queue.offer(node.right);
                len--;
            }
        }
        return ichibanmigi;
    }

}
