package August;

import java.util.PriorityQueue;
import java.util.Queue;

public class Odd_even_sort {
    public int[] sort(int [] nums){
        Queue<Integer> oddQueue = new PriorityQueue<>();
        Queue<Integer> evenQueue = new PriorityQueue<>();
        for (int i : nums){
            if (i % 2 == 0){
                evenQueue.offer(i);
            }
            else oddQueue.offer(i);
        }
        int i = 0;
        while (!oddQueue.isEmpty()) nums[i++] = oddQueue.poll();
        while (!evenQueue.isEmpty()) nums[i++] = evenQueue.poll();
        return nums;
    }

    public static void main(String[] args) {
        int nums[] = {1,2,9,4,5,3,31,58};
        Odd_even_sort odd_even_sort = new Odd_even_sort();
        int res[] = odd_even_sort.sort(nums);
        for (int i : res){
            System.out.println(i);
        }
    }
}
