package May;
/*
* 内存消耗有点多，再看看其他办法
* */

public class Left_reverse_string {
    public String reverseLeftWords(String s, int n) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = n ; i < s.length(); i++){
            stringBuilder.append(s.charAt(i));
        }
        for (int i = 0; i < n; i++) stringBuilder.append(s.charAt(i));
        return new String(stringBuilder);
    }
}
