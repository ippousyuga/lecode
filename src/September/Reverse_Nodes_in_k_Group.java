package September;

import April.ListNode;
/*
* 25. K 个一组翻转链表
* 同样用反转m到n的链表思路
* 先遍历获得链表长度，然后计算需要置换几次链表区间
* 然后每次遍历进行链表反转
* 第一次遍历时，pre.next = head
* 第二次及以后 pre = 上次反转得到的最后一个节点，即上次进行翻转前的head
* head = head.next
* 第一次遍历完成时，创建一个节点让其等于第一次的pre.next
* 所有遍历完成后return 这个节点。
* */

public class Reverse_Nodes_in_k_Group {
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode pre = new ListNode();
        pre.next = head;
        ListNode res = new ListNode();
        int length = 1;
        ListNode len = head;
        while (len.next != null) {
            length++;
            len = len.next;
        }
        int times = length / k;
        for (int i = 0; i < times; i++){

            if (i > 0) {
                pre = head;
                head = head.next;
            }
            for (int j = 1; j < k; j++){
                ListNode next = head.next;
                head.next = next.next;
                next.next = pre.next;
                pre.next = next;
            }
            if (i == 0) {
                res = pre.next;
            }
        }
        return res;
    }
}
