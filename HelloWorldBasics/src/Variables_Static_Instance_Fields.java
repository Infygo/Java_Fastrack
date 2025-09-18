public class Variables_Static_Instance_Fields {

    // scope of variables > variables declared and initialized inside the loop block wont be accessible outside of it
    // Exception > switch statement , variables used in one case statement can be used in another > needs to be declared in above case statement always

    //Class - custom data type that contains a code block
    //Class - consider like an application form / template thats handed over to different people
    //Objects - consider the application form thats filled in by individual applicants
    //Object / instance - is basically an instance of the class > object is created by instantiating a class

    // Static keyword - value of the field is stored only in one place and a special memory location - value doesnt change
    // value accessed by - ClassName.fieldName > note we are using the object name to access the static field
    // Instance Field - field doesnt have any value and not allocated in memory until the object is created - values changes for every objects
    // value accessed by - ObjectName.fieldName;


    // String is infact a class
    String s = "something";
    String s1 = new String("something"); // instantiated a class using keyword new


    public static void main(String[] args) {
        // scope of local variables
        int j = 2;
        switch (j) {
            case 1:
                int i = 10;
                break;
            default:
                i = 20;
                System.out.println(i);
                break;
        }


    }
}
