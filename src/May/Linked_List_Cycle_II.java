package May;
/*
* 142.环形链表II
* 快慢指针，慢点走一格，快的走两格
* 相遇后，定义新的节点指向头节点，与相遇的slow节点同时出发，再相遇时为环节点。
* */
public class Linked_List_Cycle_II {
    public ListNode detectCycle(ListNode head) {
        ListNode slowNode = head;
        ListNode fastNode = head;
        while (fastNode != null && fastNode.next != null){
            fastNode = fastNode.next.next;
            slowNode = slowNode.next;
            if (fastNode == slowNode){
                ListNode cur = head;
                while (cur != slowNode){
                    cur = cur.next;
                    slowNode = slowNode.next;
                }
                return cur;
            }
        }
        return null;

    }
}
