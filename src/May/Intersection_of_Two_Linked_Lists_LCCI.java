package May;
/*
* 面试题02.07 链表相交
* 判断长短链表时，不要在if里进行ListNode定义赋值
* a短b长时，直接进行a,b链表交换，将a默认为长链表
 */

public class Intersection_of_Two_Linked_Lists_LCCI {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
    ListNode a = headA;
    ListNode b = headB;
    int alen = 0;
    int blen = 0;
    while (a != null || b != null) {
        if (a == null && b != null){
            b = b.next;
            blen++;
        }
        if (b == null && a != null){
            a = a.next;
            alen++;
        }
        if (a != null && b != null){
            a = a.next;
            b = b.next;
            alen++;
            blen++;
        }
    }
    a = headA;
    b = headB;
    int gap = Math.abs(alen - blen);
    if (alen - blen < 0){
        ListNode temp = a;
        a = b;
        b = temp;
        int longLen = blen;
    }
    for (int i = 0; i < gap; i++){
        a = a.next;
    }
    while (a != null){
        if (a == b) return a;
        else{
            a = a.next;
            b = b.next;
        }
    }
    return null;
}
}
