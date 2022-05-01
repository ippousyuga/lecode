package May;
// 二分查找
public class Binary_Search {
    public int search(int[] nums, int target) {
        int index;
        int left = 0;
        int right = nums.length - 1;
        while (left <= right){
            if (nums[(right + left) / 2] < target) left = (right + left) / 2 + 1;
            else if (nums[(right + left) / 2] > target) right = (right + left) / 2 - 1;
            else if (nums[(right + left) / 2] == target) return index = (right + left) / 2;
        }
        return -1;

    }
}
