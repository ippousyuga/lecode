package June;

import java.util.Arrays;

public class test {
    public static void main(String[] args){
        int val [] = {1};
        int test [] = Arrays.copyOfRange(val, 1, 1);
        TreeNode first = new TreeNode();
        TreeNode second = new TreeNode();
        TreeNode third = new TreeNode();
        TreeNode fourth = new TreeNode();
        first.val = val[0];
        fourth.val = val[3];

        first.left = second;
        first.right = third;
        second.val = val[1];
        second.left = fourth;
        third.val = val[2];
        System.out.println(Arrays.binarySearch(val, 4));
        Count_Complete_Tree_Nodes count_complete_tree_nodes = new Count_Complete_Tree_Nodes();
        int result = count_complete_tree_nodes.countNodes(first);
        System.out.println(result);

    }
}
