

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


        reverseList(null);
    }
}