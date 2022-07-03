package July;

import June.TreeNode;

import java.util.Arrays;
/*
* Arrays.copyOfRange(, from, to):复制数组索引从from开始到to（不包括to）。
* */

public class Construct_Binary_Tree_from_Preorder_and_Inorder_Traversal {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return build(preorder, inorder);
    }
    public TreeNode build(int[] preorder, int[] inorder){
        if (preorder.length == 0 || inorder.length == 0) return null;
        int root_value = preorder[0];
        TreeNode treeNode = new TreeNode(root_value);
        int split_index = 0;
        for (int i = 0; i < inorder.length; i++){
            if (inorder[i] == root_value){
                split_index = i;
                break;
            }
        }
        int [] left_preorder = Arrays.copyOfRange(preorder, 1, split_index + 1);
        int [] right_preorder = Arrays.copyOfRange(preorder, split_index + 1, preorder.length);
        int [] left_inorder = Arrays.copyOfRange(inorder, 0, split_index);
        int [] right_inorder = Arrays.copyOfRange(inorder, split_index + 1, preorder.length);
        treeNode.left =  build(left_preorder, left_inorder);
        treeNode.right = build(right_preorder, right_inorder);
        return treeNode;
    }
}
