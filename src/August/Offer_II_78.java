package August;


import April.ListNode;

import java.util.PriorityQueue;
import java.util.Queue;

/*
* 剑指 Offer II 078. 合并排序链表
* 使用优先队列 优先出队最大值
* */

public class Offer_II_78 {
    public ListNode mergeKLists(ListNode[] lists) {
        if (lists.length == 0) return null;
        Queue<ListNode> queue = new PriorityQueue<>((ListNode a, ListNode b) -> (a.val - b.val));
        for (ListNode listNode : lists){
            while (listNode != null){
                queue.offer(listNode);
                listNode = listNode.next;
            }
        }
        ListNode mergeListNode = queue.poll();
        ListNode temp = mergeListNode;
        while (!queue.isEmpty()){
            System.out.println(queue.peek().val);
            temp.next = queue.poll();
            temp = temp.next;
        }
        if(temp != null) temp.next = null;
        return mergeListNode;
    }

    public static void main(String[] args) {
        ListNode listNode = new ListNode(1);
        ListNode listNode2 = new ListNode(2);
        listNode.next = listNode2;
        ListNode listNode3 = new ListNode(3);
        ListNode listNode4 = new ListNode(4);
        listNode3.next = listNode4;
        ListNode lists [] = {listNode, listNode3};
        Offer_II_78 offer_ii_78 = new Offer_II_78();
        System.out.println(offer_ii_78.mergeKLists(lists).toString());
        Queue queue = new PriorityQueue();
        for (int i = 1; i < 5; i++){
            queue.offer(i);
        }
        while (!queue.isEmpty()){
            System.out.println(queue.poll());
        }
    }
}
