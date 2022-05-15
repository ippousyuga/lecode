package May;

import java.util.Arrays;

public class test {
    public static void main(String[] args){
        String a = "abaab";
        String b = "issipi";
        int target = 20;
        Repeated_Substring_Pattern repeated_substring_pattern = new Repeated_Substring_Pattern();
        int result [] = repeated_substring_pattern.next(a);
        System.out.println(Arrays.toString(result));

    }
}
