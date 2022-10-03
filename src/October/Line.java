package October;

import java.util.ArrayList;

public class Line {
    /*
    * leetcode 135. 分发糖果
    * 调整了一下，添加了相邻元素相等要求糖果数也相等的条件
    * */
    public int maxCandy (int[] arr) {
        // write code here
        int res = 0;
        int length = arr.length;
        int candy[] = new int[length];
        candy[0] = 1;
        for (int i = 1; i < length; i++){
            if (arr[i] > arr[i - 1]) candy[i] = candy[i - 1] + 1;
            else if (arr[i] == arr[i - 1]) candy[i] = candy[i - 1];
            else candy[i] = 1;
        }
        for (int i = length - 2; i >= 0; i--){
            if (arr[i] > arr[i + 1]) candy[i] = Math.max(candy[i], candy[i + 1] + 1);
            else if (arr[i] == arr[i + 1]) candy[i] = candy[i + 1];
        }
        for (int temp : candy) res += temp;
        return res;
    }

    /*
    * 字符串中把'*'移动到前面
    * */
    public String changeString (String str) {
        // write code here
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++){
            if (str.charAt(i) != '*') sb.append(str.charAt(i));
        }
        for (int i = sb.length(); i < str.length(); i++){
            sb.insert(0, '*');
        }
        return sb.toString();
    }


    /*
    *leetcode 93. 复原 IP 地址
    * 暴力解 四层循环判断是否满足ip地址条件。
    * */
    ArrayList<String> res = new ArrayList<>();
    public ArrayList<String> restoreIpAddresses (String s) {
        // write code here
        for (int i = 1; i < 4; i++){
            for (int j = 1; j < 4; j++){
                for (int k = 1; k < 4; k++){
                    for (int l = 1; l < 4; l++){
                        if (i + j + k + l == s.length()){
                            String s1 = s.substring(0, i);
                            if (Integer.parseInt(s1) > 255 || (s1.charAt(0) == '0' && !s1.equals("0"))) break;
                            else {
                                String s2 = s.substring(i, i + j);
                                if (Integer.parseInt(s2) > 255 || (s2.charAt(0) == '0' && !s2.equals("0"))) break;
                                else {
                                    String s3 = s.substring(i + j, i + j + k);
                                    if (Integer.parseInt(s3) > 255 || (s3.charAt(0) == '0' && !s3.equals("0"))) break;
                                    else {
                                        String s4 = s.substring(i + j + k, i + j + k + l);
                                        if (Integer.parseInt(s4) > 255 || (s4.charAt(0) == '0' && !s4.equals("0"))) break;
                                        else res.add(s1 + '.' + s2 + '.' + s3 + '.' + s4);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return res;
    }

}
