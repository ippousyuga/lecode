package May;

import java.util.List;

public class test {
    public static void main(String[] args){
        String a = "   new   word  ";
        int target = 20;
        Reverse_Words_in_a_String reverse_words_in_a_string = new Reverse_Words_in_a_String();
        String result = reverse_words_in_a_string.reverseWords(a);
        System.out.println(result);

    }
}
