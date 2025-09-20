import java.util.Arrays;

public class Arrays_References {
    public static void main(String[] args) {

        // Array references
        // anotherArray is basically a reference variable for the array object myIntArray in memory
        // so when the myIntArray value in memory is changed the reference variable anotherArray will be pointing to the updated values
        int[] myIntArray = new int[5] ;
        int[] anotherArray = myIntArray;

        System.out.println("My array values:" + Arrays.toString(myIntArray));
        System.out.println("Another array referencing myarray:" + Arrays.toString(anotherArray));

        // myIntArray and anotherArray are basically references to the same array object in memory
        // hence their changes will reflect each other
        myIntArray[0] = 1;
        System.out.println("My array values after change:" + Arrays.toString(myIntArray)); //[1, 0, 0, 0, 0]
        System.out.println("Another array referencing myarray:" + Arrays.toString(anotherArray));// [1, 0, 0, 0, 0]

        anotherArray[1] = 2;
        System.out.println("My array values after change:" + Arrays.toString(myIntArray)); //[1, 2, 0, 0, 0]
        System.out.println("Another array referencing myarray:" + Arrays.toString(anotherArray));//[1, 2, 0, 0, 0]

    }
}
