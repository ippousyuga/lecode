import java.util.*;

public class iter {
    public static void main(String[] args){
        List list = new ArrayList();
        Map map = new LinkedHashMap();

        for (int i = 0; i < 10; i++){
            list.add(new String("list" + i));
            map.put(i, new String("map" + i));
        }

        Iterator iterlist = list.iterator();
        Iterator maplist = map.entrySet().iterator();
        while(maplist.hasNext()){
            System.out.println(maplist.next());
        }

    }
}
