import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Set_HashSet {
    // Hashset - No duplicates, Unordered(inserted at any random position)
    public static void main(String[] args) {
        String[] fruit_Arrays = new String[]{"Apple", "Cherry", "Banana", "Mango", "Banana"};
        Arrays.sort(fruit_Arrays);
        System.out.println(Arrays.toString(fruit_Arrays));
        Set<String> fruits = new HashSet<>(Arrays.asList(fruit_Arrays));
        /*
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        fruits.add("Mango");
         */
        //fruits.addAll(Arrays.asList(fruit_Arrays));
        System.out.println(fruits);
    }
}
