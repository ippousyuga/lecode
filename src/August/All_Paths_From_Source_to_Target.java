package August;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
/*
* 797. 所有可能的路径
* 深度优先遍历图
* 类中创建全局变量存放返回值和双端队列
* 递归终止条件为遍历当前节点==目标节点，则添加该路径list到结果list
* 否则该路径下当前节点入队并继续递归
* 找到没找到都要所有栈内节点出栈，故进栈对应出栈。
* */

public class All_Paths_From_Source_to_Target {
    List<List<Integer>> res = new ArrayList<>();
    Deque <Integer> stack = new LinkedList<>();

    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        stack.offerLast(0);
        Dfs(graph, 0, graph.length - 1);
        return res;
    }
    public void Dfs (int[][] graph, int x, int n){
        if (x == n){
            res.add(new ArrayList<>(stack));
            return;
        }
        for (int y : graph[x]){
            stack.offerLast(y);
            Dfs(graph, y, n);
            stack.pollLast();
        }
    }
}
