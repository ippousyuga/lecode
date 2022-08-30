package August.手伝う;

import java.io.BufferedReader;
import java.io.InputStreamReader;
/*
* Honor2牛客网友答案
* */

public class Main {
    static int[][] location;
    static int n;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine().trim();
        String[] params = str.split(" ");
        n = 5;
        location = new int[n][2];

        for(int i = 0; i < n; i++){
            location[i][0] = Integer.parseInt(params[i * 2]);
            location[i][1] = Integer.parseInt(params[i * 2 + 1]);
        }
        double res = Double.MAX_VALUE;
        for(int i = 0; i < n; i++){
            int a = location[i][0];
            int b = location[i][1];
            int dis = (int)Math.sqrt(a * a + b * b);
            res = Math.min(res, dfs(0, i) + dis);
        }
        //这里要四舍五入
        System.out.printf("%.0f%n", res);
    }

    /**
     *
     * @param mask mask为掩码，第i位为1时表示第i处花丛已经采过
     * @param cur 当前所在的花丛
     * @return 距离和
     */
    private static double dfs(int mask, int cur){
        int x = location[cur][0];
        int y = location[cur][1];
        // 如果所有掩码位都为1，说明5处地点都采过了，返回原点到当前点的距离
        if(mask == (1 << n) - 1){
            return Math.sqrt(x * x + y * y);
        }
        double res = Double.MAX_VALUE;

        for(int i = 0; i < n; i++){
            if(((1 << i) & mask) != 0){
                continue;
            }
            int a = location[i][0] - x;
            int b = location[i][1] - y;
            double distance = dfs(mask | (1 << i), i) + Math.sqrt(a * a + b * b);
            res = Math.min(res, distance);
        }
        return res;
    }
}