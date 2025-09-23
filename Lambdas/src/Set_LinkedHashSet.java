import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class Set_LinkedHashSet {
    // LinkedHashSet - No duplicates , Maintains insertion order
    public static void main(String[] args) {
        Set<Integer> nums = new LinkedHashSet<>();
        nums.add(10);
        nums.add(5);
        nums.add(15);
        nums.add(10);
        nums.add(20);
        var array_num = nums.toArray();
        Arrays.sort(array_num);
        System.out.println(Arrays.toString(array_num));
    }

}
