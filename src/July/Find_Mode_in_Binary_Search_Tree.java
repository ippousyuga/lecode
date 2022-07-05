package July;

import June.TreeNode;

import java.util.ArrayList;
import java.util.List;
/*
* 501. 二叉搜索树中的众数
* 不道为什么list.get获得-57762时不能判断两个值相等，用==返回false
* 只能用两个元素相减==0
* */

public class Find_Mode_in_Binary_Search_Tree {
    List<Integer> list = new ArrayList<>();
    public int[] findMode(TreeNode root) {
        inorder(root);
        int max = 0;
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < list.size(); i++){
            int max_temp = 0;
            for (int j = i; j < list.size(); j++){
                if (list.get(j) - list.get(i) == 0){
                    max_temp++;
                }
                if (list.get(j) - list.get(i) != 0){
                    if (max_temp > max) {
                        max = max_temp;
                        result.clear();
                        result.add(list.get(i));
                    }
                    else if (max_temp == max)
                        result.add(list.get(i));
                    i = j - 1;
                    break;
                }
                if (j == list.size() - 1){
                    if (max_temp > max) {
                        max = max_temp;
                        result.clear();
                        result.add(list.get(i));
                    }
                    else if (max_temp == max)
                        result.add(list.get(i));
                    i = j;
                    break;
                }
            }
        }

        int [] model = new int[result.size()];

        for (int i = 0; i < model.length; i++){
            model[i] = result.get(i);
        }
        return model;

    }
    public void inorder(TreeNode treeNode){
        if (treeNode == null) return;
        inorder(treeNode.left);
        list.add(treeNode.val);
        inorder(treeNode.right);
    }
}
