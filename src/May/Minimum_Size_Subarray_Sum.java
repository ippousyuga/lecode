package May;
// 长度最小的连续子数组，要求和大于target。
// 滑块思想i、j从0开始，j递增，达到满足target的再将i递增
// 用Math.min判断最短长度子数组
public class Minimum_Size_Subarray_Sum {
    public int minSubArrayLen(int target, int[] nums) {
        int sum = 0;
        int j = 0;
        int len = nums.length + 1;
        for (int i = 0; i < nums.length; i++){
            sum += nums[i];
            while (sum >= target){
                len = Math.min(len, i - j + 1);
                sum -= nums[j++];
            }
        }
        if (len == nums.length + 1) return 0;
        else return len;
    }
}
