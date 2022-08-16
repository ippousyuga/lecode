package August;

public class test {
    public static void main(String[] args){
        int [] nums = {-8,3,-5,-3,-5,-2};
        Maximize_Sum_Of_Array_After_K_Negations maximize_sum_of_array_after_k_negations = new Maximize_Sum_Of_Array_After_K_Negations();
        int result = maximize_sum_of_array_after_k_negations.largestSumAfterKNegations(nums, 6);
        System.out.println(result);
    }
}
