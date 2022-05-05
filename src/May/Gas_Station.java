package May;

public class Gas_Station {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int i;
        for (i = 0; i < gas.length; i++) {
            int gasstorge = gas[i];
            boolean cross = false;
            for (int j = i; j < gas.length; j++) {
                if (gasstorge < cost[j] && j == gas.length - 1) return -1;
                else if (gasstorge < cost[j] && j <= gas.length - 1) {
                    break;
                } else if (gasstorge >= cost[j] && j < gas.length - 1) {
                    gasstorge = gasstorge - cost[j] + gas[j + 1];
                } else if (cross == false && gasstorge >= cost[j] && j == gas.length - 1) {
                    gasstorge = gasstorge - cost[j] + gas[0];
                    j = -1;
                    cross = true;
                }
                if (j == i && cross == true) return i;
            }
        }
        return -1;
    }
}
