package May;

public class test {
    public static void main(String[] args){
        String a = "aa";
        String b = "aba";
        Ransom_Note ransom_note = new Ransom_Note();
        boolean result = ransom_note.canConstruct(a, b);
        System.out.println(result);

    }
}
