package May;

import April.ListNode;

public class test {
    public static void main(String[] args){
        int [] gas = {1,2,3,4,3,2,4,1,5,3,2,4};
        int [] cost = {1,1,1,3,2,4,3,6,7,4,3,1};
        Gas_Station gas_station = new Gas_Station();
        int result = gas_station.canCompleteCircuit(gas, cost);
        System.out.println(result);

    }
}
