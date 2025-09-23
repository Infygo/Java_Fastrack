import java.util.HashMap;
import java.util.Map;

public class Maps_HashMaps {
    public static void main(String[] args) {
        // Maps are basically part of collection frameworks
        // Key value pair
        // HashMap - unordered, unique keys , values can be duplicated, no duplicate key entries basically
        // keys gets replaced with new values

        Map<String, Integer> map_Fruits = new HashMap<>();
        map_Fruits.put("Apple", 10);
        map_Fruits.put("Banana", 8);
        map_Fruits.put("Cherry", 6);
        map_Fruits.put("Dorino", 6); // values duplicated
        map_Fruits.put("Apple", 4); // Apple gets updated
        System.out.println(map_Fruits);
        for (Map.Entry<String, Integer> entry : map_Fruits.entrySet()) {
            System.out.println(entry.getKey() + "->" + entry.getValue());
        }

        map_Fruits.forEach((s, integer) -> System.out.println(s + "->" + integer));
    }
}
