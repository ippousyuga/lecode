package May;

public class Maximum_Subarray {
    public int maxSubArray(int[] nums) {
        int max = nums[0];

        if (nums.length == 1){
            return max;
        }
        for (int i = 1; i < nums.length; i++){
            if (nums[i] + nums[i-1] > nums[i]){
                nums[i] = nums[i] + nums[i-1];
            }
            if (nums[i] > max) max = nums[i];
        }
        return max;
    }
}
