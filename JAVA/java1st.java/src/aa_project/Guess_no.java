package aa_project;
import java.util.Random;
import java.util.Scanner;

public class Guess_no {
    public static void main(String[] args) {
//        //take a ip from user
//        Random rand = new Random();
//        Scanner ip = new Scanner(System.in);
//        int r = rand.nextInt(1000);
//        //System.out.print("Do you want to cont. game ? (y/n) : ");
//        System.out.print("I'm thinking of a number ! Try to guess the number I'm Thinking of : ");
//        int un = ip.nextInt();


        // Generate a random number between 1 and 100
        Random random = new Random();
        int targetNumber = random.nextInt(100) + 1;

        // Initialize variables
        int userGuess;
        int attempts = 0;

        // Create a Scanner object to get user input
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Guess the Number game!");
        System.out.println("Try to guess the number between 1 and 100.");

        do {
            System.out.print("Enter your guess: ");
            // Get user input
            userGuess = scanner.nextInt();

            // Increment attempts
            attempts++;

            // Check if the guess is correct
            if (userGuess == targetNumber) {
                System.out.println("Congratulations! You guessed the correct number in " + attempts + " attempts.");
            } else if (userGuess < targetNumber) {
                System.out.println("Too low! Try again.");
            } else {
                System.out.println("Too high! Try again.");
            }

        } while (userGuess != targetNumber);

        // Close the scanner
        scanner.close();

    }
}
/*Certainly! Here's an updated version of the "Guess the Number" game in Java using a `while` loop and without explicitly closing the `Scanner`:

```java
import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        // Generate a random number between 1 and 100
        Random random = new Random();
        int targetNumber = random.nextInt(100) + 1;

        // Initialize variables
        int userGuess;
        int attempts = 0;

        // Create a Scanner object to get user input
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Guess the Number game!");
        System.out.println("Try to guess the number between 1 and 100.");

        // Use a while loop without explicitly closing the Scanner
        while (true) {
            System.out.print("Enter your guess (or enter 0 to exit): ");

            // Check if the user wants to exit
            if (scanner.hasNextInt()) {
                userGuess = scanner.nextInt();

                // Increment attempts
                attempts++;

                // Check if the guess is correct
                if (userGuess == targetNumber) {
                    System.out.println("Congratulations! You guessed the correct number in " + attempts + " attempts.");
                    break;  // Exit the loop when the correct number is guessed
                } else if (userGuess == 0) {
                    System.out.println("Thanks for playing. Exiting the game.");
                    break;  // Exit the loop if the user enters 0
                } else if (userGuess < targetNumber) {
                    System.out.println("Too low! Try again.");
                } else {
                    System.out.println("Too high! Try again.");
                }
            } else {
                System.out.println("Invalid input. Please enter a valid number.");
                scanner.next();  // Consume the invalid input to avoid an infinite loop
            }
        }
    }
}



import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        // Generate a random number between 1 and 100
        Random random = new Random();
        int targetNumber = random.nextInt(100) + 1;

        // Initialize variables
        int userGuess;
        int attempts = 0;

        // Create a Scanner object to get user input
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Guess the Number game!");
        System.out.println("Try to guess the number between 1 and 100.");

        do {
            System.out.print("Enter your guess: ");
            // Get user input
            userGuess = scanner.nextInt();

            // Increment attempts
            attempts++;

            // Check if the guess is correct
            if (userGuess == targetNumber) {
                System.out.println("Congratulations! You guessed the correct number in " + attempts + " attempts.");
            } else if (userGuess < targetNumber) {
                System.out.println("Too low! Try again.");
            } else {
                System.out.println("Too high! Try again.");
            }

        } while (userGuess != targetNumber);

        // Close the scanner
        scanner.close();
    }
}
*/