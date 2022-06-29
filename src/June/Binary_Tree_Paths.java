package June;

import java.util.ArrayList;
import java.util.List;
/*
* 257. 二叉树的所有路径
* 自己写的好垃圾的递归😂
* */

public class Binary_Tree_Paths {
    List<String> result = new ArrayList<>();
    public List<String> binaryTreePaths(TreeNode root) {
        String str = new String();
        binary(root, str);
        return result;
    }
    public void binary(TreeNode root, String str){
        if (root == null) return;
        if (root.left == null & root.right == null) {
            if (str.length() == 0) str += String.valueOf(root.val);
            else str += "->" + String.valueOf(root.val);
            result.add(str);
        }
        if (str.length() == 0) str += String.valueOf(root.val);
        else str += "->" + String.valueOf(root.val);
        binary(root.left, str);
        binary(root.right, str);
    }
}
