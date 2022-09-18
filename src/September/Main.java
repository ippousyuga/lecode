package September;

/*
* 使用java编写，但是在线编译器不支持选择java
* */

import java.util.Scanner;

public class Main {


    public static int revertNum(int num){
        String str = String.valueOf(num);
        boolean First = true;
        StringBuilder sb = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--){
            if (str.charAt(i) == '0' && First) continue;
            if (str.charAt(i) != '0') First = false;
            sb.append(str.charAt(i));
        }
        return Integer.parseInt(sb.toString());
    }


    public static int findLostNum(int[] arr){
        for (int i = 0; i < arr.length; i++){
            if (arr[i] != i + 1) return i + 1;
        }
        return 0;
    }


    public static boolean canBeSubstr(String str1, String str2){
        for (int i = 0; i < str2.length(); i++){
            int cur = i;
            for (int j = 0; j < str1.length(); j++){
                if (str2.charAt(cur) == str1.charAt(j) && j == str1.length() - 1) {
                    return true;
                }
                else if (str2.charAt(cur) == str1.charAt(j) && j != str1.length() - 1){
                    cur++;
                    continue;

                }
                else break;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] split = str.split(" ");
        System.out.println(canBeSubstr(split[0], split[1]));
    }


//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        String string = scanner.next();
//        String[] strArr = string.split(",");
//        int[] arr = new int[strArr.length];
//        for (int i = 0; i <strArr.length; i++){
//            arr[i] = Integer.parseInt(strArr[i]);
//        }
//        System.out.println(findLostNum(arr));
//    }



//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int num = sc.nextInt();
//        System.out.println(revertNum(num));
//    }



//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        String str = scanner.nextLine();
//        StringBuilder stringBuilder = new StringBuilder();
//
//        boolean first_number = false;
//        boolean with_small = false;
//
//        for (int i = 0; i < str.length(); i++){
//            if (str.charAt(i) <= 'z' && str.charAt(i) >= 'a'){
//                if (i > 0 && str.charAt(i - 1) == '_') stringBuilder.append((char) (str.charAt(i) - 32));
//                else stringBuilder.append(str.charAt(i));
//            }
//            if (str.charAt(i) <= '9' && str.charAt(i) >= '0') stringBuilder.append(str.charAt(i));
//            if (str.charAt(i) == '_') continue;
//        }
//        System.out.println(stringBuilder.toString());
//    }

//    下棋先手
//    public static void main(String [] args) throws IOException {
//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        String line = bufferedReader.readLine();
//        String [] strings = new String[Integer.parseInt(line)];
//        for (int i = 0; i < strings.length; i++){
//            strings[i] = bufferedReader.readLine();
//        }
//
//        for (int i = 0; i < strings.length; i++){
//            Stack<Character> stack = new Stack<>();
//            int times = 0;
//            for (char temp : strings[i].toCharArray()){
//                if (stack.isEmpty()) stack.push(temp);
//                else {
//                    if (temp == stack.peek()) {
//                        stack.pop();
//                        times++;
//                    }
//                    else stack.push(temp);
//                }
//            }
//            if (times % 2 == 0) System.out.println("No");
//            else System.out.println("Yes");
//        }



//    }


//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int m = scanner.nextInt();
//        int n = scanner.nextInt();
//        int k = scanner.nextInt();
//
//    }

}
