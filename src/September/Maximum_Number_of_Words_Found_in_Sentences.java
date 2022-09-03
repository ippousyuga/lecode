package September;

public class Maximum_Number_of_Words_Found_in_Sentences {
    public int mostWordsFound(String[] sentences) {
        int max = 0;
        for (String string : sentences){
            int count = 0;
            for (char ch : string.toCharArray()){
                if (ch == ' ') count += 1;
            }
            max = Math.max(count, max);
        }
        return max + 1;
    }
}
