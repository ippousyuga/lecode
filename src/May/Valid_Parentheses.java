package May;
import java.util.*;

/*
* 20.有效括号
* 栈
* 注意中间会有栈为空情况（code 14-16）
* */

public class Valid_Parentheses {
    public boolean isValid(String s) {
        Stack stack = new Stack<Character>();
        for (int i = 0; i < s.length(); i++){
            if (stack.isEmpty()) {
                stack.push(s.charAt(i));
                continue;
            }
            if (s.charAt(i) == ')'){
                if (stack.peek().equals('(')) stack.pop();
                else return false;
            }
            else if (s.charAt(i) == ']'){
                if (stack.peek().equals('[')) stack.pop();
                else return false;
            }
            else if (s.charAt(i) == '}'){
                if (stack.peek().equals('{')) stack.pop();
                else return false;
            }
            else stack.push(s.charAt(i));
        }
        if (stack.isEmpty()) return true;
        else return false;
    }
}
