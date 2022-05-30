package May;
import java.util.*;
/*
* 注意int string互相转换用valueOf
* 记得判断是否为两位数及以上（code 13
* */

public class Evaluate_Reverse_Polish_Notation {
    public int evalRPN(String[] tokens) {
        Stack<String> stack = new Stack<>();
        int nums3 = 0;
        for (String token : tokens){
            if (token.length() <= 1 && (token.charAt(0) > '9' || token.charAt(0) < '0')){
                int nums1 = Integer.valueOf(stack.pop());
                int nums2 = Integer.valueOf(stack.pop());
                if (token.charAt(0) == '+'){
                    nums3 = nums1 + nums2;
                    stack.push(String.valueOf(nums3));
                    continue;
                }
                if (token.charAt(0) == '-'){
                    nums3 = nums2 - nums1;
                    stack.push(String.valueOf(nums3));
                    continue;
                }
                if (token.charAt(0) == '*'){
                    nums3 = nums1 * nums2;
                    stack.push(String.valueOf(nums3));
                    continue;
                }
                if (token.charAt(0) == '/'){
                    nums3 = nums2 / nums1;
                    stack.push(String.valueOf(nums3));
                    continue;
                }
            }
            else  stack.push(token);
        }
        return Integer.valueOf(stack.pop());
    }
}
