import java.util.Arrays;

public class Array_Basics {
    // Array - DS that allows to have multiple sequence of values of same data type
    // can hold primitive types like int, double, booleans, String
    // Syntax - Datatype[] name - Array cant be resized
    // Array is a class and hence needs to be instantiated
    // int [] numArray = new int [10]; -> size needs to be specified
    // array instantiation doesnt have () meaning it cant be parameterized to be passed for a constructor of a array
    // Limitations
    // cant be resized, cant add / delete elements, only assign values to one of the ten elements in the array
    // cant change the size of an array after instantiation

    // When array initializer is not used then array gets initialized with default values
    // 0 for primitive types
    // false for boolean , null for String
    // null for any array of class type

    public static void main(String[] args) {

        int[] intArray = new int[5]; // standard way of declaring and initializing an array
        intArray[0] = 1;
        intArray[1] = 2;
        intArray[2] = 3;
        System.out.println("Size of the array:" + intArray.length);

        // How do i intiailize many elements in one go ??
        // Array initializer
        int[] numArray_1 = new int[]{1, 2, 3, 4, 5}; // type1 > prefer this 
        int[] numArray_2 = {6, 7, 8, 9, 10}; //type2

        for (int i = 0; i < numArray_2.length; i++) {
            System.out.print(numArray_2[i]+ "\n");
        }

        double[] dNumbers = new double[]{1.0, 2.0, 3.0, 4.0, 5.0};
        // enhanced for loop / for each
        for (double j : dNumbers) {
            System.out.println(j);
        }

        // Array utilities
        // Array.toString -> static method to convert array of elements , comma delimited, contained in square brackets

        int[]numArray_3 = new int[]{1,2,3,4,5};
        System.out.println("Print the arrays:" + numArray_3); //[I@5ca881b5 -> infers its an integer of arrays but shows only hexdec values
        System.out.println("Array to String :" + Arrays.toString(numArray_3));

        // check what instance of array object we are using exactly
        Object objVariable = numArray_3;
        if(objVariable instanceof int[]){
            System.out.println("Array is of int object instance ");
        }

        // creating an Array of Object
        Object [] objArray = new Object[3];
        objArray[0] = "Hello";
        objArray[1] = new StringBuilder("World");
        objArray[2] = numArray_3;

    }
}
