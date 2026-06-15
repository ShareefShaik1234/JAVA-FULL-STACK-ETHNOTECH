package day9.Collections;

import java.util.HashMap;
import java.util.Map;
public class HashMaps {
    public static void main(String[] args) {
        HashMap<String,Integer> map = new HashMap<>();
        map.put("House1",1);
        map.put("House2",0);
        map.put("House3",1);
        map.put("House4",2);

//        for(String key:map.keySet()){
//            System.out.println(key + ":" + map.get(key));
//        }
        for(Map.Entry<String,Integer> entry:map.entrySet()){
            System.out.println(entry.getKey()+ ":" +entry.getValue());
        }
        System.out.println(map.putIfAbsent("House0",100));
        for(Map.Entry<String,Integer> entry:map.entrySet()){
            System.out.println(entry.getKey()+ ":" +entry.getValue());
        }
        System.out.println(map.putIfAbsent("House0",100));
    }
}
