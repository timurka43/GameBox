import java.util.*;

/**
 * Authors: Connor Durkin, Timur Kasimov, Aruan Shaukenov
 * Acknowledgements: course textbook
 * 
 * This class, called rockPaperScissors, has one method that
 * lets the user play a game of Rock Paper Scissors with a computer
 **/

public class rockPaperScissors {

    private int hand; // private instance field

    public rockPaperScissors(int hand) { // constructor
        this.hand = hand;
    }

    public void play() {
        // random number
        Random rand = new Random(System.currentTimeMillis());
        int compChoice = rand.nextInt(10);

        // printing user's hand
        if (this.hand == 1)
            System.out.println("You picked rock");
        else if (this.hand == 2)
            System.out.println("You picked paper");
        else
            System.out.println("You picked scissors");

        // choosing computer's hand
        if ((0 <= compChoice) && (compChoice < 4))
            compChoice = 1; // rock
        else if ((4 <= compChoice) && (compChoice < 7))
            compChoice = 2; // paper
        else
            compChoice = 3; // scissors

        // printing computer's hand
        if (compChoice == 1)
            System.out.println("Computer picked rock");
        else if (compChoice == 2)
            System.out.println("Computer picked paper");
        else
            System.out.println("Computer picked scissors");

        // System.out.println(compChoice); // temporary for testing

        int winner;

        // identifying the winner
        if (this.hand == 1 && compChoice == 1)
            winner = 0; // tie
        else if (this.hand == 1 && compChoice == 2)
            winner = 2; // computer
        else if (this.hand == 1 && compChoice == 3)
            winner = 1; // user
        else if (this.hand == 2 && compChoice == 1)
            winner = 1;
        else if (this.hand == 2 && compChoice == 2)
            winner = 0;
        else if (this.hand == 2 && compChoice == 3)
            winner = 2;
        else if (this.hand == 3 && compChoice == 1)
            winner = 2;
        else if (this.hand == 3 && compChoice == 2)
            winner = 1;
        else
            winner = 0;

        // printing the result
        if (winner == 1)
            System.out.println("You won!\n");
        else if (winner == 2)
            System.out.println("You lost!\n");
        else
            System.out.println("It's a draw bro!\n");
    }
}
