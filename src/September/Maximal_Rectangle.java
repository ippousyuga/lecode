package September;
/*
* 85. 最大矩形
* 华为笔试题2进行了修改，输入数组元素为0-9
* 用到动态规划，先初始化dp为每列连续不为零的值的累加，eg：1，1，1-》1，2，3
* 然后遍历dp数组，每个元素再自右向左遍历，求出width值为k-j，height为dp[i][j]，求出矩阵面积=height*width
* 注意原题输入为char数组，建立dp需要用char数组元素-'0'
* */

public class Maximal_Rectangle {
    public static int maximalRectangle(char[][] matrix) {
        int dp[][] = new int[matrix.length][matrix[0].length];
        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[0].length; j++){
                if (i == 0) {
                    dp[i][j] = matrix[i][j] - '0';
                }
                else {
                    if (dp[i - 1][j] >= 1){
                        if (matrix[i][j] == '1') dp[i][j] = dp[i - 1][j] + (matrix[i][j] - '0');
                    }
                    else dp[i][j] = matrix[i][j] - '0';
                }
            }
        }
        int area = 0;
        for (int i = 0; i < dp.length; i++){
            for (int j = 0; j < dp[0].length; j++){
                if (dp[i][j] == 0) continue;
                int curHeight = dp[i][j];
                for (int k = j; k > 0 && dp[i][k] != 0; k--){
                    int curWidth = k - j + 1;
                    area = Math.max(area, curHeight * curWidth);
                }
            }
        }
        return area;
    }

}
