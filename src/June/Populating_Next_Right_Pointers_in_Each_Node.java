package June;

import java.util.LinkedList;
import java.util.Queue;
/*
* 116. 填充每个节点的下一个右侧节点指针
* */

public class Populating_Next_Right_Pointers_in_Each_Node {
    public Node connect(Node root) {
        if (root == null) return root;
        Queue <Node> queue = new LinkedList<>();
        queue.offer(root);
        Node temp;
        while (!queue.isEmpty()){
            int len = queue.size();
            while (len > 0){
                temp = queue.poll();
//                if (temp.left != null) queue.offer(temp.left);
//                if (temp.right != null) queue.offer(temp.right);
//                if (len == 1) temp.next = null;
//                else if (len > 1) temp.next = queue.peek();
                len--;
            }
        }
        return root;

    }
}
