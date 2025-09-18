import java.util.Scanner;

public class Parse_ReadInput_Exception {
    public static void main(String[] args) {
        // read from console in terminal using System.console().readLine
        // read from scanner - can parse primitive types and string from user inputs
        // Parsing String into an int using Integer static class > Integer.parseInt(String)
        try {
            getInputFromConsole(2025);
        } catch (NullPointerException e) {
            System.out.println(getInputFromScanner(2025));
        }

    }

    public static String getInputFromConsole(int currentYear) {
        String name = System.console().readLine("Hi whats your name"); // works only from terminal
        System.out.println("Hi " + name + "Thanks for taking the course");

        String yearOfBirth = System.console().readLine("What year were you born?");
        int age = currentYear - Integer.parseInt(yearOfBirth);
        System.out.println("So you are " + age + " years old");
        return "";
    }

    public static String getInputFromScanner(int currenYear) {
        Scanner sc = new Scanner(System.in); // use of Scanner class hence instantiating it
        System.out.println("Hi whats your name?");
        String name = sc.nextLine();
        System.out.println("What year were you born?");
        String yob = sc.nextLine();
        int age = currenYear - Integer.parseInt(yob);
        return "So you are " + age + "years old";
    }


}
