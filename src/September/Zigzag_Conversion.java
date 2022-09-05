package September;
/*
* 6. Z 字形变换
* 画图看每个元素在每行计算取余的规律
 * */

public class Zigzag_Conversion {
    public String convert(String s, int numRows) {
        if (numRows == 1) return s;
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < numRows; i++){
            for (int j = 0; j < s.length(); j++){
                if (j % (2 * numRows - 2) == i) {
                    stringBuilder.append(s.charAt(j));
                    continue;
                }
                if (j % (2 * numRows - 2) == 2 * numRows - i - 2) {
                    stringBuilder.append(s.charAt(j));
                    continue;
                }
                if (2 * numRows - i - 2 == 2 * numRows - 2) {
                    if (j % (2 * numRows - 2) == 0) stringBuilder.append(s.charAt(j));
                    continue;
                }
            }
        }
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        Zigzag_Conversion zigzag_conversion = new Zigzag_Conversion();
        String s = "PAYPALISHIRING";
        System.out.println(zigzag_conversion.convert(s, 4));
    }
}
