package August;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class The_Most_Times_Character {
    public char searchChar(String s){
        HashMap <Character, Integer> hashMap = new LinkedHashMap<>();
        for (char c : s.toCharArray()){
            if (hashMap.containsKey(c)){
                hashMap.put(c, hashMap.get(c) + 1);
            }
            else if (hashMap.containsKey((char) c - 26)) hashMap.put((char) (c - 26), hashMap.get(c) + 1);
            else if (hashMap.containsKey((char) c + 26)) hashMap.put((char) (c + 26), hashMap.get(c) + 1);
            else hashMap.put(c, 1);
        }
        char resName = ' ';
        int resCount = 0;
        for (char c : hashMap.keySet()){
            if (hashMap.get(c) > resCount){
                resCount = hashMap.get(c);
                resName = c;
            }
        }
        return resName;
    }

    public static void main(String[] args) {
        The_Most_Times_Character the_most_times_character = new The_Most_Times_Character();
        System.out.println(the_most_times_character.searchChar("trrrrree"));
    }
}
