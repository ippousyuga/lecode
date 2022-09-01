package September;

import May.ListNode;
/*
* 92. 反转链表 II
* 美团一面面经题
* 反转链表的m到n个节点
* 首先需要找到第m-1个节点为per，第n个节点为cur，
* 需要画图确定两种情况
* 一种是m不为1的时候，需要找到per为第m-1个节点，然后先让temp=per,per.next = cur,然后让cur=cur.next,per=temp.next
* 即先把m左边的边界的next确定好
* 然后再按照快慢指针进行更换
* 第二种如果m=1，则当作普通的反转链表（1到n）即让cur=cur.next
* 然后第二种return的是最后一次交换的cur
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
        if (m > 1){
            per.next = cur;
            cur = cur.next;
            per = temp;
        }
        else cur = cur.next;
        for (int i = 0; i <= n - m; i++){
            temp = per.next;
            per.next = cur;
            cur = per;
            per = temp;
        }
        if (m == 1) return cur;
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
        ListNode listNode = reverse_linkedlist_m_to_n.reverseMtoN(first, 1, 2);
        while (listNode != null){
            System.out.println(listNode.val);
            listNode = listNode.next;
        }
    }
}
