package June;

import java.util.List;

public class test {
    public static void main(String[] args){
        int val [] = {2147483647,2147483647,2147483647};
        TreeNode first = new TreeNode();
        TreeNode second = new TreeNode();
        TreeNode third = new TreeNode();
        first.val = val[0];
        first.left = second;
        first.right = third;
        second.val = val[1];
        third.val = val[2];
        Average_of_Levels_in_Binary_Tree average_of_levels_in_binary_tree = new Average_of_Levels_in_Binary_Tree();
        List<Double> result = average_of_levels_in_binary_tree.averageOfLevels(first);
        System.out.println(result.get(1));

    }
}
