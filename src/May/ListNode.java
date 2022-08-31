package May;

public class ListNode {
     public int val;     // 结点的值
     public ListNode next;    // 下一个结点
     ListNode() {}    // 节点的构造函数(无参)
     public ListNode(int val) { this.val = val; }     // 节点的构造函数(有一个参数)
     public ListNode(int val, ListNode next) { this.val = val; this.next = next; }     // 节点的构造函数(有两个参数)
}
