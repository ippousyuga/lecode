package September;

import java.util.HashMap;
import java.util.LinkedHashMap;
/*
* 3. 无重复字符的最长子串
* 双指针法，遍历i时碰到当前子串存在的字符，则将right换为i，left换为hashmap中存放的该字符的上次出现值+1
* 并且需要先把left到该字符的上次出现索引的所有key-value移除。
* */

public class Longest_Substring_Without_Repeating_Characters {
    public int lengthOfLongestSubstring(String s) {
        if (s.length() == 0) return 0;
        HashMap <Character, Integer> hashMap = new LinkedHashMap<>();
        int left = 0, right = 0;
        int max = 0;
        for (int i = 0; i < s.length(); i++){
            if (!hashMap.containsKey(s.charAt(i))) {
                right = i;
                hashMap.put(s.charAt(i), i);
                max = Math.max(max, right - left);
            }
            else {
                for (int j = left; j < hashMap.get(s.charAt(i)); j++){
                    hashMap.remove(s.charAt(j));
                }
                left = hashMap.get(s.charAt(i)) + 1;
                hashMap.put(s.charAt(i), i);
                right = i;
                max = Math.max(max, right - left);
            }
        }
        return max + 1;
    }
}
