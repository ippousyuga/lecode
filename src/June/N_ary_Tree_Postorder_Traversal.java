package June;

import java.util.ArrayList;
import java.util.List;
/*
* 590. N 叉树的后序遍历
* */

public class N_ary_Tree_Postorder_Traversal {
    public List<Integer> postorder(Node root) {
        List<Integer> result = new ArrayList<>();
        if (root == null) return result;
        Traversal(root, result);
        return result;
    }
    public void Traversal(Node root, List list){
        if (root == null) return;
        for (Node node : root.children){
            Traversal(node, list);
        }
        list.add(root.val);
    }
}
