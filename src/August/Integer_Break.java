package August;
/*
* 343. 整数拆分
* 动态规划
* dp[i]存放对i进行拆分得到的最大乘积
* 求dp[i]的过程：
* 对到i为止的每个可能拆分的数字进行遍历
* 拆分乘积=max（之前遍历求得的最大拆分乘积，当前遍历数字*i-当前数字,当前遍历数字*p[i-当前遍历数字]）
* */
public class Integer_Break {
    public int integerBreak(int n) {
        int dp[] = new int[n + 1];
        dp[1] = 1;
        dp[2] = 1;
        for (int i = 3; i <= n; i++){
            for (int j = 1; j < i; j++){
                dp[i] = Math.max(dp[i], Math.max(j * (i - j), dp[j] * (i - j)));
            }
        }
        return dp[n];
    }
}
