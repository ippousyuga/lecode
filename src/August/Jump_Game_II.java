package August;
/*
* 45. 跳跃游戏 II
* 贪心算法
* 每次遍历判断是否更新最大距离
* 如果距离大于等于length-1，说明差一步就能到，直接+1步后break
* 如果遍历到当前步的极限距离，更新极限距离=极限距离内节点的可移动最大距离，count++
* */
public class Jump_Game_II {
    public int jump(int[] nums) {
        if (nums.length == 1) return 0;
        int distence = 0;
        int count = 0;
        int max_distance = 0;
        int next_max = 0;
        for (int i = 0; i < nums.length; i++){
            max_distance = Math.max(max_distance, i + nums[i]);
            if (max_distance >= nums.length - 1){
                count++;
                break;
            }
            if (i == next_max){
                next_max = max_distance;
                count++;
            }
        }
        return count;
    }
}
