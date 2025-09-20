import java.util.Arrays;

public class Arrays_Search {
    public static void main(String[] args) {
        // Search
        // Linear search - transverse through all the elements in the array and look for a match
        // Interval search / Binary search - split the elements into intervals and search for the element

        // Binary search
        // ! Array must be sorted - if there are duplicate elements not sure which element might the search find
        // Element to be searched and the elements in array should be comparable = of same types

        // Arrays.binarySearch -> returns position of the match in the array
        // -1 if no match was found
        // positive number may not be the position of the 1st match
        // if duplicate values exist, find the 1st element and use other methods

        String [] sArray = new String[] {"Baker","Archi", "Danny", "Cathy", "Elena"};
        Arrays.sort(sArray);
        System.out.println("Sorted Array:" + Arrays.toString(sArray));
        System.out.println("Position of search element:" +Arrays.binarySearch(sArray, "Danny"));
    }
}
