package October;
/*
* 179. 最大数
* 字节一面手撕
* 通过冒泡思路，两两组成字符串判断谁先谁后比较大，并将靠前的放在排序数组前面位置。
* 遍历数组组成字符串。
* */

public class Largest_Number {
    public String largestNumber(int[] nums) {
        for (int i = 0; i < nums.length; i++){
            for (int j = i; j < nums.length; j++){
                if (Long.parseLong(String.valueOf(nums[i]) + String.valueOf(nums[j])) < Long.parseLong(String.valueOf(nums[j]) + String.valueOf(nums[i]))){
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }
        String res = "";
        if (nums[0] == 0) return "0";
        for (int x : nums){
            res += String.valueOf(x);
        }
        return res;
    }
}
