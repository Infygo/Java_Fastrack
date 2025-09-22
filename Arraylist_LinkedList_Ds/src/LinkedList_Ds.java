import java.util.*;

public class LinkedList_Ds {
    public static void main(String[] args) {

        // Arrays and ArrayLists for reference types
        // the elements arent values but basically the addresses of the referenced objects or String
        // the addresses are stored continugously in memory but not the objects
        // when removing an element from the array or arraylist the addresses have to reindexed or shifted to remove an empty space
        // when adding an element the array that backs the arraylist might be too small and hence it has to get reallocated
        // expensive and time consuming operations
        // example
        ArrayList<Integer> integerArrayList = new ArrayList<>(10);
        for (int i = 0; i < 10; i++) {
            integerArrayList.add(i, (i + 1) * 5);
        }
        System.out.println(integerArrayList);

        // Big O represents the cost of an operation for certain number of elements 'n'
        // Cost = time + memory consumption + complexity
        // Costs can grow linearly over n number of elements
        // Costs can grow exponentially over n number of elements
        // O(1)=> constant time ==> time and complexity doest change
        // O(n) => linear time ==> time and complexity changes over number of element linearly
        // O(1)* => Amortized time ==> cost is close to O(1) but in few intervals its O(n) => if the capacity of list is already
        // allocated to the element to be added , cost is same each time regardless how many elements we add
        // once the capacity is reached it needs to reallocate the n elements costing O(n) and then it becomes O(1) again
        // So for Arraylists DS the best big O notation is O(1) and worst would be O(n) for add / remove ops

        // To avoid such time complexity problems use LinkedList
        // LinkedList => no indexing and addresses arent stored in a neat way
        // Each element added to the linked list forms a chain to the previous element and the next element
        // Doubly linked list => each element is linked to the previous and next element
        // first element linked to previous element (null) - HEAD(Beginning)
        // Last element linked to next element(null) - TAIL(End)
        // Why LinkedList has best Big(0) because reallocation of memory to accomodate the add or removal of element is not needed

        // LinkedList has better Big(0) when adding or removal of elements from the list compared to the ArrayList
        // Because the list doesnt need any reindexing after the change

        // ArrayList are implemented on top of an Array
        // LinkedList is a doubly linked list
        // Both ArrayList and LinkedList implements all of List method but the LinkedList also implements the Queue and Stack methods
        // Remove an element poll queue and get first element of the queue -> Add element offer into the queue and get last element of the queue
        // Double ended queue facilitates access both from the start and end of the queue
        // LinkedList can be used as a Stack as well => Last In First Out => push at top of the stack and pop it from the stack

        // LinkedList<String> cityToVisit = new LinkedList<>();
        var cityToVisit = new LinkedList<String>();

        // Add elements - .add methods
        cityToVisit.add("Melbourne");
        cityToVisit.add(0, "Canberra");
        System.out.println(cityToVisit);
        addMoreElements(cityToVisit);
        System.out.println(cityToVisit);
        //removeElements(cityToVisit);
        //getElements(cityToVisit);
        traverseList(cityToVisit);
        travelItineray(cityToVisit);


    }

    private static void addMoreElements(LinkedList<String> cities) {

        // addFirst and addLast
        cities.addFirst("Darwin");
        cities.addLast("Hobart");

        // Queue methods to add elements
        cities.offer("Sydney"); // offers to join the queue at last
        cities.offerFirst("AliceSprings"); // offers to join at the first in queue
        cities.offerLast("Tubowa"); // offers to join at last in the queue

        //Stack
        cities.push("Wales"); // Pushes the element at top of the stack

    }

    private static void removeElements(LinkedList<String> cities) {

        //remove methods
        //[Wales, AliceSprings, Darwin, Canberra, Melbourne, Hobart, Sydney, Tubowa]
        String s1 = cities.remove(); //removes the first element
        System.out.println(s1 + "- city removed");
        cities.remove("AliceSprings");
        cities.remove(0); // removes Darwin city at 0 index
        System.out.println(cities);
        String s2 = cities.removeFirst(); // canberra removed
        System.out.println(s2 + "- city removed");
        String s3 = cities.removeLast();
        System.out.println(s3 + "- city removed ");
        System.out.println(cities);

        // Queue methods to remove -> Poll
        String s4 = cities.poll(); // first element head removed
        System.out.println(s4 + "- city removed ");
        cities.pollFirst(); //Hobart
        cities.pollLast();// Sydney
        System.out.println(cities);

        cities.push("Canberra");
        cities.push("Melbourne");
        cities.push("Sydney");  //[Sydney, Melbourne, Canberra]
        // Stack methods to remove

        System.out.println(cities);
        cities.pop(); // removes the first element Last In First out Sydney
        System.out.println(cities);


    }

    private static void getElements(LinkedList<String> cities) {

        // use get methods - getFirst, getLast, get(i)
        System.out.println("First city:" + cities.get(0));
        System.out.println("First city:" + cities.getFirst());
        System.out.println("Last city:" + cities.getLast());

        // Queue methods to get -> head and tail
        System.out.println("Queue first city: " + cities.element()); // returns head of the list

        // Stack methods to get -> peek
        System.out.println("Stack to get first city:" + cities.peek()); // returns head of the list
        System.out.println("Stack to get last city:" + cities.peekLast());

    }

    // Tranversing through a linkedlist - method1
    public static void traverseList(LinkedList<String> cities) {
        System.out.println("Travel starts at: " + cities.getFirst());
        for (int i = 1; i < cities.size(); i++) {
            System.out.println("--> Travel begins: " + cities.get(i - 1) + "--> Travel ends: " + cities.get(i));
        }
    }


    // Traversing through a linkedlist - method2
    private static void travelItineray(LinkedList<String> cities) {
        //System.out.println("Trip starts from:" + cities.getFirst());
        String previousCity = cities.getFirst();
        for (var city : cities) {
            System.out.println("Trip starts from->" + previousCity + " ends at->" + city);
            previousCity = city;
        }
    }

}
