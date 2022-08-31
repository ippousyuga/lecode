package August;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.PriorityQueue;
import java.util.Queue;
/*
* 451. 根据字符出现频率排序
* 可以在类中写静态类用来定义新的数据类型
* hashmap存放字符和出现次数
* 再遍历hashmap将Element数据进行定义并存放到优先队列
* 注意不能在同一element上进行修改再存放，因为queue中存放的是对象的地址，改变同一个对象前面存放的全都变了
* 最后出队列进行StringBuffer定义即可
* */

public class Sort_Characters_By_Frequency {
    static class Element {
        private int count;
        private Character name;

        public Element(char ch, int co){
            this.count = co;
            this.name = ch;
        }
    }
    public String frequencySort(String s) {
        Queue <Element> queue = new PriorityQueue<Element>((Element a, Element b) -> (b.count - a.count));
        HashMap <Character, Integer> hashMap = new LinkedHashMap<>();
        for (char c : s.toCharArray()){
            hashMap.put(c, hashMap.getOrDefault(c, 0) + 1);
        }
        for (char c : hashMap.keySet()){
            queue.offer(new Element(c,hashMap.get(c)));
        }
        StringBuffer stringBuffer = new StringBuffer();
        while (!queue.isEmpty()){
            Element element = queue.poll();
            char name = element.name;
            int count = element.count;
            for (int i = 0; i < count; i++){
                stringBuffer.append(name);
            }
        }
        return stringBuffer.toString();
    }

    public static void main(String[] args) {
        Sort_Characters_By_Frequency sort_characters_by_frequency = new Sort_Characters_By_Frequency();
        System.out.println(sort_characters_by_frequency.frequencySort("tree"));
    }
}
