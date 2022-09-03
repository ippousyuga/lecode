package September;

import java.util.ArrayList;
import java.util.List;
/*
* 葡萄城笔试题 数组实现队列
* */

public class Implement_Queue_using_Array {
    List<Integer> firstList;
    List<Integer> secondList;
    public Implement_Queue_using_Array(){
        firstList = new ArrayList<>();
        secondList = new ArrayList<>();
    }
    public void push (int val){
        firstList.add(val);
    }
    public int poll() {
        int pollValue = firstList.remove(0);
        return pollValue;
    }
    public int peek() {
        return firstList.get(0);
    }
    public boolean isEmpty() {
        if (firstList.size() == 0) return true;
        else return false;
    }

    public static void main(String[] args) {
        Implement_Queue_using_Array implement_queue_using_array = new Implement_Queue_using_Array();
        System.out.println(implement_queue_using_array.isEmpty());
        implement_queue_using_array.push(0);
        implement_queue_using_array.push(1);
        System.out.println(implement_queue_using_array.peek());
        System.out.println(implement_queue_using_array.poll());
        System.out.println(implement_queue_using_array.peek());
        System.out.println(implement_queue_using_array.isEmpty());

    }

}
