package August.手伝う;

import java.util.*;
/*
* 2170. 使数组交替的最小操作
* JD面试题2
* 长城数组
* [a,b,a,b,a,b]或[a,b,a,b,a]样式的数组为长城数组，判断给定数组需要修改几个元素才变成长城数组
* 遍历数组，奇数偶数索引分辨建立哈希
* 哈希key为元素，value为出现次数
* 建立奇数、偶数的队列存放出现最多和第二多的元素
* 判断奇数、偶数最多的元素是否相同，如果不同直接相加，再被数组length减
* 如果不同，先选一个奇数和偶数中出现次数最多的一个元素，在选择另一个出现的第二多的元素，相加在被数组length减。
* */

public class JD_3 {
    public int swapCount(int[] input) {
        HashMap<Integer, Integer> oddHashMap = new LinkedHashMap<>();
        HashMap<Integer, Integer> evenHashMap = new LinkedHashMap<>();

        Deque<Integer> odd_deque = new LinkedList<>();
        Deque<Integer> even_depue = new LinkedList<>();
        int res = 0;
        int odd_request = 0;
        int even_request = 0;


        for (int i = 0; i < input.length; i++) {
            if (i % 2 == 1) {
                oddHashMap.put(input[i], oddHashMap.getOrDefault(input[i], 0) + 1);
                odd_request++;
            } else {
                evenHashMap.put(input[i], evenHashMap.getOrDefault(input[i], 0) + 1);
                even_request++;
            }
        }
        for (Integer key : oddHashMap.keySet()) {
            if (odd_deque.size() < 2) {
                odd_deque.offer(key);
                continue;
            }
            if (oddHashMap.get(odd_deque.peekFirst()) <= oddHashMap.get(key)) {
                int temp = odd_deque.pollFirst();
                odd_deque.offerFirst(key);
                if (oddHashMap.get(odd_deque.peekLast()) < oddHashMap.get(temp)) {
                    odd_deque.pollLast();
                    odd_deque.offerLast(temp);
                }
            } else if (oddHashMap.get(odd_deque.peekLast()) < oddHashMap.get(key)) {
                odd_deque.pollLast();
                odd_deque.offerLast((key));
            }
        }
        for (Integer key : evenHashMap.keySet()) {
            if (even_depue.size() < 2) {
                even_depue.offer(key);
                continue;
            }
            if (evenHashMap.get(even_depue.peekFirst()) <= evenHashMap.get(key)) {
                int temp = even_depue.pollFirst();
                even_depue.offerFirst(key);
                if (evenHashMap.get(even_depue.peekLast()) < evenHashMap.get(temp)) {
                    even_depue.pollLast();
                    even_depue.offerLast(temp);
                }
            } else if (evenHashMap.get(even_depue.peekLast()) < evenHashMap.get(key)) {
                even_depue.pollLast();
                even_depue.offerLast((key));
            }
        }
        if (odd_deque.peekFirst() != even_depue.peekFirst()) {
            res += (odd_request - oddHashMap.get(odd_deque.peekFirst()));
            res += (even_request - evenHashMap.get(even_depue.peekFirst()));
        } else {
            if (oddHashMap.get(odd_deque.peekFirst()) > evenHashMap.get(even_depue.peekFirst())) {
                res += (odd_request - oddHashMap.get(odd_deque.peekFirst()));
                res += (even_request - evenHashMap.get(even_depue.peekLast()));
            } else {
                res += (odd_request - oddHashMap.get(odd_deque.peekLast()));
                res += (even_request - evenHashMap.get(even_depue.peekFirst()));
            }
        }
        return res;
    }

    public static void main(String[] args){
        int input[] = {1,2,1,2,1,3};
        JD_3 jd_3 = new JD_3();
        System.out.println(jd_3.swapCount(input));
    }


}


