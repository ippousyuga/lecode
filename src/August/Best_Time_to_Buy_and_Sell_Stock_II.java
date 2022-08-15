package August;
/*
* 122. 买卖股票的最佳时机 II
* 贪心算法
* 把买卖股票计算利润进行分解
* prices[3] - prices[0] = (prices[3] - prices[2]) + (prices[2] - prices[1]) + (prices[1] - prices[0])
* 跨时间利润分为相邻两天利润
* 即求邻天利润，将正利润相加即可。
* */

public class Best_Time_to_Buy_and_Sell_Stock_II {
    public int maxProfit(int[] prices) {
        int count = 0;
        for (int i = 1; i < prices.length; i++){
            if (prices[i] - prices[i - 1] > 0) count += prices[i] - prices[i - 1];
        }
        return count;
    }

}
