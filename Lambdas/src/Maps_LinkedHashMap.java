import java.util.LinkedHashMap;
import java.util.Map;

public class Maps_LinkedHashMap {
    public static void main(String[] args) {
        // LinkedHashMap maintains the insertion order
        Map<String, Integer> anime_Map = new LinkedHashMap<>();
        anime_Map.put("Dog", 1);
        anime_Map.put("Cat", 2);
        anime_Map.put("Fish", 3);
        anime_Map.put("Dog", 4); // uses the last updated key value pair
        System.out.println(anime_Map);

        for (Map.Entry<String, Integer> entry : anime_Map.entrySet()) {
            System.out.println(entry.getKey() + "->" + entry.getValue());
        }
        anime_Map.forEach((s, integer) -> System.out.println(s + "->" + integer));
    }
}
