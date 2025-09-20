import java.util.Arrays;
import java.util.Random;

public class Arrays_Utils {
    // will explore java.util.Arrays - helper class
    // Arrays.toString(array)
    // Arrays.sort(array) -> sorts
    // Arrays.fill(array , value) -> fills an array with a specific value
    public static void main(String[] args) {
        int[] firstArray = getRandomIntArray(5);
        System.out.println(Arrays.toString(firstArray));// returns Array of ints as String in csv and with [] braces

        // Array sort
        Arrays.sort(firstArray);
        System.out.println("Arrays after sort:" + Arrays.toString(firstArray)); // Array after sort

        // Array fill
        int[] secondArray = new int[5]; // intialized array of 5 elements with default value 0 for primitive types
        System.out.println("Arrays before fill:" + Arrays.toString(secondArray));
        Arrays.fill(secondArray, 5); // filling it with value of 5
        System.out.println("Array after fill:" + Arrays.toString(secondArray));

        // Array copy > supports copy of same length, smaller length and larger length as well
        int[] thirdArray = getRandomIntArray(5);
        System.out.println("Third Array:" + Arrays.toString(thirdArray));
        int[] fourthArray = Arrays.copyOf(thirdArray, thirdArray.length);
        System.out.println("Copy of 3rd Array:" + Arrays.toString(fourthArray));
        Arrays.sort(fourthArray);
        System.out.println("Sorting the 4th array:" + Arrays.toString(fourthArray));
        System.out.println("Checking 3rd array if its impacted:" + Arrays.toString(thirdArray));

        // Arrays.equals compares two arrays checks if they are same length and elements with order
        int[] s1 = new int[]{5, 4, 3, 2, 1};
        int[] s2 = new int[]{1,2,3,4,5};
        System.out.println("Check if arrays are equal:" + Arrays.equals(s1, s2));
        Arrays.sort(s1);
        System.out.println("Check if arrays are equal after sort:" + Arrays.equals(s1, s2));
    }

    // create an array accepting only length arg , with random elements
    public static int[] getRandomIntArray(int l) {
        Random random = new Random();
        int[] intArray = new int[l];
        for (int i = 0; i < l; i++) {
            intArray[i] = random.nextInt(100);
        }
        return intArray;
    }
}
