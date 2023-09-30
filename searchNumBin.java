import java.util.*;

/**
 * Authors: Connor Durkin, Timur Kasimov, Aruan Shaukenov
 * Acknowledgements: course textbook, lab guidelines in the attached pdf file
 * 
 * This class, called searchNumBin, has two methods that
 * try to guess a number between 1 and 100 chosen by user, using binary search
 * algorithm
 **/

public class searchNumBin {

    private int num; // instance field

    public searchNumBin(int n) { // constructor
        this.num = n;
    }

    public void search() { // method that guesses the user's number
        //
        int high = 100; // high limit
        int low = 1; // low limit
        int guess = (high + low) / 2; // guess is in the middle

        System.out.println("Respond with a 'y' if my guess is RIGHT."); // user directions
        System.out.println("Respond with an 'h' if my guess is HIGH.");
        System.out.println("Respond with an 'l' if my guess is LOW.");

        System.out.println("Is your number " + guess + "?"); // computer attempts guess

        Scanner in = new Scanner(System.in); // get user's response about the guess
        char response;

        while ((response = in.next().charAt(0)) != 'y') { // unless guess is right...
            if (response == '\n')
                continue;

            if (response != 'h' && response != 'l') {
                System.out.println("I didn't understand your response! Please:"); // checking user's input

                System.out.println("Respond with a 'y' if my guess is RIGHT.");
                System.out.println("Respond with an 'h' if my guess is HIGH.");
                System.out.println("Respond with an 'l' if my guess is LOW.");

                continue;
            }

            if (response == 'h') // if guessed too high, adjust upper bound
                high = guess - 1;

            if (response == 'l') // if guessed too low, adjust lower bound
                low = guess + 1;

            guess = (high + low) / 2; // generate new guess

            System.out.print("Well, then, is it " + guess + "?"); // another guess
        }

        System.out.println("I knew I could do it!\n"); // finish the game with a strong message
    }

    public void searchAuto() { // method that automatically searches the number without user prompt, this is
                               // just to show that the program works
        int high = 100;
        int low = 1;
        int guess = (high + low) / 2;

        System.out.println("\nHey, the automatically selected number is " + this.num + ".");

        int correctness = 0; // flag
        while (correctness != 1) { // while not guessed...
            System.out.println();
            System.out.println("Is your number " + guess + "?"); // make an attempt to guess the number
            if (num == guess) // if guessed right, set flag to 1
                correctness = 1;
            else if (num > guess) { // if guessed to low, adjust lower bound
                low = guess + 1;
                System.out.println("No, the guess is LOW!");
            } else { // if guessed to high, adjust upper bound
                high = guess - 1;
                System.out.println("No, the guess is HIGH!");
            }
            guess = (high + low) / 2; // generate new guess
        }
        System.out.println("Yes, the guess is correct!\n"); // finish off
    }
}
