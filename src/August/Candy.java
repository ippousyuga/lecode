package August;

import java.util.Arrays;
/*
* 135. 分发糖果
* 贪心算法
* 两次贪心
* 第一次正向遍历，当i+1的评分大于i时，让i+1的糖果数比i多一个，当等于或小于时i+1的糖果数=1
* 第二次反向遍历，当i-1的评分大于i时，让i-1的糖果数为max(i的糖果数+1，正向遍历给到的i-1的糖果数)
* */

public class Candy {
    public int candy(int[] ratings) {
        int [] CandyCount = new int[ratings.length];
        CandyCount[0] = 1;
        for (int i = 0; i < ratings.length - 1; i++){
            if (ratings[i] < ratings[i + 1]) CandyCount[i + 1] = CandyCount[i] + 1;
            else CandyCount[i + 1] = 1;
        }
        for (int i = ratings.length - 1; i > 0; i--){
            if (ratings[i - 1] > ratings[i]) {
                CandyCount[i - 1] = Math.max(CandyCount[i - 1], CandyCount[i] + 1);
            }
        }
        return Arrays.stream(CandyCount).sum();
    }
    public static void main(String[] args){
        int ratings[] = {1,0,2};
        Candy candy = new Candy();
        int res = candy.candy(ratings);
    }
}
