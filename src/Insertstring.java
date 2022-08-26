import java.util.Arrays;
import java.util.Comparator;

public class Insertstring {

    static Comparator<Integer> cmp = new Comparator<Integer>() {
        public int compare(Integer a, Integer b) {
            return b-a;
        }
    };
    public int insertstring(int n, int m, int [] p, int [] s){
        Integer [] s_s = new Integer [n];
        Integer [] s_ss = new Integer[n];

        for (int i = 0; i < m; i++){
            s_s[i] = (1 - p[i]) * s[i];
            s_ss[i] = p[i] * s[i];
        }
        Arrays.sort(s_s, cmp);
        int result = Arrays.stream(Arrays.stream(s_ss).mapToInt(Integer::valueOf).toArray()).sum();
        for (int i = 0; i < m; i++){
            result += s_s[i];
        }
        return result;
    }
}
