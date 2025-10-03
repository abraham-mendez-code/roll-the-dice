package com.pluralsight;

public class Dice {

    /*
        The application will roll a pair of dice 100 times. Display the
        value of the two dice each time they are rolled. Count how many times the
        numbers 2, 4, 6 and 7 are rolled and display the result.
        To make this work, you need to create a class named Dice and add a method
        named roll() that generates a random number between 1 and 6
     */

    // Declare class values
    private static int minValue;
    private static int maxValue;

    public static void main(String[] args) {

        /*
            1. Create an instance of Dice named dice. Also create integer variables for
            roll1, roll2, and four different counters for the number of times 2, 4, 6
            and 7 are rolled
            2. Create a loop that executes 100 times.
            3. Within the loop, call your dice's roll() method two times
            4. Print the value of each roll of the dice formatted like this
            5. Determine if the sum of roll1 and roll2 is 2, and if so increment the
               twoCounter.
            6. Determine if the sum of roll1 and roll2 is 4, and if so increment the
               fourCounter.
            7. Determine if the sum of roll1 and roll2 is 6, and if so increment the
               sixCounter.
            8. Determine if the sum of roll1 and roll2 is 7, and if so increment the
               sevenCounter.
            9. When the loop terminates, display your counters!
         */

        // create a new Dice object
        Dice dice = new Dice();

        // Declare and initialize the counters for 2, 4, 6, 7
        int twoCounter = 0;
        int fourCounter = 0;
        int sixCounter = 0;
        int sevenCounter = 0;

        // Declare and initialize the sum variable to store the sum of rolls
        int sum = 0;

        // roll the dice 100 times
        for (int i = 0; i < 100; i++) {

            // Roll the dice twice and store the results
            int roll1 = dice.roll();
            int roll2 = dice.roll();

            // Calculate the sum of each roll
            sum = roll1 + roll2;

            // Display the outcome
            System.out.printf("Roll %d: %d  -   %d  Sum:    %d\n", (i + 1), roll1, roll2, sum);

            // Increment the counters if the sum is 2, 4, 6, or 7
            if (sum == 2) {
                twoCounter++;
            } else if (sum == 4) {
                fourCounter++;
            } else if (sum == 6) {
                sixCounter++;
            } else if (sum == 7) {
                sevenCounter++;
            }

        }

        // Display counter variables
        System.out.println("Number of times 2 was rolled: " + twoCounter);
        System.out.println("Number of times 4 was rolled: " + fourCounter);
        System.out.println("Number of times 6 was rolled: " + sixCounter);
        System.out.println("Number of times 7 was rolled: " + sevenCounter);

    }


    // Default constructor
    public Dice() {

        this.minValue = 1;
        this.maxValue = 6;

    }

    // this method generated a random number and returns it as an integer
    public static int roll() {

        // Generate a random number using Math.random() and stores it in an integer
        int randomNumber = (int)(Math.random() * maxValue) + minValue;

        // return the integer
        return randomNumber;

    }

}
