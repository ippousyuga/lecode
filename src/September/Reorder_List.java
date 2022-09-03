package September;

import April.ListNode;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
/*
* 143. 重排链表
* 2022.8.30 葡萄城笔试
* */

public class Reorder_List {
    public void reorderList(ListNode head) {
        Stack<ListNode> stack = new Stack<>();
        Queue<ListNode> queue = new LinkedList<>();
        int length = 0;
        ListNode temp = head;
        while (temp != null){
            length += 1;
            temp = temp.next;
        }
        temp = head;
        for (int i = 0; i < length; i++){
            if (i >= length / 2) {
                stack.push(temp);
            }
            temp = temp.next;
        }
        temp = head;
        ListNode swap = head;
        for (int i = 0; i < length / 2; i++){
            swap = temp.next;
            temp.next = stack.pop();
            temp.next.next = swap;
            temp = swap;
        }
        temp.next = null;
    }
}
