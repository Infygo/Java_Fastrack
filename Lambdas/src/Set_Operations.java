import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Set_Operations {
    public static void main(String[] args) {
        // Set Operations - union , intersection, difference
        Set<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3, 4));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(3, 4, 5, 6));

        // Combine two sets - addAll
        Set<Integer> union = new HashSet<>(set1);
        union.addAll(set2); // removal of duplicates and unioned
        System.out.println("Union of 2 sets: " + union);

        // Intersection - retainAll
        Set<Integer> intersection = new HashSet<>(set1);
        intersection.retainAll(set2);
        System.out.println("Intersection of 2 sets: " + intersection);

        // Difference - removeAll
        Set<Integer> diff = new HashSet<>(set1);
        diff.removeAll(set2);
        System.out.println("Difference of 2 sets: " + diff);
    }
}
