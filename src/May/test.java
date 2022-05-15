package May;

import java.util.Arrays;
import java.util.List;

public class test {
    public static void main(String[] args){
        String a = "abba";
        String b = "issipi";
        int target = 20;
        Repeated_Substring_Pattern repeated_substring_pattern = new Repeated_Substring_Pattern();
        int result [] = repeated_substring_pattern.next(a);
        System.out.println(Arrays.toString(result));

    }
}
