package May;

public class test {
    public static void main(String[] args){
        String a[] = {"10","6","9","3","+","-11","*","/","*","17","+","5","+"};
        String b = "issipi";
        int [] nums = {1,3,-1,-3,5,3,6,7};
        int target = 3;
        Sliding_Window_Maximum sliding_window_maximum = new Sliding_Window_Maximum();
        int []result = sliding_window_maximum.maxSlidingWindow(nums, target);

        System.out.println(result);

    }
}
