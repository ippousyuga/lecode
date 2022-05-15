package May;
/*
* 459. 重复的子字符串
* KMP应用
* next[len - 1]就是该字符串最长相同前后缀长度，len - next[len - 1]为最短重复字符串长度
* 取余为0即可通过某字符串重复构成s。
* KMP的next：
* 初始化j = 0; next[0] = 0;
* for(i = 1)
*   while(j > 0 && 前后缀不同（charAt(i) != charAt(j)）) j = next[j - 1]（回退）
*   if(前后缀相同 （charAt(i) == charAt(j)）) j++
* next[i] = j;
* */

public class Repeated_Substring_Pattern {
    public boolean repeatedSubstringPattern(String s) {
        if (s == "") return false;
        int [] next = next(s);
        int len = s.length();
        if (next[len - 1] != 0 && len % (len - next[len - 1]) == 0) {
            return true;
        }
        return false;
    }

    public int [] next(String s){
        int [] next = new int[s.length()];
        next[0] = 0;
        int j = 0;
        for (int i = 1; i < s.length(); i++){
            while (j > 0 && s.charAt(i) != s.charAt(j)){
                j = next[j - 1];
            }
            if (s.charAt(i) == s.charAt(j)){
                j++;
            }
            next[i] = j;
        }
        return next;
    }
}
