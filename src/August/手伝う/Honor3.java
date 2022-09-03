package August.手伝う;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/*
* 2022.8.30 荣耀笔试3
* 给两个字符串，字符串包含数个单词，单词间空格分隔，判断
* */
public class Honor3 {
    public int dictationMinDistance(String word1, String word2) {
        List<String> word1List = splitSpace(word1);
        List<String> word2List = splitSpace(word2);
        int dp[][] = new int[word1List.size() + 1][word2List.size() + 1];
        for (int i = 0; i < dp.length; i++) dp[i][0] = i;
        for (int i = 0; i < dp[0].length; i++) dp[0][i] = i;
        for (int i = 1; i < dp.length; i++){
            for (int j = 1; j < dp[0].length; j++){
                if (word1List.get(i - 1).equals(word2List.get(j - 1))) dp[i][j] = dp[i - 1][j - 1];
                else dp[i][j] = Math.min(Math.min(dp[i - 1][j - 1] + 1, dp[i - 1][j] + 1), dp[i][j - 1] + 2);
            }
        }
        return word1List.size() - dp[dp.length - 1][dp[0].length - 1];
    }
    public List<String> splitSpace(String s){
        List<String> res = new ArrayList<>();
        StringBuffer stringBuffer = new StringBuffer();
        for (char c : s.toCharArray()){

            if (c == ' ') {
                res.add(stringBuffer.toString());
                stringBuffer.delete(0, stringBuffer.length());
                continue;
            }
            else {
                stringBuffer.append(c);
            }
            if (c == s.charAt(s.length() - 1)) {
                res.add(stringBuffer.toString());
            }
        }
        return res;
    }

    public static void main(String[] args) throws IOException {
        Honor3 honor3 = new Honor3();
        System.out.println(honor3.dictationMinDistance("hello world", "hello"));
        // 创建一个BufferedReader对象

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 读取第一行数据
        String line = br.readLine();
        // 将字符串根据空格进行分隔
        String[] strings = line.trim().split(" ");
        // 分别将其中的每个数值读出
        int n = Integer.parseInt(strings[0]);
        int v = Integer.parseInt(strings[1]);
        // 读取第二行数据
        line = br.readLine();
        strings = line.trim().split(" ");
        // 创建一个int型的数组用来储存第二行的多个数字
        int[] nums = new int[n];
        for (int i = 0; i < n; i ++) {
            nums[i] = Integer.parseInt(strings[i]);
        }

        // 测试输入是否正确
        for (int num: nums) {
            System.out.print(num + " ");
        }
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String s = bufferedReader.readLine();
        String[] s1 = s.trim().split(" ");
        for (String x : s1) System.out.println(x);
    }
}
