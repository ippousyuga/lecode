package June;

import java.util.LinkedList;
import java.util.Queue;
/*
* 559. N 叉树的最大深度
* */

public class Maximum_Depth_of_N_ary_Tree {
    public int maxDepth(Node root) {
        int depth_max = 0;
        if (root == null) return depth_max;
        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()){
            int len = queue.size();
            depth_max++;
            while (len > 0){
                Node temp = queue.poll();
                for (Node node : temp.children){
                    if (node != null) queue.offer(node);
                }
                len--;
            }
        }
        return depth_max;
    }
}
