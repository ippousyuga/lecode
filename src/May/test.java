package May;

import java.util.List;

public class test {
    public static void main(String[] args){
        int [] a = {2, 2, 2, 2, 2};
        int target = 8;
        Sum_IV sum_iv = new Sum_IV();
        List<List<Integer>> result = sum_iv.fourSum(a, target);
        System.out.println(result);

    }
}
