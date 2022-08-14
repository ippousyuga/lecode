package August;
/*
* 53. 最大子数组和
* 用贪心求局部最优
* 创建max为int最小值
* 计算count
* 如果count大于max，替换max
* 如果count小于0则置0重新加
*
* */

public class Maximum_Subarray {
    public int maxSubArray(int[] nums) {
        int count = 0;
        int max_count = Integer.MIN_VALUE;
        for (int temp : nums){
            count += temp;
            if (count > max_count) max_count = count;
            if (count < 0){
                count = 0;
            }
        }
        return max_count;
    }
}
