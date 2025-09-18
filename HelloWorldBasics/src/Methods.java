public class Methods {
    public static void main(String[] args) {
        int myVariable = 50; // myVariable = 50 > expression , int myVariable=50; > statement with ;
        System.out.println(isTooYoung(21));
        System.out.println(isTooYoung(20));

        int highScorePosition = calculateHighScorePosition(1500);
        displayHighScorePosition("Tim", highScorePosition);
        highScorePosition = calculateHighScorePosition(50);
        displayHighScorePosition("Bob", highScorePosition);

        System.out.println("Height in cms:" + convertToCentimeters(68));
        System.out.println("Height in cms:" + convertToCentimeters(5, 8));

    }

    // Method Signature - method uniquely defined in a class by its name , number &  type of parameters that are declared for it
    public static boolean isTooYoung(int age) {
        boolean result = false;
        if (age < 21) {
            System.out.println("Age is under 21");
            result = true;
        }
        return result;
    }

    // Methods concept challenge - displayHighScorePosition(playername, playerposition)
    // calculateHighScorePosition - playerscore, returns 1-4


    public static void displayHighScorePosition(String playerName, int playerPosition) {
        System.out.println(playerName + " managed to get into position " + playerPosition);
    }

    public static int calculateHighScorePosition(int playerScore) {
        int position = 4;
        if (playerScore >= 1000) {
            position = 1;
        } else if (playerScore >= 500 && playerScore < 1000) {
            position = 2;
        } else if (playerScore >= 100 && playerScore < 500) {
            position = 3;
        }
        return position;
    }

    // Method overloading
    // Same method name but with different signatures - different parameters in terms of number , types, order of parameters
    // can have different return type as well but with the same name

    public static double convertToCentimeters(int hInInches){
        return hInInches * 2.54;
    }

    public static double convertToCentimeters(int hInFeet, int hInInches ){
        int inInches = (hInFeet*12) + hInInches;
        return convertToCentimeters(inInches);
    }

}
