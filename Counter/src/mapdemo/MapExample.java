package mapdemo;

import java.util.HashMap;
import java.util.Map;

public class MapExample {
    public static void demoMap(){
        Map<Integer, String> person = new HashMap<>();

        person.put(1,"Chi Pu");
        person.put(2,"Ngoc Trinh");
        person.put(3,"Ngo Thanh Van");
        person.put(4,"Tony Stark");
        person.put(5,"Loki Laufeyson");

        System.out.println(person);

        person.put(2,"Peter Parker");

        System.out.println("After update: " +person);
        //remove element
        person.remove(5);
        System.out.println("After remove: " +person);

        //Show map using method entrySet()
        for(Map.Entry<Integer, String> entry: person.entrySet()){
            Integer key = entry.getKey();
            String value = entry.getValue();

            System.out.println(key + " - " + value);//Entry<Key,value>
        }
    }
}

