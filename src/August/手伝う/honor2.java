package August.手伝う;

import java.util.LinkedHashMap;
import java.util.Map;
/*
* 荣耀2022.8.30笔试2
* 蜜蜂采蜜，已知五片花丛坐标，请规划采花顺序使得路径距离最短
* 要求五片花丛全部经过且最后返回蜂巢，结果仅保留整数。
*
* 用的贪心（迪杰斯特拉？
* 局部最优求全局最优
* */

public class honor2 {
    public int gatherHoney(double[][] index){
        double sum_distance = 0;
        double curr_x = 0, curr_y = 0;
        int tatsu_index = 0;
        Map<Integer, Boolean> map = new LinkedHashMap<>();
        while (map.size() != 5){
            double distance = 0;
            for (int i = 0; i < index.length; i++){
                if (map.containsKey(i)) continue;
                else {
                    double x = index[i][0], y = index[i][1];
                    double temp = Math.sqrt(Math.pow(x - curr_x, 2) + Math.pow(y - curr_y, 2));
                    if (distance == 0) {
                        distance = temp;
                        tatsu_index = i;

                    }
                    else {
                        if (distance > temp) {
                            distance = temp;
                            tatsu_index = i;
                        }
                    }
                }
        }
            curr_x = index[tatsu_index][0];
            curr_y = index[tatsu_index][1];
            map.put(tatsu_index, true);

            sum_distance += distance;


        }
        sum_distance += Math.sqrt(Math.pow(curr_x, 2) + Math.pow(curr_y, 2));
        return (int) sum_distance;

    }



    public static void main(String[] args) {
        double [][] index = {{200,10},{200,50},{200,30},{200,25},{108,-18}};
        honor2 h2 = new honor2();
        System.out.println(h2.gatherHoney(index));
    }
}
