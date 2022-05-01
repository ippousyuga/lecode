package May;
// 搜索插入位置（使用二分
public class Search_Insert_Position {
    public int searchInsert(int[] nums, int target) {
        int index;
        int left = 0;
        int right = nums.length - 1;
        while(left <= right){
            index = (left + right) / 2;
            if(target < nums[index]) right = index - 1;
            else if (target > nums[index]) left = index + 1;
            else return index ;
        }
        return right + 1;
    }
}
