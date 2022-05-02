package May;
// 先定义00处位置值为1，因为while中设置为++j
// 预定义的new int数组默认所有元素为0。
// while判断条件1：是否到该行或列的头
// while判断条件2：是否该处位置为0。若两个条件都满足，则把该位置置为c++。
public class Spiral_Matrix_II {
    public int[][] generateMatrix(int n) {
        int i = 0, j = 0, c = 2;
        int [][] mat = new int [n][n];
        mat[0][0] = 1;
        while (c <= n * n){
            while (j < n - 1 && mat[i][j + 1] == 0) mat[i][++j] = c++;
            while (i < n - 1 && mat[i + 1][j] == 0) mat[++i][j] = c++;
            while (j > 0 && mat[i][j - 1] == 0) mat[i][--j] = c++;
            while (i > 0 && mat[i - 1][j] == 0) mat [--i][j] = c++;
        }
        return mat;
    }
}
