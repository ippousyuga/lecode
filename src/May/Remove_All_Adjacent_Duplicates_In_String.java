package May;
import java.util.*;
/*
* 1047.删除字符串中的所有相邻重复项
* 注意栈输出为String时， 不要用栈.size来作为for循环跳出条件。
* */

public class Remove_All_Adjacent_Duplicates_In_String {
    public String removeDuplicates(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++){
            if (stack.isEmpty()) {
                stack.push(s.charAt(i));
                continue;
            }
            if (s.charAt(i) == stack.peek()){
                stack.pop();
                continue;
            }
            else if (s.charAt(i) != stack.peek())
                stack.push(s.charAt(i));
        }
        StringBuilder stringBuilder = new StringBuilder();
        int size = stack.size();
        for (int j = 0; j < size; j++){
            stringBuilder.append(stack.pop());
        }
        stringBuilder.reverse();
        return stringBuilder.toString();
    }
}
