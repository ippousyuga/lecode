package April;

public class ListNode {
     int val;     // 结点的值
     ListNode next;    // 下一个结点
     ListNode() {}    // 节点的构造函数(无参)
     public ListNode(int val) { this.val = val; }     // 节点的构造函数(有一个参数)
     public ListNode(int val, ListNode next) { this.val = val; this.next = next; }     // 节点的构造函数(有两个参数)
}
