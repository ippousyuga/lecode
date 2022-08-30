package August;
/*
* 63. 不同路径 II
* 动态规划
* dp数组存放到该索引的路径数量
* 由于人只能向右或向下走且存在障碍物
* dp初始化 第一行在碰到障碍物之前都为1，第一列在碰到障碍物之前都为1
* 到达某点的路径数量 = 该点左侧路径数量+该点上方点路径数量
* */

public class Unique_Paths_II {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid[0].length, n = obstacleGrid.length;
        int [][] dp = new int[n][m];
        for (int i = 0; i < m; i++) {
            if (obstacleGrid[0][i] == 1) break;
            else dp[0][i] = 1;
        }
        for (int j = 0; j < n; j++) {
            if (obstacleGrid[j][0] == 1) break;
            else dp[j][0] = 1;
        }
        for (int i = 1; i < n; i++){
            for (int j = 1; j < m; j++) {
                if (obstacleGrid[i][j] == 1)
                    dp[i][j] = 0;
                else dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
            }
        }
        return dp[n - 1][m - 1];
    }

    public static void main(String[] args) {
        int[][] nums = {{0,0}};
        Unique_Paths_II unique_paths_ii = new Unique_Paths_II();
        int x = unique_paths_ii.uniquePathsWithObstacles(nums);
    }
}
