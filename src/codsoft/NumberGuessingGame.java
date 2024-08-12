package codsoft;
import java.util.Scanner;
import java.util.Random;
public class NumberGuessingGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	      Scanner scanner = new Scanner(System.in);
	        Random random = new Random();

	        int minRange = 1;
	        int maxRange = 100;
	        int maxAttempts = 10;
	        int score = 0;

	        System.out.println("Welcome to the Number Guessing Game!");
	        System.out.println("I've picked a number between " + minRange + " and " + maxRange + ".");
	        System.out.println("You have " + maxAttempts + " attempts. Let's begin!");

	        boolean playAgain = true;
	        while (playAgain) {
	            int targetNumber = random.nextInt(maxRange - minRange + 1) + minRange;
	            int attempts = 0;

	            while (attempts < maxAttempts) {
	                System.out.print("Enter your guess: ");
	                int userGuess = scanner.nextInt();
	                attempts++;

	                if (userGuess == targetNumber) {
	                    System.out.println("Congratulations! You guessed it right.");
	                    score++;
	                    break;
	                } 
	                else if (userGuess < targetNumber) {
	                    System.out.println("Too low! Try again.");
	                } 
	                else {
	                    System.out.println("Too high! Try again.");
	                }
	            }

	            if (attempts == maxAttempts) {
	                System.out.println("Out of attempts! The correct number was " + targetNumber);
	            }

	            System.out.print("Play again? (yes/no): ");
	            String playAgainInput = scanner.next().toLowerCase();
	            playAgain = playAgainInput.equals("yes");
	        }

	        System.out.println("Your final score: " + score);
	        System.out.println("Thanks for playing!");
	        scanner.close();
	    }
	}


