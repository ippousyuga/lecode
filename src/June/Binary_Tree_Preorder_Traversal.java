package June;

import java.util.ArrayList;
import java.util.List;

/*
* 144.二叉树前序遍历
* swing.TreeNode类不好使
* 递归写法
* */

public class Binary_Tree_Preorder_Traversal {
    public List<Integer> preorderTraversal(TreeNode root) {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        if (root == null) return arrayList;
        Preorder(root, arrayList);
        return arrayList;

    }
    public void Preorder (TreeNode child, ArrayList arrayList){
        if (child == null) return;
        arrayList.add(child.getVal());
        Preorder(child.getLeft(),arrayList);
        Preorder(child.getRight(), arrayList);

    }

}
