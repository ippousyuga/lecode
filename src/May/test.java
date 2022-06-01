package May;

import java.util.Arrays;

public class test {
    public static void main(String[] args){
        String a[] = {"10","6","9","3","+","-11","*","/","*","17","+","5","+"};
        String b = "issipi";
        int [] nums = {1,3,-1,-3,5,3,6,7};
        int target = 3;
        Top_K_Frequent_Elements top_k_frequent_elements = new Top_K_Frequent_Elements();
        int []result = top_k_frequent_elements.topKFrequent(nums, target);

        System.out.println(Arrays.toString(result));

    }
}
