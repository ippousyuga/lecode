package August;


import May.ListNode;
/*
* 葡萄城笔试题 类似约瑟夫环
* */

public class Allout {
    public ListNode searchFinal(int [] people){
        ListNode head = new ListNode(people[0]);
        ListNode temp = head;
        int step = head.val;
        for (int i = 1; i < people.length; i++){
            temp.next = new ListNode(people[i]);
            temp = temp.next;
        }
        temp.next = head;
        temp = head;
        while (temp.next != temp){
            step = temp.val;
            for (int i = 1; i < step; i++){
                temp = temp.next;
            }
            temp.next = temp.next.next;
        }
        return temp;
    }

    public static void main(String[] args) {
        int test[] = {1,2,3,4};
        Allout allout = new Allout();
        ListNode res = allout.searchFinal(test);
        System.out.println(res.val);
    }
}
