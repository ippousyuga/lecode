package July;
/*
* 376. 摆动序列
* 看数组子集中最长的满足摆动序列子集
* 前后指针 满足摆动序列就替换，否则跳过中间不满足的值
* */

public class Wiggle_Subsequence {
    public int wiggleMaxLength(int[] nums) {
        int result = 1;
        int pre_diff = 0;
        int post_diff = 0;
        for (int i = 0; i < nums.length; i++){
            post_diff = nums[i + 1] - nums[i];
            if (post_diff > 0 && pre_diff <= 0 || post_diff < 0 && pre_diff >= 0){
                result++;
                pre_diff = post_diff;
            }
        }
        return result;
    }
}
