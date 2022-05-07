package May;
import java.util.*;
/*
* 383.赎金信
* 基本哈希题
* */


public class Ransom_Note {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap <Character, Integer> hashmap = new HashMap<>();
        for (int i = 0; i < ransomNote.length(); i++){
            char a = ransomNote.charAt(i);
            if (hashmap.containsKey(a)) hashmap.put(a, hashmap.get(a) + 1);
            else hashmap.put(a, 1);
        }
        for (int j = 0; j < magazine.length(); j++){
            char b = magazine.charAt(j);
            if (hashmap.containsKey(b)){
                if (hashmap.get(b) > 1) hashmap.put(b, hashmap.get(b) - 1);
                else hashmap.remove(b);
            }
        }
        return hashmap.isEmpty();
    }
}
