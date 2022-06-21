package May;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class test {
    public static void main(String[] args){
        String a[] = {"10","6","9","3","+","-11","*","/","*","17","+","5","+"};
        String b = "issipi";
        int [] nums = {1,1,1,2,2,2,2,3,3,3,5,3,3,4,4,4,4};
        int target = 3;
        List<Integer> list = new ArrayList<>();
        list.add(2);

        Top_K_Frequent_Elements top_k_frequent_elements = new Top_K_Frequent_Elements();
        int []result = top_k_frequent_elements.topKFrequent(nums, target);

        System.out.println(Arrays.toString(result));
        System.out.println(list.size());

    }
}
