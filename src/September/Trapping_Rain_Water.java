package September;
/*
* 42. 接雨水
* 动态规划
* 每个索引能接到的雨水为左右两边的最高高度的较小值-索引自己高度
* 利用动态规划求每个索引的两边上的最高高度leftMax rightMax
* */

public class Trapping_Rain_Water {
    public int trap(int[] height) {
        int res = 0;
        int leftMax[] = new int[height.length];
        int rightMax[] = new int[height.length];
        leftMax[0] = height[0];
        rightMax[0] = height[height.length - 1];
        int tempMax = 0;
        for (int i = 1; i < height.length; i++){
            leftMax[i] = Math.max(height[i - 1], tempMax);
            tempMax = leftMax[i];
        }
        tempMax = 0;
        for (int i = height.length - 2; i >= 0; i--){
            rightMax[i] = Math.max(height[i + 1], tempMax);
            tempMax = rightMax[i];
        }
        for (int i = 0; i < height.length; i++){
            res += Math.max(Math.min(leftMax[i], rightMax[i]) - height[i], 0);
        }
        return res;
    }

    public static void main(String[] args) {
        Trapping_Rain_Water trapping_rain_water = new Trapping_Rain_Water();
        int test[] = {0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(trapping_rain_water.trap(test));
    }
}
