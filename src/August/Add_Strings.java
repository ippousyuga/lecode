package August;
/*
* 415. 字符串相加
* 使用StringBuffer存储各位相加得到的int
* 对每位进行相加（从String最后一位开始当个位
* 有进位在StringBuffer中添加和与10取余的值，并将carry=1
* 无进位则在StringBuffer中直接添加和，并将carry=0
* 最后return StringBuffer的逆序的toString
* */

public class Add_Strings {
    public String addStrings(String s1, String s2){
        StringBuffer stringBuffer = new StringBuffer();
        int carry = 0, i  = s1.length() - 1, j = s2.length() - 1;
        while (i >= 0 || j >= 0 || carry != 0){
            if (i >= 0)
                carry += s1.charAt(i--) - '0';
            if (j >= 0)
                carry += s2.charAt(j--) - '0';
            if (carry >= 10) {
                stringBuffer.append(carry % 10);
                carry = 1;
            }
            else {
                stringBuffer.append(carry);
                carry = 0;
            }
        }

        return stringBuffer.reverse().toString();
    }
}
