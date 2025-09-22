import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class Autoboxing_Unboxing {

    // Primitive data types and objects
    // Java supports both of the above
    // Primitive types - represents the way data is stored in a system
    // Primitive types >> objects as they consume less memory and processing power

    // ArrayLists and LinkedLists doesnt support primitive types - Arrays support though
    // LinkedList<int> myInteger = new LinkedList<int>(); - Type argument cannot be of a primitive type
    // Wrapper classes as workaround for the primitive types
    // Boxing - Primitive to wrapper
    // unboxing - wrapper to primitive
    // cant use methods on primitive types

    public static void main(String[] args) {
        // Boxing - wrap / box primitive types to wrapper
        Integer autoBox1 = Integer.valueOf(15);
        Integer autoBox2 = 15;
        System.out.println(autoBox2.getClass().getName());

        // Unboxing unwrap wrapper to primitive type
        int autoUnbox1 = autoBox2;

        //System.out.println(autoUnbox1.getClass().getName); // Cannot call methods on 'int' type
        Double result_autoboxed = getDoublePrimitive(); //autoboxing , assigned to a object type
        double result_autounboxed = getDoubleObject(); // returns an object instance but gets auto unboxed and assigned to a primitive variable

        // Explained better on Autoboxing -> primitive types gets boxed/ wrapped by the wrapper class
        Integer[] wrapperArray = new Integer[5]; // Integer wrapper class
        wrapperArray[0] = 50; // assigning a primitive value 50 to the Integer wrapper class because they are autboxed
        System.out.println(Arrays.toString(wrapperArray));
        System.out.println(wrapperArray[0].getClass().getName());// java.lang.Integer -> since 50 got autoboxed by jvm automatically

        Character[] charArray = new Character[]{'a', 'b', 'c', 'd'};
        System.out.println(Arrays.toString(charArray));
        var ourList = getList(1, 2, 3, 4, 5);
        System.out.println(ourList);

    }

    private static ArrayList<Integer> getList(int... varargs) {
        ArrayList<Integer> aList = new ArrayList<>();
        for (int i : varargs) {
            aList.add(i);
        }
        return aList;
    }

    private static int returnAnInt(Integer i) {
        return i; // -> return type is int -> while passed arg is of object Integer type -> AutoUnboxed
    }

    private static Integer returnAnInteger(int i) {
        return i; // -> return type is Object Integer -> passed a primitive type int -> Autboxed to Integer
    }

    private static Double getDoubleObject() {
        return Double.valueOf(100.00);
    }

    private static double getDoublePrimitive() {
        return 100.0;
    }


}
