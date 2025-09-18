public class Loops {
    public static void main(String[] args) {
        // for - loops over a specific num of iterations > use of break statement to exit the loop inside a for loop
        // while - loops until a condition becomes false > use of break statement to exit the loop
        // do while - executes atleast once and loops until conditions becomes false
        // continue statement - continues to execute the loop and skips execution for certain iterations
        double amount = 1000;
        for (double iRate = 2.0; iRate <= 5.0; iRate++) {
            System.out.println("Interest rate for " + amount + "$" + iRate + "%: " + calculateInterest(1000, iRate) + "$");
        }

        // for loop interest rates between 7.5% to 10% and exit at 8.5%
        for (double i = 7.5; i <= 10.0; i += 0.25) {
            if (i == 8.5) {
                break;
            }
            System.out.println("Interest rate for " + amount + "$" + i + "%: " + calculateInterest(1000, i) + "$");
        }

        // Sum 3 and 5 challenge
        int counter = 0;
        int sum = 0;
        while (counter < 5) {
            for (int i = 1; i <= 100; i++) {
                if ((i % 3 == 0) & (i % 5 == 0)) {
                    System.out.println("Number divisible by 3 & 5: " + i);
                    sum += i;
                    counter += 1;
                }
            }
        }
        System.out.println("Sum of numbers that are divisible by 3 & 5:" + sum);

        // While loop
        int j = 1;
        while (true) {
            if (j > 5) {
                break;
            }
            System.out.println(j++);
        }

        // do while
        int k = 1;
        boolean isReady = false;
        do {
            if (k > 5) {
                break;
            }
            System.out.println(k);
            k++;
        } while (k > 0);

        int number = 0;
        while (number < 50) {
            number += 5;
            if ((number % 25) == 0) {
                continue;
            }
            System.out.print(number + "_");
        }

    }

    // calculate interest for rates between 2 - 5 %
    public static double calculateInterest(double amount, double interestRate) {
        return (interestRate / 100) * amount;
    }
}
