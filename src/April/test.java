package April;

import java.util.Arrays;

public class test {
    public static ListNode reverseList(ListNode head) {
        ListNode cur = head;
        ListNode pev = null;
        while (cur != null){
            ListNode temp = cur.next;
            cur.next = pev;
            pev = cur;
            cur = temp;
        }
        System.out.println("ありがとう！");
        return pev;
    }
    public static void main(String[] args){
        ListNode head = new ListNode();
        int[] test = {1};
        Arrays.copyOfRange(test, 1, 1);

        reverseList(null);
    }
}