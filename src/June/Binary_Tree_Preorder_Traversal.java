package June;
import May.ListNode;

import java.util.*;

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
