package August;
/*
* 55. 跳跃游戏
* 贪心算法
* 遍历数组求每一步当前能到的距离是否更新最大距离
* 当前能到的距离为i+nums[i]
* */
public class Jump_Game {
    public boolean canJump(int[] nums) {
        int count = 0;
        int max = 0;
        for (int i = 0; i < nums.length; i++){
            if (max >= nums.length) return true;
            if (i > max) return false;
            count = i + nums[i];
            max = Math.max(max, count);
        }
        return true;
    }
}
