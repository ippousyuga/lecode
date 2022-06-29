package June;

import java.util.LinkedList;
import java.util.Queue;

public class Subtree_of_Another_Tree {
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if (root == null && subRoot == null){
            return true;
        }
        if (root == null || subRoot == null){
            return false;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()){
            TreeNode node = queue.poll();
            if (subcheck(node, subRoot)) return true;
            if (node.left != null) queue.offer(node.left);
            if (node.right != null) queue.offer(node.right);
        }
        return false;
    }
    public boolean subcheck(TreeNode root, TreeNode subroot){
        if (root == null & subroot == null) return true;
        if (root == null & subroot != null) return false;
        if (root != null & subroot == null) return false;
        if (root.val != subroot.val) return false;
        return subcheck(root.left, subroot.left) & subcheck(root.right, subroot.right);
    }
}
