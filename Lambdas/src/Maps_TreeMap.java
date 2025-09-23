import java.util.Map;
import java.util.TreeMap;

public class Maps_TreeMap {
    public static void main(String[] args) {
        // TreeMap - makes the key ordered
        Map<String, Integer> name_Age = new TreeMap<>();
        name_Age.put("bob", 25);
        name_Age.put("cathy", 30);
        name_Age.put("alice", 35);
        name_Age.put("martha", 60);
        System.out.println(name_Age); // returns an orderd map based on keys

        // Iterate over keys
        for (String i : name_Age.keySet()) {
            System.out.println(i);
        }

        // Iterate over values
        for (int i : name_Age.values()) {
            System.out.println(i);
        }

        // Iterate over the map using foreach lambdas
        name_Age.forEach((s, integer) -> System.out.println("Key: " + s + " Values: " + integer));

        // Iterate over the map using entryset
        for (Map.Entry<String, Integer> entry : name_Age.entrySet()) {
            System.out.println(entry.getKey() + "->" + entry.getValue());
        }
    }
}
