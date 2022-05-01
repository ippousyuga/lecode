package May;
// 有序数组的平方
// 新数组用result来存放，原数组仅用来对比
// 注意定义right时 - 1
public class Squares_Sort {
    public int[] sortedSquares(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        int index = nums.length - 1;
        int [] result = new int [nums.length];
        while (left <= right){
            if (nums[left] * nums[left] > nums[right] *nums[right]) {
                result[index--] = nums[left] * nums[left];
                ++left;
            }
            else {
                result[index--] = nums[right] * nums[right];
                --right;
            }
        }
        return result;
    }
}
