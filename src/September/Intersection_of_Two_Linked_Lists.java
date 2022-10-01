package September;

import April.ListNode;
/*
*160. 相交链表
* */

public class Intersection_of_Two_Linked_Lists {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == headB) return headA;
        int aLength = 1, blength = 1;
        ListNode temp = headA;
        ListNode res = null;
        while (temp.next != null){
            aLength += 1;
            temp = temp.next;
        }
        temp = headB;
        while (temp.next != null){
            blength += 1;
            temp = temp.next;
        }
        if (aLength > blength) {
            for (int i = 0; i < aLength - blength; i++) headA = headA.next;
            }
        else {
            for (int i = 0; i < blength - aLength; i++) headB = headB.next;
        }
        for (int i = 0; i < Math.min(aLength, blength); i++) {
            if (headA == headB) {
                res = headA;
                break;
            }
            headA = headA.next;
            headB = headB.next;
        }
        return res;
    }
}
