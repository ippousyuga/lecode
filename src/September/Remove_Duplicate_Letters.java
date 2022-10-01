package September;

import java.util.Stack;
/*
* 316. 去除重复字母
* 遍历字符串，进行入栈，如果栈中存在该元素则continue
* 如果不存在该元素 并且栈不为空并且该元素小于栈顶元素并且该字符串后续存在栈顶元素 则栈顶出栈
* while循环出栈到不满足上述条件，再入栈。
* */
public class Remove_Duplicate_Letters {
    public String removeDuplicateLetters(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++){
            if (stack.contains(s.charAt(i))) continue;
            while (!stack.isEmpty() && s.charAt(i) < stack.peek() && s.indexOf(stack.peek(), i) != -1){
                stack.pop();
            }
            stack.push(s.charAt(i));
        }
        char [] chars = new char[stack.size()];
        for (int i = chars.length - 1; i >= 0; i--){
            chars[i] = stack.pop();
        }
        return new String(chars);
    }
}
