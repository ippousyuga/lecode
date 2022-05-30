package May;

public class test {
    public static void main(String[] args){
        String a[] = {"10","6","9","3","+","-11","*","/","*","17","+","5","+"};
        String b = "issipi";
        int [] nums = {2,3};
        int target = 2;
        Evaluate_Reverse_Polish_Notation evaluate_reverse_polish_notation = new Evaluate_Reverse_Polish_Notation();
        int result = evaluate_reverse_polish_notation.evalRPN(a);

        System.out.println(result);

    }
}
