package September;
/*
* 188. 买卖股票的最佳时机 IV
* 动态规划
* 创建二维数组的dp[n][2*k + 1]存放每次的每种买入卖出可能
* 2*k+1代表 该日股票是不操作 还是 第1到k次的买或者卖
* 当天的第k次的持有取 max（昨天的第k - 1次不持有的值 - prices[i]，昨天第k次持有的值继续持有）
* 当天的第k次的不持有取 max（昨天第k次交易不持有的值，昨天第k次交易持有 + prices[i]）
* */

public class Best_Time_to_Buy_and_Sell_Stock_IV {
    public int maxProfit(int k, int[] prices) {
        if (prices.length == 0) return 0;
        int n = prices.length;
        int dp[][] = new int [n][2 * k + 1];
        for (int i = 1; i < 2 * k; i += 2){
            dp[0][i] = -prices[0];
        }
        for(int i = 1; i < n; i++){
            for(int j = 0; j < 2 * k - 1; j += 2){
                dp[i][j + 1] = Math.max(dp[i - 1][j + 1], dp[i - 1][j] - prices[i]);
                dp[i][j + 2] = Math.max(dp[i - 1][j + 2], dp[i - 1][j + 1] + prices[i]);
            }
        }
        return dp[n - 1][2 * k];
    }
}
