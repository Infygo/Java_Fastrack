public class IfElse_Operators {
    public static void main(String[] args) {
        System.out.println("Hello , Tim");
        System.out.println("Helloworld");

        boolean isAlien = false; // assingment operator
        // if statement checks for the conditions , if met executes it , wont print if the condition is checked for true here
        if (isAlien == false) { // equals operator
            System.out.println("Im not an Alien");
            System.out.println("Im scared of Aliens");
        }

        // Operators
        // == , !=, >=, <=
        // Logical AND && - Logical OR ||
        int topScore = 80;
        int secondTopScore = 60;
        if (topScore < 100) {
            System.out.println("You got the high score");
        }
        if ((topScore > secondTopScore) && (topScore < 100)) {
            System.out.println("Greater than 2nd top score and less than 100");
        }
        if ((topScore > 90) || (topScore <= 90)) {
            System.out.println("Either or both conditions are true");
        }

        // if elseif else block
        boolean gameOver = true;
        int score = 5000;
        int levelCompleted = 5;
        int bonus = 100;

        if(score < 5000 && score > 2000){
            System.out.println("Score is greater than 2000 & less than 5000");
        }
        else if (score > 2000){
            System.out.println("Score is greater than 2000");
        }
        else{
            System.out.println("Score from last else block");
        }

        // Ternary operator - operand1 ? operand2 : operand3
        String carMaker = "VW";
        boolean isGerman = carMaker == "VW" ? true:false;
        if(isGerman){
            System.out.println("German car maker");
        }
        boolean isGerman1 = carMaker.equals("VW");
        System.out.println(isGerman1);

        // Ternary operator
        int ageOfApplicant = 21;
        boolean isAdult = ageOfApplicant >=18 ? true:false;
        if(isAdult){
            System.out.println("Applicant is aged 18 or above");
        }

        // Operator precedence
        double num1 = 20.00d;
        double num2 = 80.00d;
        double myValuesTotal = (num1 + num2) * 100.0d;
        System.out.println("MyValuesTotal:" + myValuesTotal);
        double remainder = myValuesTotal % 40.00d;
        System.out.println("Remainder is:" +remainder);
        boolean isZero = remainder == 0.00 ? true:false;
        System.out.println("Remainder is zero:"+ isZero);
    }
}
