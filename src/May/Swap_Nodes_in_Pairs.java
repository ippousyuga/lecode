package May;
// 两两交换链表中的节点
// 利用头节点前的虚拟头节点，完成后续的两两交换。
// 步骤123顺序按照左到右顺序，最后将头节点更换为下一对的第一个节点，前序节点为当前对的第二节点。
public class Swap_Nodes_in_Pairs {
    public ListNode swapPairs(ListNode head) {
        ListNode virtualNode = new ListNode(0);
        virtualNode.next = head;
        ListNode cur = virtualNode;
        while(head != null && head.next != null){
            ListNode temp = head.next.next;
            cur.next = head.next;
            head.next.next = head;
            head.next = temp;
            cur = head;
            head = head.next;
        }
        return virtualNode.next;
    }
}
