public class Varargs {
    public static void main(String[] args) { // Arguments > array of string or pass data from commmand line if we
        // use this method as the entry point

        // can be replaced with public static void main(String ... args){}
        // implies the method can accept 1, 2, or any number of strings as arguements and will create an array
        // to process them in the method

        // Limitations
        // can have only one variable arg
        // the variable arg must be the last arg

        //String s1 = "Hello world again";
        String[] s1 = "Hello world again".split(" ");
        printText(s1);

        printTextVargs("Hello"); //
        printTextVargs("Hello", "World", "Again");
        // instead of overloading the method again
        // same method can be used to handle multiple number of args
        // works with 1 string , 2 strings or even array of strings
        printTextVargs(s1);
    }

    public static void printText(String[] s) {
        for (String t : s) {
            System.out.println(t);
        }
    }

    // use of varargs method example
    public static void printTextVargs(String... s) {
        for (String t : s) {
            System.out.println(t);
        }
    }
}
