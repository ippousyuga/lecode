package September;
/*
* 43. 字符串相乘
* 用数组存放计算过程及结果的每一位
* 举个算式例子 发现第一个数的第i位和第二个数的第j为相乘 会累加到结果的第i+j+1位，进位会累加到i+j位
* 最后把结果数组的每一位放入stringBuffer再toString
* */

public class Multiply_Strings {
    public String multiply(String num1, String num2) {
        StringBuffer stringBuffer = new StringBuffer();
        int res[] = new int[num1.length() + num2.length()];
        int carry = 0;
        for (int i = num1.length() - 1; i >= 0; i--){
            for (int j = num2.length() - 1; j >= 0; j--){
                int temp = res[i + j + 1] + (num1.charAt(i) - '0') * (num2.charAt(j) - '0');
                res[i + j + 1] = temp % 10;
                res[i + j] += temp / 10;
            }
        }
        for (int i : res){
            stringBuffer.append(i);
        }
        if (stringBuffer.charAt(0) == '0') stringBuffer.delete(0, 1);
        return stringBuffer.toString();
    }

    public static void main(String[] args) {
        Multiply_Strings multiply_strings = new Multiply_Strings();
        System.out.println(multiply_strings.multiply("25", "3"));
    }
}
