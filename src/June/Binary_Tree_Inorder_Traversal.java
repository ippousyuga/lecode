package June;
import java.util.*;

public class Binary_Tree_Inorder_Traversal {
    public List<Integer> inorderTraversal(TreeNode root) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        if (root == null) return arrayList;
        Inorder(root, arrayList);
        return arrayList;
    }
    public void Inorder(TreeNode root, ArrayList arrayList){
        if (root == null) return;
        Inorder(root.left, arrayList);
        arrayList.add(root.val);
        Inorder(root.right, arrayList);
    }
}
