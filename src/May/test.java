package May;

public class test {
    public static void main(String[] args){
        int n[] = {2,7,11,15};
        int target = 9;
        Two_Sum two_sum = new Two_Sum();
        int [] result = two_sum.twoSum(n, target);
        System.out.println(result);

    }
}
