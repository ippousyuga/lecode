package July;

import java.util.Arrays;
public class test {
    public static void main(String[] args){
        int val [] = {1,2,3};
        int val1[] = {1,1};
        int test [] = Arrays.copyOfRange(val, 1, 1);
//        TreeNode first = new TreeNode();
//        TreeNode second = new TreeNode();
//        TreeNode third = new TreeNode();
//        TreeNode fourth = new TreeNode();
//        first.val = -57762;
//        fourth.val = val[3];
//
//        first.right = second;
//        second.val = -57762;
//        first.left = third;
//        third.val = -76299;
//        System.out.println(Arrays.binarySearch(val, 4));
        Assign_Cookies find_mode_in_binary_search_tree = new Assign_Cookies();
        int result = find_mode_in_binary_search_tree.findContentChildren(val, val1);
        System.out.println(result);

    }
}
