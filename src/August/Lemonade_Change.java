package August;
/*
* 860. 柠檬水找零
* 使用int变量存储五块和十块的数量
* 如果收五块就five++
* 如果收十块就判断five够不够找零，five--，ten++
* 如果收二十，优先找十块+五块，再找五块*3
* */

public class Lemonade_Change {
    public boolean lemonadeChange(int[] bills) {
        int remain = 0;
        int five = 0;
        int ten = 0;
        int [] income = new int[bills.length];
        for (int i = 0; i < bills.length; i++){
            if (bills[i] == 5) five++;
            else if (bills[i] == 10){
                if (five > 0) {
                    five--;
                    ten++;
                }
                else return false;
                }
            else if (bills[i] == 20){
                if (five == 0) return false;
                if (ten > 0) {
                    ten--;
                    if (five > 0) five--;
                }
                else if (ten == 0){
                    if (five > 2) five -= 3;
                    else if (five <= 2) return false;
                }
            }
        }
        return true;
    }
}
