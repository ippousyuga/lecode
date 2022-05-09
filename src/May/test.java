package May;

import java.util.List;

public class test {
    public static void main(String[] args){
        String a = "krmyfshbspcgtesxnnljhfursyissjnsocgdhgfxubewllxzqhpasguvlrxtkgatzfybprfmmfithphckksnvjkcvnsqgsgosfxc";
        int target = 20;
        Reverse_String_II reverse_string = new Reverse_String_II();
        String result = reverse_string.reverseStr(a, target);
        System.out.println(result);

    }
}
