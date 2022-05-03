package April;

import java.util.*;
class LRUCache {
    private int size;
    private Map<Integer, Integer> map = new LinkedHashMap();
    public LRUCache(int capacity) {
        this.size = capacity;
    }

    public int get(int key) {
        if (map.containsKey(key)){
            int temp = map.get(key);
            map.remove(key);
            map.put(key, temp);
            return temp;
        }
        return -1;

    }

    public void put(int key, int value) {
        if (map.containsKey(key)){
            map.remove(key);
        }
        else if (map.size() == size){
            Iterator maplist = map.entrySet().iterator();
            maplist.next();
            maplist.remove();
        }

        map.put(key, value);

    }
}


/**
 * Your April.LRUCache object will be instantiated and called as such:
 * April.LRUCache obj = new April.LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */