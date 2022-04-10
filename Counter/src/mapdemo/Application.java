package mapdemo;


import java.util.HashMap;
import java.util.Map;

public class Application {
    public static void main(String [] args) {
        MapExample.demoMap();

        Employee employee1 = new Employee(1,"huyen", "huyen@gmail.com","0900000");
        Employee employee1 = new Employee(1,"binh", "binh@gmail.com","0900000");
        Employee employee1 = new Employee(1,"tung", "tung@gmail.com","0900000");
        Employee employee1 = new Employee(1,"trong", "trong@gmail.com","0900000");
        Employee employee1 = new Employee(1,"thang", "thang@gmail.com","0900000");

        Map<Integer,Employee> map = new HashMap<Integer, Employee>();

        map.put(employee1.getId(),employee1);


        for (Integer key : map.keySet()){
            Employee value = map.get(key);
            System.out.println(key = " - " + value);
        }

        System.out.println("================================");
        // Show map using method entryKey()
        for (Map.Entry<Integer,Employee> entry: map.entrySet()){
            Integer key = entry.getKey();
            Employee value = entry.getValue();
            System.out.println(key + " _ " + value);
        }

    }


}
