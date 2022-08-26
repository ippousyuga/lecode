package August;

import java.util.Arrays;
import java.util.LinkedList;
/*
* 406. 根据身高重建队列
* 双维度的考虑两次贪心
* 先按身高排从大到小，相同身高的二维度小的放前面，用到lambda表达式->,可自定义排序设置
* 其中b[0] - a[0]为从大到小排，if (a[0] == b[0]) return a[1] - b[1]为身高相等，按二维度从小到大排
* 新建LinkedList进行结果存放（因为能够指定索引进行数组插入
* 遍历二维数组，按照第二维度作为索引进行插入
* return将LinkedList转换为二维数组.toArray(new int[people.length][])
* */

public class Queue_Reconstruction_by_Height {

    public int[][] reconstructQueue(int[][] people) {
        Arrays.sort(people, (a, b) -> {
            if (a[0] == b[0]) return a[1] - b[1];
            return b[0] - a[0];
        });
        LinkedList<int[]> linkedList = new LinkedList();
        for (int i = 0; i < people.length; i++){
            linkedList.add(people[i][1], people[i]);
        }
        return linkedList.toArray(new int[people.length][]);
    }
}
