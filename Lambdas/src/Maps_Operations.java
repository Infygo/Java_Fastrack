import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Maps_Operations {
    public static void main(String[] args) {
        // Maps and operations commonly used
        // Basic operations
        Map<String, Integer> fruits = new HashMap<>();
        //add value to the map
        fruits.put("Apple", 1);
        fruits.put("Banana", 1);
        fruits.put("Cherry", 1);
        fruits.putIfAbsent("Dragonfruit", 3); // add key if its absent in the Map collections
        System.out.println(fruits);
        System.out.println(fruits.get("Apple")); // get value for the key
        System.out.println(fruits.size()); // 2 size
        fruits.remove("Apple");
        System.out.println(fruits);
        System.out.println(fruits.isEmpty());

        // Iterating over Maps 2 methods
        // Method1 Entryset
        System.out.println(fruits);
        System.out.println("Looping Maps using EntrySet");
        for (Map.Entry<String, Integer> entry : fruits.entrySet()) {
            System.out.println(entry.getKey() + "->" + entry.getValue());
        }

        // Method2 Lambda foreach
        System.out.println("Looping Maps using foreach lambda");
        fruits.forEach((s, integer) -> System.out.println(s + " ->" + integer));

        //Replace and update values
        Map<String, Integer> score = new HashMap<>();
        score.put("Alice", 85);
        score.put("Bob", 90);

        //Replace
        score.replace("Alice", 90);
        System.out.println(score);

        // update values - use compute
        score.compute("Alice", (s, v) -> v + 5);
        System.out.println("After compute update: " + score);
        score.computeIfAbsent("Charlie", s -> 70);
        System.out.println("After computeIfAbsent update:" + score);

        // merge values
        score.merge("Bob", 10, (integer, integer2) -> integer + integer2);
        System.out.println("Score after merge: " + score);

        // Sorting a Map
        // TreeMap uses by default sorted collection
        // Sort by keys
        System.out.println("Before Sort: " + score);
        Map<String, Integer> treeMap = new TreeMap<>(score);
        System.out.println("After Sort: " + treeMap);

        //sort by values - using Entry set, stream, sort
        System.out.println("Sort by values in the Map");
        score.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(stringIntegerEntry -> System.out.println(stringIntegerEntry));

        //

    }
}
