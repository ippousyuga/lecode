package September;

import June.TreeNode;

import java.util.*;
/*
* 剑指 Offer 32 - III. 从上到下打印二叉树 III
* 层序遍历，判断奇数层加入list，偶数层做reverse再加入list
* */

public class Print_binary_tree_from_top_to_bottom_III {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if (root == null) return res;
        Deque<TreeNode> deque = new LinkedList<>();
        int count = 1;
        int lays = 0;
        deque.offer(root);
        while (!deque.isEmpty()){
            lays++;
            List<Integer> list = new ArrayList<>();
            for (int i = 0; i < count; i++){
                TreeNode temp = deque.poll();
                list.add(temp.val);
                if (temp.left != null) deque.offer(temp.left);
                if (temp.right != null) deque.offer(temp.right);
            }
            if (lays % 2 == 1) res.add(list);
            else {
                Collections.reverse(list);
                res.add(list);
            }
            count = deque.size();
        }
        return res;
    }
}
