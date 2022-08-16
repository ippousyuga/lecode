package August;

import java.util.Arrays;
/*
* 452. 用最少数量的箭引爆气球
* 贪心算法
* 先按照气球左端坐标排序
* 遍历所有气球，看每个气球的左端是否在这发子弹能发射的最右端（初始为第一个气球的右端，如果该次遍历的气球能打到，需要判断是否更新子弹最右端（与当前打爆气球的最右端比较取最小值
* 如果该次遍历的气球左端不在子弹最右端，子弹数+1，更新子弹最右端为当前气球最右端。
* */

public class Minimum_Number_of_Arrows_to_Burst_Balloons {
    public int findMinArrowShots(int[][] points) {

        Arrays.sort(points, (x, y) -> Integer.compare(x[0], y[0]));
        int ArrowCount = 1;
        int ShootMostRight = points[0][1];
        for (int i = 1; i < points.length; i++){
            if (points[i][0] > ShootMostRight){
                ArrowCount++;
                ShootMostRight = points[i][1];
            }
            else ShootMostRight = Math.min(ShootMostRight, points[i][1]);
        }
        return ArrowCount;
    }
    public static void main(String [] args){
        Minimum_Number_of_Arrows_to_Burst_Balloons minimum_number_of_arrows_to_burst_balloons = new Minimum_Number_of_Arrows_to_Burst_Balloons();
        int [][] points = {{-2147483646,-2147483645},{2147483646,2147483647}};
        int result = minimum_number_of_arrows_to_burst_balloons.findMinArrowShots(points);
    }
}
