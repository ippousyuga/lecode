package May;
/*
* 27、移除元素
* 还有快慢指针法
* 一个for循环，if快指针指到与val不同的就赋值给慢指针++
* return 慢指针index
* */
public class Remove_Element {
    public int removeElement(int[] nums, int val) {
        int count = 0;
        int j = 0;
        for (int i = 0; i < nums.length; i++){
            if (j == nums.length) return count;
            if (nums[i] == val) {
                if (j < i) j = i;
                for (j = j; j < nums.length; j++){
                    if (nums[j] != val){
                        nums[i] = nums[j];
                        nums[j] = val;
                        count++;
                        j++;
                        break;
                    }

                }

            }
            else count++;
        }
        return count;
    }
}
