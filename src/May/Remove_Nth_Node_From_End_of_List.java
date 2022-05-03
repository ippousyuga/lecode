package May;
/*
* 快慢指针
* 针对单元素链表情况，使用虚拟头节点
* 同时移动时，留一个temp节点为要删除节点的上一节点
* */
public class Remove_Nth_Node_From_End_of_List {    public ListNode removeNthFromEnd(ListNode head, int n) {
    ListNode virtualNode = new ListNode(0);
    virtualNode.next = head;
    ListNode cur = virtualNode;
    ListNode per = virtualNode;

    for (int i = 0 ; i < n; i++){
        per = per.next;
    }
    ListNode temp = null;
    while (per != null){
        temp = cur;
        per = per.next;
        cur = cur.next;
    }
    temp.next = cur.next;
    return virtualNode.next;
}
}
