package August;
/*
* 509. 斐波那契数
* 动态规划第一题
* 1、确定dp数组下标和对应值是什么
* 2、确定dp公式，dp[i] = dp[i - 1] + dp[i -2];
* 3、确定初始值0和1
* 4、确定遍历顺序：前到后
* */

public class Fibonacci_Number {
    public int fib(int n) {
        int dp[] = new int[n + 1];
        dp[0] = 0;
        dp[1] = 1;
        for (int i = 2; i <= n; i++){
            dp[i] = dp[i - 1] + dp[i -2];
        }
        return dp[n];
    }
}
