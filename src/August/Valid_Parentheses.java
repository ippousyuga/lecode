package August;

import java.util.Deque;
import java.util.LinkedList;

public class Valid_Parentheses {
    public boolean isValid (String string){
        Deque<Character> deque = new LinkedList<>();
        for (char c : string.toCharArray()){
            if (deque.isEmpty()){
                deque.offerFirst(c);
                continue;
            }
            if (c == ')' && deque.peekFirst() == '('){
                deque.pollFirst();
                continue;
            }
            if (c == ']' && deque.peekFirst() == '['){
                deque.pollFirst();
                continue;
            }
            if (c == '}' && deque.peekFirst() == '{'){
                deque.pollFirst();
                continue;
            }
            deque.offerFirst(c);
        }
        return deque.isEmpty();
    }

    public static void main(String[] args) {
        Valid_Parentheses valid_parentheses = new Valid_Parentheses();
        System.out.println(valid_parentheses.isValid("([})"));
    }
}
