import java.util.Random;
import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {
        Scanner scannerobj = new Scanner(System.in);
        Random randobj = new Random();
        int score = 0;
        int rounds = 1;

        while (true) {
			
            int numberToGuess = randobj.nextInt(100) + 1;
            int attempts = 0;
            boolean won = false;
            System.out.println("------>Round " + (rounds++));
			System.out.println("You have 10 attempts to guess !");
			System.out.println(numberToGuess);
			
            while (attempts < 10) {
				
				System.out.println((attempts + 1) + " Attempt !");
				System.out.println("Guess a number between 1 and 100 :");
                int Guess = scannerobj.nextInt();
                attempts++;

                if (Guess == numberToGuess) {
                    System.out.println("Congratulations you Won ! You found the number in " + attempts + " attempts.");
                    won = true;
                    break;
                } else if (Math.abs(Guess - numberToGuess) <= 4) { 
				//Math.abs will remove the negation of the value and will return only positive value
                System.out.println("You're very close! Try again!");
				System.out.println();
				} else if (Guess < numberToGuess) {
                    System.out.println("Your guess is too low. Try again!");
					System.out.println();
                } else {
                    System.out.println("Your guess is too high. Try again!");
					System.out.println();
                }
            }

            if (won) {
				System.out.println("Your score: " + (score + 10) + " points");
            } else {
				System.out.println("Your all "+ attempts + " attempts are over !");
				System.out.println("Sorry, you didn't find the number. It was " + numberToGuess);
				System.out.println("Your score: " + score + " points");
				break;
			}

            System.out.println("Do you want to play again? (yes/no)");
            String playAgain = scannerobj.next();

            if (playAgain.equalsIgnoreCase("yes")) {
                score = score + 10;
            } else {
				System.out.println("Your final score: " + (score + 10) + " points");
				break;
			}				
        }
        scannerobj.close();
    }
}