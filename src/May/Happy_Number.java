package May;
import java.util.*;
/*
* 202.快乐数
* HashSet判断是否计算过相同中间数值导致无限循环。
* */

public class Happy_Number {
    public boolean isHappy(int n) {
        Set <Integer> set = new HashSet<>();
        int consult = n;
        if (n == 1) return true;
        int temp = 0;
        while (temp != 1 && !set.contains(temp)){
            set.add(temp);
            temp = 0;
            int remain = 0;
            while (consult > 0){
                remain = consult % 10;
                consult = consult / 10;
                temp += remain * remain;
            }
            consult = temp;
        }
        return temp == 1;
    }

}
