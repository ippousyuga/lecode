package September;

import April.ListNode;

public class Reverse_Linked_List {
    public ListNode reverseList(ListNode head) {
        if (head == null) return head;
        ListNode pre = new ListNode();
        pre.next = head;
        while (head.next != null){
            ListNode next = head.next;
            head.next = next.next;
            next.next = pre.next;
            pre.next = next;
        }
        return pre.next;
    }
}
