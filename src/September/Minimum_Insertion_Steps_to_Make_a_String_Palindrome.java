package September;
/*
*
* 1312. 让字符串成为回文串的最少插入次数
* 动态规划
* dp[][]存放s[i]到s[j]的字符串中的最大回文子串长度
* dp对角线初始化为1，只计算上三角数值
* 从n-1行向上遍历
* 如果s[i]=[j]，dp[i][j]=s[i+1]到s[j-1]的字符串中的最大回文子串长度+2，即加上i和j这两个相同的字符
* 如果s[i]!=s[j]，dp[i][j]=Math.max(dp[i + 1][j], dp[i][j - 1])，即i+1到j字符串和i到j-1的最大回文串长度的最大值
* return为字符串长度-字符串中最大回文串长度
* */
public class Minimum_Insertion_Steps_to_Make_a_String_Palindrome {
    public int minInsertions(String s) {
        int [][] dp = new int[s.length()][s.length()];
        for (int i = 0; i < s.length(); i++){
            dp[i][i] = 1;
        }
        for (int i = s.length() - 1; i >= 0; i--){
            for (int j = i + 1; j < s.length(); j++){
                if (s.charAt(i) == s.charAt(j)){
                    dp[i][j] = dp[i + 1][j - 1] + 2;
                }
                else {
                    dp[i][j] = Math.max(dp[i + 1][j], dp[i][j - 1]);
                }
            }
        }
        return s.length() - dp[0][s.length() - 1];
    }
}
