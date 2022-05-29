package May;
import java.util.*;

/*225.用队列实现栈
* 用两个队列，pop和top都需要把第一个队列先备份到第二个队列
* pop在清空最后一个前删除最后一个
* */

public class Implement_Stack_using_Queues {
    Queue<Integer> queue;
    Queue<Integer> queue_backup;

    public Implement_Stack_using_Queues() {
        queue = new LinkedList<>();
        queue_backup = new LinkedList<>();
    }

    public void push(int x) {
        queue.add(x);
    }

    public int pop() {
        while (queue.size() != 1){
            queue_backup.add(queue.remove());
        }
        int pop_value = queue.remove();
        while (!queue_backup.isEmpty())
            queue.add(queue_backup.remove());
        return pop_value;
    }

    public int top() {
        while (queue.size() != 1){
            queue_backup.add(queue.remove());
        }
        int top_value = queue.peek();
        queue_backup.add(queue.remove());

        while (!queue_backup.isEmpty())
            queue.add(queue_backup.remove());
        return top_value;
    }

    public boolean empty() {
        return queue.isEmpty();
    }
}
