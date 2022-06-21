package June;
import java.util.*;
/*
*145.二叉树的后序遍历
* */

public class Binary_Tree_Postorder_Traversal {
    public List<Integer> postorderTraversal(TreeNode root) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        if (root == null) return arrayList;
        Postorder(root, arrayList);
        return arrayList;
    }
    public void Postorder(TreeNode root, ArrayList arrayList){
        if (root == null) return;
        Postorder(root.left, arrayList);
        Postorder(root.right, arrayList);
        arrayList.add(root.val);
    }
}
