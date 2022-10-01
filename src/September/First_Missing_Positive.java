package September;

import java.util.LinkedHashSet;
import java.util.Set;

public class First_Missing_Positive {
    public static int firstMissingPositive(int[] nums) {
        Set<Integer> set = new LinkedHashSet<>();
        for (int i : nums){
            set.add(i);
        }
        for (int i = 1; i <= nums.length; i++){
            if (set.contains(i)) continue;
            else return i;
        }
        return nums.length + 1;
    }

    public static void main(String[] args) {
        int nums[] = {1,2,0};
        First_Missing_Positive.firstMissingPositive(nums);
    }
}
