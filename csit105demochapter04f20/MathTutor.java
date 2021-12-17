package csit105demochapter04f20;

import java.util.Scanner; // Needed for Scanner class
import java.util.Random;  // Needed for Random class

/**
 * This program demonstrates the Random class.
 *
 * @author Concept by: Tony Gaddis (et al) modified by Stephen Brower
 */
public class MathTutor {

    /**
     * The main method is the program's starting point.
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int number1;      // First number
        int number2;      // Second number
        int sum;          // Sum of numbers
        int userAnswer;   // User's answer

        // Create a Scanner object for keyboard input.
        Scanner keyboard = new Scanner(System.in);

        // Create a Random object.
        Random randomNumbers = new Random();

        // Get two random numbers.
        number1 = randomNumbers.nextInt(100); // generates a # 0..99
        number2 = randomNumbers.nextInt(100); // generates a # 0..99

        // Display an addition problem.
        System.out.println("What is the answer to "
                + "the following problem?");
        System.out.print(number1 + " + "
                + number2 + " = ? ");

        // Calculate the answer.
        sum = number1 + number2;

        // Get the user's answer.
        userAnswer = keyboard.nextInt();

        // Display the user's results.
        if (userAnswer == sum) {
            System.out.println("Correct!");
        } else {
            System.out.println("Sorry, wrong answer. "
                    + "The correct answer is "
                    + sum);
        }
    }
}
