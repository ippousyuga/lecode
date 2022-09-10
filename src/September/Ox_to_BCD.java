package September;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/*
* 牛客华为入门1、进制转换
* */

public class Ox_to_BCD {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int sum = 0;
        for (int i = 2; i < str.length(); i++){
            if ('A' <= str.charAt(i))
                sum += ((str.charAt(i) - 55) * Math.pow(16, str.length() - i - 1));
            else sum += ((str.charAt(i) - '0') * Math.pow(16, str.length() - i - 1));

        }
        System.out.print(sum);
    }
}
