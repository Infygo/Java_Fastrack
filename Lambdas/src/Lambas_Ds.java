
import java.lang.reflect.Array;
import java.util.*;

public class Lambas_Ds {
    //Lambdas are basically shorthand for anonynmous class that implements a functional interface containing only one abstract method
    // Lambda syntax : (parameter1, parameter2, ..) -> expression;
    public static void main(String[] args) {
        String[] names = new String[]{"John", "Alice", "Bob", "Cara"};
        ArrayList<String> names_m = new ArrayList<>(Arrays.asList(names));
        List<String> names_imm = new ArrayList<>(List.of(names));
        //List<String> names_m = Arrays.asList(names);//mutable
        //List<String> names_imm = List.of(names);// immutable

        /*
        names_m.sort(Comparator.naturalOrder());
        names_imm.sort(Comparator.naturalOrder());
        System.out.println(names_m);
        System.out.println(names_imm);
        names_m.add("Cara");
        names_imm.add("Cara");
        System.out.println(names_m);
        System.out.println(names_imm);
         */

        // Lambda implementation on Collection - Sorting a List
        Collections.sort(names_m, (o1, o2) -> o1.compareTo(o2));
        System.out.println(names_m);

        // Lambda implementation on iterating a Collection
        List<Integer> numbers = new ArrayList<>(List.of(1, 2, 3, 4, 5));
        numbers.forEach(n -> System.out.println(n));

        // Streams & Filtering  - names starting with C
        List<String> names_1 = Arrays.asList("Alice", "Cara", "Emma", "Bob", "Charlie", "David");
        names_1.sort(Comparator.naturalOrder());
        System.out.println(names_1);
        names_1.stream().filter(s -> s.startsWith("C")).forEach(s -> System.out.println(s));

        // Streams & Maps - transform to upperCase
        names_1.stream().map(s -> s.toUpperCase()).forEach(s -> System.out.println(s));


    }


}
