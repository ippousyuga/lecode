package May;

import java.util.List;

public class test {
    public static void main(String[] args){
        String a = "mississippi";
        String b = "issipi";
        int target = 20;
        Implement_strStr implement_strStr = new Implement_strStr();
        int result = implement_strStr.strStr(a, b);
        System.out.println(result);

    }
}
