import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class Set_TreeSet {
    public static void main(String[] args) {
        // TreeSet - no duplicates, Sorted order
        String[] name_Array = new String[]{"Bob", "Alice", "Danny", "Charlie", "Emma"};
        Set<String> names_TreeSet = new TreeSet<>();
        names_TreeSet.addAll(Arrays.asList(name_Array));
        System.out.println(names_TreeSet);
    }
}
