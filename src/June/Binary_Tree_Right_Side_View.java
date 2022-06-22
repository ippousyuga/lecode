package June;
import java.util.*;
/*
* 199. 二叉树的右视图
* child_len == 1时，添加进list
* */

public class Binary_Tree_Right_Side_View {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (root == null) return result;
        int len = 1;
        int child_len = 0;
        Queue <TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()){
            child_len = 0;
            while (len > 0){
                if (queue.peek().left != null) {
                    queue.offer(queue.peek().left);
                    child_len++;
                }
                if (queue.peek().right != null) {
                    queue.offer(queue.peek().right);
                    child_len++;
                }
                if (len == 1)
                    result.add(queue.poll().val);
                else queue.poll();
                len--;
            }
            len = child_len;
        }
        return result;
    }
}
