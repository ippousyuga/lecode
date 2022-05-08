package May;

import java.util.List;

public class test {
    public static void main(String[] args){
        int [] a = {-1,0,1,2,-1,-4};
        Sum_III sum_iii = new Sum_III();
        List<List<Integer>> result = sum_iii.threeSum(a);
        System.out.println(result);

    }
}
