package May;
/*
* 剑指 Offer 05. 替换空格
* StringBuilder和StringBuffer区别（好像SB什么多线程安全啥玩意
* StringBuilder可以进行append、insert操作
* String可以直接+操作进行字符串连接
* 获取String元素用.charAt()
* */

public class Replace_space {
    public String replaceSpace(String s) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < s.length(); i++){
            if (s.charAt(i) == ' ') stringBuilder.append("  ");
        }
        int left = s.length() - 1;
        if (stringBuilder.length() == 0) return s;
        s += stringBuilder;
        char ch[] = s.toCharArray();
        int right = ch.length - 1;
        while (left >= 0){
            if (ch[left] == ' '){
                ch[right--] = '0';
                ch[right--] = '2';
                ch[right--] = '%';
                left--;
            }
            else if (ch[left] != ' '){
                ch[right--] = ch[left--];
            }
        }
        return new String(ch);
    }
}
