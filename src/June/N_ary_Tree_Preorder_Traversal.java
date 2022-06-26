package June;

import java.util.ArrayList;
import java.util.List;
/*
* 589. N 叉树的前序遍历
* 同样递归思路
* 先终止条件，然后先序就先加入list
* 再对childs递归
* */

public class N_ary_Tree_Preorder_Traversal {
    public List<Integer> preorder(Node root) {
        List<Integer> result = new ArrayList<>();
        if (root == null) return result;
        Traversal(root, result);
        return result;
    }
    public void Traversal(Node root, List list){
        if (root == null) return;
        list.add(root.val);
        for (Node node : root.children){
            Traversal(node, list);
        }
    }
}
