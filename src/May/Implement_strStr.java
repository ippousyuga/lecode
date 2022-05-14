package May;
/*
* 暴力解决，另一个方法是KMP
* */

public class Implement_strStr {
    public int strStr(String haystack, String needle) {
        if (needle == "") return 0;
        if (needle.length() > haystack.length()) return -1;
        int start = 0;
        while (start < haystack.length()){
            if (haystack.charAt(start) == needle.charAt(0)){
                if (needle.length() == 1) return start;
                if (start == haystack.length() - 1) return -1;
                int start_needle = 0;
                int start_haystack = start;
                while (haystack.charAt(++start_haystack) == needle.charAt(++start_needle) ){
                    if (start_needle == needle.length() - 1) return start;
                    if (start_haystack == haystack.length() - 1) return -1;
                }
            }
            start++;
        }
        return -1;
    }
}
