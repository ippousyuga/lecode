package August;
/*
* 134. 加油站
* 先从零加每站的gas减每站的cost，如果大于等于零，说明能到，小于零返回-1
* 在能到的基础上，从0遍历计算区间和，如果和小于0，则起点换为i+1，一直到遍历结束如果保持大于等于零，则返回记录的起点。
* */

public class Gas_Station {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int count = 0;
        int index = 0;
        for (int i = 0; i < gas.length; i++){
            count += gas[i] - cost[i];
        }
        if (count < 0) return -1;
        count = -1;
        for (int i = 0; i < gas.length; i++){
            if (count < 0) {
                index = i;
                count = 0;
            }
            count += gas[i] - cost[i];
        }
        return index;
    }
}
