package April;

public class Demo {
    private static void instanceofTest() {
        Object obj = "Java 中文社群";
        // 旧写法
        if (obj instanceof String) {
            String s = (String) obj;
            System.out.println(s);
        }
        // 新写法
        if (obj instanceof String s) {
            System.out.println(s);
        }
    }
    public static void main(String[] args){
        instanceofTest();
    }

}
