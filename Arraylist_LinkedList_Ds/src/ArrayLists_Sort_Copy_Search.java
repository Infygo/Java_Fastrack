import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ArrayLists_Sort_Copy_Search {
    public static void main(String[] args) {
        List<String> list = List.of("apples", "bananas", "chocolate");
        ArrayList<String> groceryList = new ArrayList<>(list);
        System.out.println(groceryList);

        ArrayList<String> newGroceryList = new ArrayList<>(List.of("Dairy", "Eggs", "Fanta"));
        System.out.println(newGroceryList);

        // use of add & addAll
        groceryList.addAll(newGroceryList);
        System.out.println("Combined grocery list:" + groceryList);
        groceryList.add("Joghurt");
        System.out.println(groceryList);

        // indexOf / lastIndexOf
        System.out.println(groceryList.indexOf("Joghurt"));
        groceryList.add("Eggs");
        System.out.println(groceryList);
        System.out.println(groceryList.lastIndexOf("Eggs"));

        // contains
        if (groceryList.contains("Fanta")) {
            System.out.println("List contains Fanta");
        }

        // remove & removeAll
        groceryList.remove(7);
        System.out.println(groceryList);
        groceryList.remove("Joghurt");
        System.out.println(groceryList);

        List<String> itemsRemoved = List.of("Eggs", "Fanta");
        groceryList.removeAll(itemsRemoved);
        System.out.println("List after items removed:" + groceryList);

        // clear & isEmpty
        newGroceryList.clear();
        System.out.println(newGroceryList.isEmpty() ? "List is empty" : "List is not empty");

        // Arrays.asList & comparator
        groceryList.addAll(Arrays.asList("Gummies", "Hahnchen", "icecream"));
        System.out.println(groceryList);
        groceryList.sort(Comparator.reverseOrder());
        System.out.println("List sorted reverse:" + groceryList);


        // Arraylist to Array
        //var groceryArray = groceryList.toArray(new String[groceryList.size()]);
        var groceryArray = groceryList.toArray();
        System.out.println(Arrays.toString(groceryArray));

        // Key difference between arrays and arraylists
        // Arrays supports primitive types - Integer, Float, Char, Boolean > Arraylist doesnt
        // Arrays not resizeable > Arraylist resized
        // Arraylist implements list interface - Arrays doesnt
        // Mutable - can be changed


        // Use of Arrays.asList & List.of
        String[] array_Strings = new String[]{"Sunday", "Monday", "Tuesday"};
        var arrays_asList = Arrays.asList(array_Strings);// Returns a list thats mutable but not resizable
        System.out.println(arrays_asList);

        // Mutable but not resizable > cant add a new element and change the size
        arrays_asList.set(0, "Saturday");
        System.out.println("List after change:" + arrays_asList);
        System.out.println("Array after change:" + Arrays.toString(array_Strings));

        // newList.add("Sunday"); //Exception in thread "main" java.lang.UnsupportedOperationException
        // Mutable
        arrays_asList.sort(Comparator.naturalOrder());
        System.out.println("After sort list:" + arrays_asList);
        System.out.println("After sort array:" + Arrays.toString(array_Strings));

        // Use of List.of > returns an immutable list
        var list_Of = List.of(array_Strings); // returns an immutable list
        System.out.println(list_Of);
        // list_Of.sort(Comparator.reverseOrder()); // unsupported op since it returned an immutable list
        //list_Of.add("Wednesday"); // Unsupported op
        System.out.println(list_Of);


        // Converting ArrayList to Array
        ArrayList<String> weekDays = new ArrayList<>(List.of("S", "M", "T"));
        System.out.println(weekDays);
        var array_Weekdays = weekDays.toArray(new String[0]);
        System.out.println(Arrays.toString(array_Weekdays));


    }
}
