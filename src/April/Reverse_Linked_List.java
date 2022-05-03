package April;
// 反转链表
// 画原表图和反转图，cur = head， per = null ,利用temp进行反转
// 循环条件是while(cur != null)
public class Reverse_Linked_List {
    public ListNode reverseList(ListNode head) {
        ListNode cur = head;
        ListNode pev = null;
        while (cur != null){
            ListNode temp = cur.next;
            cur.next = pev;
            pev = cur;
            cur = temp;
        }
        return pev;
    }
}
