package May;
import java.util.*;
/*
* 用双向队列存储滑块内最大的数组索引。
* 当队列不为空 && 队列顶元素 < 滑块内的索引 ——》 出队
* while(队列不为空 && 队尾元素对应数组值 < 当前循环所指数组值) ——》 队尾出队
* 每次循环后 i 入队。
* 当i >= k - 1 每次循环把队首入result数组
* */


public class Sliding_Window_Maximum {
    public int[] maxSlidingWindow(int[] nums, int k) {
        ArrayDeque<Integer> arrayDeque = new ArrayDeque<>();
        int n = nums.length;
        int []res = new int[n - k + 1];
        int idx = 0;
        for (int i = 0; i < n; i++){
            if (! arrayDeque.isEmpty() && arrayDeque.peek() < i - k + 1){
                arrayDeque.poll();
            }
            while (! arrayDeque.isEmpty() && nums[arrayDeque.peekLast()] < nums[i]){
                arrayDeque.pollLast();
            }
            arrayDeque.offer(i);

            if (i >= k - 1) res[idx++] = nums[arrayDeque.peek()];

        }
        return res;
    }
}
