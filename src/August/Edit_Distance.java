package August;
/*
* 72. 编辑距离
* 动态规划
* dp[i][j]存放 word1.getChars(0,i-1)和word2.getChars(0,j-1)的编辑距离
* 如果word1第i个字符=word2第j个字符，则dp[i][j]=dp[i-1][j-1]
* 如果word1第i个字符！=word2第j个字符，则取（第i-1和j-1字符的编辑距离+1，第i-1和j字符的编辑距离+1，第i和j-1字符的编辑距离+1）的最小值
* 上面三个分别代表，i和j位置需要替换
* word1需要在i处插入操作才能跟word2到j为止相同
* word2需要在j处插入操作才能跟word1到i为止相同（即word1需要在i处删除操作才能跟word2到j为止相同
* 最后取右下角元素
* */
public class Edit_Distance {
    public int minDistance(String word1, String word2) {
        int dp[][] = new int[word1.length() + 1][word2.length() + 1];
        for (int i = 0; i < dp.length; i++) dp[i][0] = i;
        for (int i = 0; i < dp[0].length; i++) dp[0][i] = i;
        for (int i = 1; i < dp.length; i++){
            for (int j = 1; j < dp[0].length; j++){
                if (word1.charAt(i - 1) == word2.charAt(j - 1)) dp[i][j] = dp[i - 1][j - 1];
                else dp[i][j] = Math.min(Math.min(dp[i - 1][j - 1] + 1, dp[i - 1][j] + 1), dp[i][j - 1] + 1);
            }
        }
        return dp[word1.length()][word2.length()];
    }
}
