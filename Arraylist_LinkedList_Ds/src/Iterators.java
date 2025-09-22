import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Iterators {
    public static void main(String[] args) {

        // Iterator
        // cursor position at start is usually before the first element
        // cursor positions itself between 1 and 2nd element so .next() will be true
        // cursor position below last element will make .next false

        // Iterator allows only forward traversing and supports only remove method
        // ListIterators allows to navigate both forward and reverse and supports both add, set, remove methods
        // iterator.hasNext , iterator.hasPrevious

        LinkedList<String> cities = new LinkedList<>(List.of("AliceSprings", "Brisbane", "Canberra", "Darwin", "Melbourne", "Sydney", "Tubowa", "Brisbane"));
        listIterator(cities);
        //testIterator(cities);
        //travelIterator(cities);
        //getDuplicate(cities);

    }

    public static void testIterator(LinkedList<String> cities) {
        // create an iterator variable
        var iterator = cities.iterator(); // creating an iterator on the list
        int count = 0;
        while (iterator.hasNext()) {
            if (iterator.next().equals("Brisbane")) {
                iterator.remove();
            }
        }
        System.out.println(cities);
    }

    public static void listIterator(LinkedList<String> cities) {
        var iterator = cities.listIterator();
        System.out.println("Cities before: " + cities);
        while (iterator.hasNext()) {
            if (iterator.next().equals("Brisbane")) {
                iterator.remove();
                iterator.add("Lake Wivenhoe");
            }
        }
        System.out.println("Cities after: " + cities);
        var iterator2 = cities.listIterator(3);
        System.out.println(iterator2.previous());

    }

    public static void travelIterator(LinkedList<String> cities) {
        System.out.println("Trip starts at: " + cities.getFirst());
        String previousCity = cities.getFirst();
        ListIterator<String> iterator = cities.listIterator(1);
        while (iterator.hasNext()) {
            var city = iterator.next();
            System.out.println("-->From: " + previousCity + " to " + city);
            previousCity = city;
        }
    }

    public static void getDuplicate(LinkedList<String> cities) {
        cities.sort(Comparator.naturalOrder());
        System.out.println(cities);
        //String cityCompare = cities.getFirst();
        for (int i = 1; i < cities.size(); i++) {
            if (cities.get(i - 1).equals(cities.get(i))) {
                System.out.println("Duplicate City in the list:" + cities.get(i));
                cities.remove(i);
            }
        }
        System.out.println("After removing duplicate city:" + cities);
    }
}
