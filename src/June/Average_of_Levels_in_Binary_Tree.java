package June;
import java.util.*;
/*
*637. 二叉树的层平均值
* temp定义没用double 用的int * 1.0在第66个用例出现了蜜汁问题
* */

public class Average_of_Levels_in_Binary_Tree {
    public List<Double> averageOfLevels(TreeNode root) {
        List <Double> result = new ArrayList<>();
        Queue <TreeNode> queue = new LinkedList<>();
        double len = 1;
        queue.offer(root);
        while (!queue.isEmpty()){
            double temp_len = len;
            int child_len = 0;
            double temp = 0.0;
            while (len > 0){
                if (queue.peek().left != null){
                    queue.offer(queue.peek().left);
                    child_len++;
                }
                if (queue.peek().right != null){
                    queue.offer(queue.peek().right);
                    child_len++;
                }
                temp += queue.poll().val;
                len--;
            }
            result.add(temp / temp_len);
            len = child_len;
        }
        return result;

    }
}