package June;
/*
*429. N 叉树的层序遍历
* List的方便遍历方法：
* for(Type type : list)
* */


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class N_ary_Tree_Level_Order_Traversal {
    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) return result;
        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()){
            List<Integer> temp_list = new ArrayList<>();
            int len = queue.size();
            while (len > 0){
                Node node = queue.poll();
                if (node == null) continue;
                temp_list.add(node.val);
                List<Node> child_list = node.children;
                for (Node child : child_list){
                    queue.offer(child);
                }
                len--;
            }
            result.add(temp_list);
        }
        return result;
    }
}
