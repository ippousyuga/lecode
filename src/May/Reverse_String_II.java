package May;
/*
* 541.反转字符串II
* 这简单题费老大劲
* String类型不像数组通过索引获得元素
* 需要先.toCharArray()转换为字符数组
* 最后把char数组用new String()转换为String
* 主要是循环里k / 2的判断，以及j、m、l参数的定义。
* */

public class Reverse_String_II {
    public String reverseStr(String s, int k) {
        char[] ch = s.toCharArray();
        int remain_size = s.length();
        int reverse_size = 0;
        while (remain_size >= 2 * k){
            int m = 0;
            for (int i = reverse_size; i < reverse_size + k / 2; i++){
                char temp = ch[i];
                ch[i] = ch[reverse_size + k - 1 - m];
                ch[reverse_size + k - 1 - m] = temp;
                m++;
            }
            reverse_size += 2 * k;
            remain_size -= 2 * k;
        }
        if (2 * k > remain_size && remain_size > k){
            int j = 0;
            for (int i = reverse_size ; i < reverse_size + k / 2; i++){
                char temp = ch[i];
                ch[i] = ch[reverse_size + k - 1 - j];
                ch[reverse_size + k - 1 - j] = temp;
                j++;
            }
        }
        else if (remain_size <= k){
            int l = 1;
            for (int i = reverse_size ; i < reverse_size + remain_size / 2; i++){
                char temp = ch[i];
                ch[i] = ch[s.length() - l];
                ch[s.length()- l] = temp;
                l++;
            }
        }
        return new String(ch);
    }
}
