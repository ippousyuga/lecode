package May;
/*
* 思路为1、去除字符串的多余空格。2、颠倒所有字符串。3、颠倒单个单词
* StringBuilder的append和reverse和replace方法的应用
* */

public class Reverse_Words_in_a_String {
    public String reverseWords(String s) {
        StringBuilder stringBuilder = new StringBuilder();
//        去除多余空格
        for (int i =0; i < s.length(); i++){
            if (s.charAt(i) != ' '){
                stringBuilder.append(s.charAt(i));
            }
            else if (i != s.length() - 1 && s.charAt(i) == ' ' && s.charAt(i + 1) != ' '){
                stringBuilder.append(s.charAt(i));
            }
            else if (i == s.length() - 1 && s.charAt(i) != ' ') stringBuilder.append(s.charAt(i));
        }
        if (stringBuilder.charAt(0) == ' ') stringBuilder.replace(0, 1, "");
        if (stringBuilder.charAt(stringBuilder.length() - 1) == ' ') stringBuilder.replace(stringBuilder.length() - 1, stringBuilder.length(), "");
//        所有字符串颠倒
        stringBuilder.reverse();
//        颠倒单个单词
        int i = 0;
        StringBuilder stringBuilder_sum = new StringBuilder();

        while (i < stringBuilder.length()){
            StringBuilder stringBuilder_temp = new StringBuilder();
            while (i < stringBuilder.length() && stringBuilder.charAt(i) != ' '){
                stringBuilder_temp.append(stringBuilder.charAt(i));
                i++;
            }
            stringBuilder_temp.reverse();
            stringBuilder_sum.append(stringBuilder_temp);
            if (i < stringBuilder.length() - 1) stringBuilder_sum.append(' ');
            i++;

        }

        return new String(stringBuilder_sum);
    }
}
