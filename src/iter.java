import java.util.*;

public class iter {
    public static void main(String[] args){
        List list = new ArrayList();
        Map map = new LinkedHashMap();

        for (int i = 0; i < 10; i++){
            list.add(new String("list" + i));
            map.put(i, new String("map" + i));
        }
        System.out.println(map.size());

        Iterator iterlist = list.iterator();
        Iterator maplist = map.entrySet().iterator();
        while(maplist.hasNext()){
            System.out.println(maplist.next());
        }
        System.out.println(map.containsKey(11));
        map.put(10, null);
        System.out.println(map.isEmpty());
        System.out.println("ありがとう");
        map.remove(0);
        map.put(0, "map10");
        map.remove(5);
        map.put(5, "map11");
        Iterator maplist1 = map.entrySet().iterator();
        System.out.println(map);
        while(maplist1.hasNext()){
            System.out.println(maplist1.next());
        }
    }
}
