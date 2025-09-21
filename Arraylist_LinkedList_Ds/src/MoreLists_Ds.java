import java.util.ArrayList;
import java.util.List;

public class MoreLists_Ds {
    public static void main(String[] args) {
        // create a string of array items
        String[] items = new String[]{"apples", "bananas", "milk", "eggs"};

        // Immutable lists
        List<String> list = List.of(items);
        System.out.println(list);
        //list.add("mango"); // Exception - immutable collections - immutable object is modified
        System.out.println(list);

        // Use of Arraylist to make it mutable
        ArrayList<String> groceryList = new ArrayList<>(list);
        groceryList.add("yoghurt");
        System.out.println(groceryList);

        ArrayList<String> nextList = new ArrayList<>(List.of("pickles", "mustard", "cheese"));
        // use of addAll method to add another array list to array list
        groceryList.addAll(nextList);
        System.out.println("Combined list:" + groceryList);
        System.out.println(nextList);

        // use of get method
        System.out.println(groceryList.get(2));

    }
}
