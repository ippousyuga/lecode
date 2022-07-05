package July;

import June.TreeNode;

import java.util.Arrays;
public class test {
    public static void main(String[] args){
        int val [] = {1,1,2,2};
        int test [] = Arrays.copyOfRange(val, 1, 1);
        TreeNode first = new TreeNode();
        TreeNode second = new TreeNode();
        TreeNode third = new TreeNode();
        TreeNode fourth = new TreeNode();
        first.val = -57762;
        fourth.val = val[3];

        first.right = second;
        second.val = -57762;
        first.left = third;
        third.val = -76299;
        System.out.println(Arrays.binarySearch(val, 4));
        Find_Mode_in_Binary_Search_Tree find_mode_in_binary_search_tree = new Find_Mode_in_Binary_Search_Tree();
        int[] result = find_mode_in_binary_search_tree.findMode(first);
        System.out.println(result.length);

    }
}
