package May;
import java.util.*;

/*232.用栈实现队列
* 入队正常入栈
* 出队时如果第二个栈为空，将第一个栈出并入到第二个栈，再出第二个栈
* 头部元素相同
* 判断空，需要判断两个都为空
* */

public class Implement_Queue_using_Stacks {
    Stack<Integer> FirstStack;      // 成员变量
    Stack<Integer> SecondStack;
    public Implement_Queue_using_Stacks() {
        FirstStack = new Stack<>();
        SecondStack = new Stack<>();
    }

    public void push(int x) {
        FirstStack.push(x);
    }

    public int pop() {
        int pop_value;
        if (SecondStack.empty() == true){
            while (FirstStack.empty() != true){
                SecondStack.push(FirstStack.pop());
            }
        }
        return SecondStack.pop();
    }

    public int peek() {
        int peak_value;
        if (SecondStack.empty() == true){
            while (FirstStack.empty() != true){
                SecondStack.push(FirstStack.pop());
            }
        }
        return SecondStack.peek();
    }

    public boolean empty() {
        return (FirstStack.empty() == true && SecondStack.empty() == true);
    }
}
