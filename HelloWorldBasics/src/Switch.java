public class Switch {
    public static void main(String[] args) {

        // Switch supports only limited data types > cannot work with double, float, long , boolean types and their wrappers
        // byte, short, int, char
        // String , enum
        int switchValue = 4;
        switch (switchValue) {
            case 1:
                System.out.println("Value is 1");
                break;
            case 2:
                System.out.println("Value is 2");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Was either 3 or 4 or 5");
                System.out.println("It was :" + switchValue);
                break; // if break is removed then fall through happens to the next block - will print the default block statement as well
            default:
                System.out.println("wasnt between 1 - 5");
        }
        System.out.println(getQuarter("xyz") + "quarter");
        System.out.println(tradSwitch('B'));
        System.out.println(enhSwitch('C'));

        //Advanced Switch statement
        // replace : with -> , no need of breaks
        // yield to be used in a code block instead of return

    }

    public static String getQuarter(String month) {
        return switch (month) {
            case "Jan", "Feb", "Mar" -> "1st";
            case "Apr", "May", "Jun" -> "2nd";
            case "Jul", "Aug", "Sep" -> "3rd";
            case "Oct", "Nov", "Dec" -> "4th";
            default -> { // use of code block hence needs to have yield
                String badResponse = month + "is bad";
                yield badResponse;
            }
        };
    }

    // traditional switch statement challenge
    public static String tradSwitch(char letter) {
        switch (letter) {
            case 'A':
                return "Able";
            case 'B':
                return "Baker";
            case 'C':
                return "Charlie";
            case 'D':
                return "Dog";
            case 'E':
                return "Easy";
            default:
                return "Not matched";
        }
    }

    // enhanced switch version
    public static String enhSwitch(char letter) {
        return switch (letter) {
            case 'A' -> "Able";
            case 'B' -> "Baker";
            case 'C' -> "Charlie";
            case 'D' -> "Dog";
            case 'E' -> "Easy";
            default -> {
                String unknown = "Not a phoenetic";
                yield unknown;
            }
        };
    }
}

