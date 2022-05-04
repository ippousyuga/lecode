package May;
import java.util.*;
/*
* 242.有效的字母异位词
* 哈希表的定义不用int char
* string.toCharArray()方法转换为字符数组类型
* for(char : charArray)
* map.getOrDefault(char, defaultValue),没有该key时，设置默认为defaultValue
* value为1时，直接remove掉
* 最后通过map.isEmpty()判断
* */
public class Valid_Anagram {
    public boolean isAnagram(String s, String t) {
    Map<Character, Integer> map = new HashMap<>();
    for (char chars : s.toCharArray()){
        map.put(chars, map.getOrDefault(chars, 0) + 1);
    }
    for (char chart : t.toCharArray()){
        Integer count = map.get(chart);
        if (count == null) return false;
        else if (count > 1) map.put(chart, --count);
        else map.remove(chart);
    }
    return map.isEmpty();
}
}
