package June;
import java.util.*;
/*
* 107. 二叉树的层序遍历 II
* */

public class Binary_Tree_Level_Order_Traversal_II {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> list = new ArrayList<>();
        Queue <TreeNode> queue = new LinkedList<TreeNode>();
        if (root == null) return list;
        int len = 1;
        queue.offer(root);
        while (!queue.isEmpty()){
            int child_len = 0;
            List<Integer> child_list = new ArrayList<>();
            while (len > 0){
                if (queue.peek().left != null) {
                    queue.offer(queue.peek().left);
                    child_len++;
                }
                if (queue.peek().right != null) {
                    queue.offer(queue.peek().right);
                    child_len++;
                }
                child_list.add(queue.remove().val);
                len--;
            }
            len = child_len;
            list.add(child_list);
        }
        List<List<Integer>> result = new ArrayList<>();
        len = list.size();
        while (len >= 0){
            len--;
            result.add(list.get(len));
        }
        return result;


    }
}
