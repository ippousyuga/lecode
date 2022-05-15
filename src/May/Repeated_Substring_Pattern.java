package May;

public class Repeated_Substring_Pattern {
    public boolean repeatedSubstringPattern(String s) {
        int [] next = next(s);
        int len = s.length();
        if (next[len] > 0 && len % (len - next[len]) == 0) {
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
