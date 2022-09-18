package September;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Increasing_Subsequences {
    //结果集合
    List<List<Integer>> res = new ArrayList<>();
    //路径集合
    List<Integer> path = new ArrayList<>();
    public List<List<Integer>> findSubsequences(int[] nums) {
        getSubsequences(nums,0);
        return res;
    }
    private void getSubsequences( int[] nums, int start ) {
        if(path.size()>1 ){
            res.add( new ArrayList<>(path) );
            // 注意这里不要加return，要取树上的节点
        }
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=start ;i < nums.length ;i++){
            if(!path.isEmpty() && nums[i]< path.get(path.size() - 1)){
                continue;
            }
            // 使用过了当前数字
            if ( map.containsKey(nums[i]) ){
                continue;
            }
            map.put(nums[i],0);
            path.add( nums[i] );
            getSubsequences( nums,i+1 );
            path.remove(path.size() - 1);
        }
    }
}
