package September;

import java.util.Arrays;
/*
* 300. 最长递增子序列
* 动态规划,dp存放包含当前元素的最长递增子序列
* 初始全为1，从后向前遍历数组。并从后向前遍历当前元素后的所有元素，如果i元素小于j元素 dp[i] = max(dp[i],dp[j] + 1)
* */

public class Longest_Increasing_Subsequence {
    public int lengthOfLIS(int[] nums) {
        int dp[] = new int[nums.length];
        Arrays.fill(dp, 1);
        for (int i = nums.length - 1; i >= 0; i--){
            for (int j = nums.length - 1; j > i; j--){
                if (nums[i] < nums[j]) dp[i] = Math.max(dp[i], dp[j] + 1);
            }
        }
        int res = 0;
        for (int i = 0; i < dp.length; i++) {
            res = Math.max(res, dp[i]);
        }
        return res;
    }
}
