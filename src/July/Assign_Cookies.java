package July;

import java.util.Arrays;
/*
* 455. 分发饼干
* */

public class Assign_Cookies {
    public int findContentChildren(int[] g, int[] s) {
        int result = 0;
        int index = g.length - 1;
        Arrays.sort(g);
        Arrays.sort(s);
        for (int i = s.length - 1; i >= 0; i--){
            for (int j = index; j >= 0; j--){
                if (s[i] >= g[j]) {
                    result++;
                    index = j - 1;
                    break;
                }
            }

        }
        return result;
    }

}
