import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

record GroceryItem(String name, String type, int count) {
    public GroceryItem(String name) { // Explicit 1 arg constructor
        this(name, "DAIRY", 1);
    }

    @Override
    public String toString() {
        return String.format("%d %s in %s", count, name.toUpperCase(), type);
    }

}

public class ArrayList_Ds {
    public static void main(String[] args) {
        // Java containers that facilitate overcoming limitations of arrays
        // Can resize the array , which is not possible in normal arrays
        // Arrays are mutable but cant resize the size of it

        // Lists > Java containers > Arraylist and LinkedList
        // Arraylist resizable array

        // record is basically a java class with less boilerplate code
        // has constructors, getters, setters automatically generated
        // used in data transfer objects and its immutable
        // Line 24 and 26 shows the issue with using object type of arrays that will accept any values without type checking

        //Object [] groceryArray = new Object[3];
        GroceryItem[] groceryArray = new GroceryItem[3];
        groceryArray[0] = new GroceryItem("milk");
        groceryArray[1] = new GroceryItem("apples", "PRODUCE", 6);
        //groceryArray[2] = "5 oranges";
        groceryArray[2] = new GroceryItem("oranges", "PRODUCE", 5);
        System.out.println(Arrays.toString(groceryArray));

        // Arraylist needs always the type specified between <> diamond operator

        ArrayList object = new ArrayList();
        object.add(new GroceryItem("Butter"));
        object.add("Yoghurt"); // works still but i expect it to accept only Groceryitem type -> unchecked call to add as member of raw type warning

        ArrayList<GroceryItem> groceryList = new ArrayList<>(); // facilitates type checking, resizable unlike an Array
        groceryList.add(new GroceryItem("Butter"));
        //groceryList.add("Yoghurt"); // type checking happens and throws error asking to provide GroceryItem type
        groceryList.add(new GroceryItem("milk"));
        groceryList.add(new GroceryItem("oranges", "FRUIT", 8));
        System.out.println(groceryList);

        // update the grocery list to have apples on top
        // use add method
        groceryList.add(0, new GroceryItem("apples", "fruit", 5));
        System.out.println("List after update:" + groceryList);

        // use of set method
        groceryList.set(0, new GroceryItem("bananas", "fruit", 2));
        System.out.println("List after set update:" + groceryList);
        // use of remove method
        groceryList.remove(1);
        System.out.println("List after remove:"+groceryList);

        // ArrayList doesnt work with primitive types like int
        //ArrayList<int> intArrayList = new ArrayList<int>(10); // Type argument cannot be of a primitive type
        ArrayList<Integer> integerArrayList = new ArrayList<>(10); // works because we are using a wrapper class

    }
}

