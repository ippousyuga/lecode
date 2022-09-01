package September;

import May.ListNode;
/*
* 美团一面面经题
* 反转链表的m到n个节点
* */

public class Reverse_Linkedlist_m_to_n {
    public ListNode reverseMtoN(ListNode head, int m, int n){
        ListNode cur = head;
        ListNode per = head;
        for (int i = 1; i < n; i++){
            if (i < m - 1){
                per = per.next;
            }
            cur = cur.next;
        }

        ListNode temp = per.next;
        per.next = cur;
        cur = cur.next;
        per = temp;
        for (int i = 0; i <= n - m; i++){
            temp = per.next;
            per.next = cur;
            cur = per;
            per = temp;
        }
        return head;
    }

    public static void main(String[] args) {
        ListNode first = new ListNode(1);
        first.next = new ListNode(2);
        first.next.next = new ListNode(3);
        first.next.next.next = new ListNode(4);
        first.next.next.next.next = new ListNode(5);
        first.next.next.next.next.next = new ListNode(6);
        Reverse_Linkedlist_m_to_n reverse_linkedlist_m_to_n = new Reverse_Linkedlist_m_to_n();
        ListNode listNode = reverse_linkedlist_m_to_n.reverseMtoN(first, 3, 5);
        while (listNode != null){
            System.out.println(listNode.val);
            listNode = listNode.next;
        }
    }
}
