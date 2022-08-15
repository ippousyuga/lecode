package August;
/*
* 70. 爬楼梯
* 动态规划
* 1、dp数组下标和对应值：dp[i]对应到第i层几种方法
* 2、dp数组公式：由于一次踩1~2级，dp[i]=dp[i-1]+dp[i-2]
* 3、dp数组初始化：dp[1]=1;dp[2]=2
* 4、遍历顺序，从前向后
* */

public class Climbing_Stairs {
    public int climbStairs(int n) {
        int count = 0;
        int a = 1;
        if (n == 1) return a;
        int b = 2;
        for (int i = 3; i <= n; i++){
            int temp = b;
            b += a;
            a = temp;
        }
        return b;
    }
}
