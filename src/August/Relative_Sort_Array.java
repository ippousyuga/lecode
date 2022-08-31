package August;

import java.util.HashMap;
import java.util.PriorityQueue;
import java.util.Queue;
/*
* 1122. 数组的相对排序
* lambda定义优先队列的出队顺序记得尖括号前后都要有
* */

public class Relative_Sort_Array {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {

        int [] res = new int[arr1.length];
        Queue<Integer> queue = new PriorityQueue<> ((Integer a, Integer b) -> (b - a));
        HashMap <Integer, Integer> hashMap = new HashMap<>();
        for(int i : arr2){
            hashMap.put(i, 0);
        }
        for (int i : arr1){
            if (!hashMap.containsKey(i)) queue.offer(i);
            else hashMap.put(i,hashMap.get(i)+1);
        }
        int temp = 0;
        for (int i : arr2){
            for (int j = temp; j < res.length; j++){
                if (hashMap.get(i) != 0){
                    res[j] = i;
                    hashMap.put(i, hashMap.get(i)-1);
                }
                else {
                    temp = j;
                    break;
                }
            }
        }
        for (int i = res.length - 1; i >= 0; i--){
            if(queue.isEmpty())break;
            res[i] = queue.poll();
        }
        return res;
    }
    public static void main(String[] args) {
        Relative_Sort_Array relative_sort_array = new Relative_Sort_Array();
        int arr1[] = {2,3,1,3,2,4,6,7,9,2,19};
        int arr2[] = {2,1,4,3,9,6};
        relative_sort_array.relativeSortArray(arr1, arr2);
    }
}
