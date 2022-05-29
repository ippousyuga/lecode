package May;

public class test {
    public static void main(String[] args){
        String a = "(){}}{";
        String b = "issipi";
        int [] nums = {2,3};
        int target = 2;
        Valid_Parentheses valid_parentheses = new Valid_Parentheses();
        boolean result = valid_parentheses.isValid(a);

        System.out.println(result);

    }
}
