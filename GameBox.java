import java.util.*;
import static java.lang.System.*;

/**
 * Authors: Connor Durkin, Timur Kasimov, Aruan Shaukenov
 * Acknowledgements: course textbook
 * 
 * This program, called Game Box, offers users to play 4 different games:
 * Rock Paper Scissors
 * Number Guesser
 * Palindromic Number Verificator (Non-Array Based)
 * Palindromic Number Verificator (Array Based)
 **/

public class GameBox {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in); // to get user input
        out.println("\nWelcome to Game Box!");
        out.println("This Game Box offers you to play 4 different games:");

        int choice = 0; // game selected by the user
        while (choice != 6) // when choice=6 exits the game
        {
            // game menu
            out.println();
            out.println("\t1. Rock Paper Scissors");
            out.println("\t2. Number Guesser");
            out.println("\t3. Palindromic Number Verificator (Non-Array Based)");
            out.println("\t4. Palindromic Number Verificator (Array Based)");
            out.println("\t5. Driver (all 4 games)");
            out.println();
            out.println("Type in a number 1 through 4 to choose a game to play.");
            out.println("Type in number 5 to have a driver play all games for you 3 different times.");
            out.println("Type in 6 to quit.");

            // reading user input
            choice = in.nextInt();

            // menu options
            switch (choice) {
                case 1: // rock paper scissors
                    System.out.println("Rock, paper, scissors!");
                    System.out.println();
                    System.out.println("Choose one of the following (enter a number): ");
                    System.out.println("1. Rock");
                    System.out.println("2. Paper");
                    System.out.println("3. Scissors");

                    int userChoice = in.nextInt(); // hand selected by the user
                    rockPaperScissors new_game = new rockPaperScissors(userChoice); // creating an object
                    new_game.play(); // playing the game

                    break;

                case 2: // binary search guesser
                    System.out.println("Number Guesser!\n");
                    System.out.print("Pick an integer: ");

                    int userNum = in.nextInt(); // number selected by the user (to be guessed)
                    searchNumBin guesser_game = new searchNumBin(userNum); // creating an object
                    guesser_game.search(); // searching for the number

                    break;

                case 3:// palindroms
                    System.out.println("Palindrom Number Verificator!\n");
                    System.out.println("Type in an integer number to check if it is a palindrom");
                    palindrome number = new palindrome(in.nextInt()); // user's integer
                    number.checkIfPalindrome(); // checking if the integer is palindromic

                    break;

                case 4: // palindroms, array-based
                    System.out.println("Palindrom Number Verificator! (Array-Based)\n");
                    System.out.println("Type in an integer number to check if it is a palindrom");
                    palindromeArray numberX = new palindromeArray(in.nextInt()); // user's integer
                    numberX.checkWhetherPalindrome(); // checking if the integer is palindromic

                    break;

                case 5: // driver
                    // playing three games of Rock Paper Scissors
                    out.println();
                    out.println("Playing three games of Rock Paper Scissors:");
                    out.println();
                    rockPaperScissors game1 = new rockPaperScissors(1);
                    rockPaperScissors game2 = new rockPaperScissors(2);
                    rockPaperScissors game3 = new rockPaperScissors(3);
                    game1.play();
                    game2.play();
                    game3.play();

                    // playing three rounds of number guesser
                    out.println();
                    out.println("Playing three rounds of automatic number guesser:");
                    out.println();
                    searchNumBin guess1 = new searchNumBin(34);
                    searchNumBin guess2 = new searchNumBin(1); // edge cases
                    searchNumBin guess3 = new searchNumBin(100); // edge cases
                    guess1.searchAuto();
                    guess2.searchAuto();
                    guess3.searchAuto();

                    // playing three rounds of palindrome verificator (non-array)
                    out.println();
                    out.println("Playing three rounds of palindrome verificator (non-array):");
                    out.println();
                    palindrome number1 = new palindrome(1);
                    palindrome number2 = new palindrome(123321);
                    palindrome number3 = new palindrome(124321);
                    number1.checkIfPalindrome();
                    number2.checkIfPalindrome();
                    number3.checkIfPalindrome();

                    // playing three rounds of palindrome verificator (array-based)
                    out.println();
                    out.println("Playing three rounds of palindrome verificator (array-based):");
                    out.println();
                    palindromeArray numberX1 = new palindromeArray(1);
                    palindromeArray numberX2 = new palindromeArray(9876789);
                    palindromeArray numberX3 = new palindromeArray(123456);
                    numberX1.checkWhetherPalindrome();
                    numberX2.checkWhetherPalindrome();
                    numberX3.checkWhetherPalindrome();
                    break;

                case 6: // exiting the game
                    out.println("Thank you for playing with us!");
                    break;

                default: // unknown input
                    out.println("Type in an integer between 1 and 6");
                    break;

            }
        }
    }
}