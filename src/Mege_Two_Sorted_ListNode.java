/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 * 1、新建链表语句以及定义表头，以及最后return链表；
 * 2、判断某一链表到没到null（一直在next;
 */
class Mege_Two_Sorted_ListNode {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode newlist = new ListNode(0);
        ListNode cur = newlist;
        while(list1 != null && list2 != null){
            if (list1.val < list2.val){
                cur.next = list1;
                cur = cur.next;
                list1 = list1.next;
            }else{
                cur.next = list2;
                cur = cur.next;
                list2 = list2.next;
            }
        }

        if (list1 == null){
            cur.next = list2;
        }
        else if (list2 == null){
            cur.next = list1;
        }
        return newlist.next;
    }
}