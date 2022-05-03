package May;
// 定义单链表
// 记得添加和删除进行size++和size--
public class Design_Linked_List {
    //size存储链表元素的个数
    int size;
    //虚拟头结点
    ListNode head;

    //初始化链表
    public Design_Linked_List() {
        size = 0;
        head = new ListNode(0);

    }

    public int get(int index) {
        //如果index非法，返回-1
        if (index < 0 || index >= size) {
            return -1;
        }
        ListNode currentNode = head;
        //包含一个虚拟头节点，所以查找第 index+1 个节点
        for (int i = 0; i <= index; i++) {
            currentNode = currentNode.next;
        }
        return currentNode.val;
    }

    public void addAtHead(int val) {
        addAtIndex(0, val);
    }

    public void addAtTail(int val) {
        addAtIndex(size, val);
    }

    public void addAtIndex(int index, int val) {
        if (index > size) return;
        if (index < 0) index = 0;
        size++;
        ListNode cur = head;
        for (int i = 0; i < index; i++){
            cur = cur.next;
        }
        ListNode addNode = new ListNode(val);
        addNode.next = cur.next;
        cur.next = addNode;
    }

    public void deleteAtIndex(int index) {
        if (index < 0 || index >= size) return;
        ListNode currentNode = head;
        size--;
        for (int i = 0 ;i < index; i++){
            currentNode = currentNode.next;
        }
        currentNode.next = currentNode.next.next;

    }
}
