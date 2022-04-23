class QuickSort {
    public int[] sortArray(int[] nums) {
        return fastsort(nums, 0, nums.length -1 );
    }
    public int[] fastsort(int[] nums, int start, int end){
        if (start < end){
            int target = nums[start];
            int left = start;
            int right = end;
            while (left < right){
                while (left < right && nums[right] >= target) right--;
                if (left < right) nums[left++] = nums[right];
                while (left < right && nums[left] < target) left++;
                if (left <right) nums[right--] = nums[left];
            }
            nums[left] = target;
            fastsort(nums, start, left - 1);
            fastsort(nums, left + 1, end);
        }
        return nums;
    }
}