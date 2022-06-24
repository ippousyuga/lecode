package June;
import java.util.*;
/*
*515. 在每个树行中找最大值
* */

public class Find_Largest_Value_in_Each_Tree_Row {
    public List<Integer> largestValues(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (root == null) return result;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()){
            int len = queue.size();
            int temp_biggest = queue.peek().val;
            while (len > 0){
                TreeNode treeNode = queue.poll();
                if (treeNode == null) continue;
                if (treeNode.left != null) queue.offer(treeNode.left);
                if (treeNode.right != null) queue.offer(treeNode.right);
                if (treeNode.val > temp_biggest) temp_biggest = treeNode.val;
                len--;
            }
            result.add(temp_biggest);
        }
        return result;
    }
}
