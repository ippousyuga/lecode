package August;
/*
* 62. 不同路径
* 1)深度优先遍历
* 递归终止条件：当前位置等于终点位置return ++count，当前位置超过边界return 0
* 否则继续走左走右进行递归
* 2)动态规划
* dp数组存放到该索引的路径数量
* 由于人只能向右或向下走
* dp初始化 第一行为1，第一列为1
* 到达某点的路径数量 = 该点左侧路径数量+该点上方点路径数量
* */

public class Unique_Paths {
    int count = 0;
    public int uniquePaths(int m, int n) {
        return dfs(1, 1, m, n);
    }
    public int dfs(int x, int y, int m, int n){
        if (x > m || y > n) return 0;
        if (x == m && y == n) return ++count;
        dfs(x + 1, y, m, n);
        dfs(x, y + 1, m, n);
        return count;
    }



    public int uniquePaths(int m, int n, String s) {
        int [][] dp = new int[m][n];
        for (int i = 0; i < n; i++) dp[0][i] = 1;
        for (int j = 1; j < m; j++) dp[j][0] = 1;
        for (int i = 1; i < m; i++){
            for (int j = 1; j < n; j++)
                dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
        }
        return dp[m - 1][n - 1];
    }
}
