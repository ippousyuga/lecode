package June;

import May.ListNode;

import java.util.*;

/*102. 二叉树的层序遍历
* 借助队列先进先出来实现层次遍历
* 每层先进队列，然后len++
* 在len＞0时，判断下一层次len
* 判断完一个节点，出队进child_list。
* 注意参数定义在哪个循环内。
* 主要是child_len和child_list的定义。
* */

public class Binary_Tree_Level_Order_Traversal {
    public List<List<Integer>> levelOrder(TreeNode root) {
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
        return list;

    }

}
