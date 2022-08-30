package August;
/*
* 746. 使用最小花费爬楼梯
* 确定dp数组为到当前索引的台阶需要的最小消耗
* dp[i] = 前两阶的最小值 + 到当前阶的消耗值
* return 最后两阶的dp数组最小值
* */

public class Min_Cost_Climbing_Stairs {
    public int minCostClimbingStairs(int[] cost) {
        int [] dp = new int[cost.length];
        dp[0] = cost[0];
        dp[1] = cost[1];
        for (int i = 2; i < cost.length; i++){
            dp[i] = Math.min(dp[i - 1], dp[i - 2]) + cost[i];
        }
        return Math.min(dp[cost.length - 1], dp[cost.length - 2]);
    }
}
