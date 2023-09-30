import static java.lang.System.*; //for shortening the printing call
import static java.lang.Math.*; //for math operations

/**
 * Authors: Connor Durkin, Timur Kasimov, Aruan Shaukenov
 * Acknowledgements: course textbook
 * 
 * This class, called palindrome, has one method that
 * checks whether a given number is a palindrome
 **/

public class palindrome {

    private int number; // instance field

    public palindrome(int number) { // constructor
        this.number = number; // assigning number
    }

    public void checkIfPalindrome() { // method that checks if number is palindrome
        int length = String.valueOf(number).length(); // gets the number's length

        int frontPart;
        int backPart;
        int frontDigit;
        int backDigit;

        boolean flag = true; // set flag to true

        for (int i = 1; i <= length / 2; i++) { // notice i variable
            frontPart = number / (int) pow(10, length - i); // get the front i digits of the number
            backPart = number % (int) pow(10, i); // get the back i digits of the number

            frontDigit = frontPart % 10; // get the i-th front digit
            backDigit = backPart / (int) pow(10, i - 1); // get the i-th back digit

            // out.println("front: " + frontDigit); //testing
            // out.println("back: " + backDigit);

            if (frontDigit != backDigit) { // check that digits are equal
                flag = false; // otherwise set flag to false as it's not a palindrom
            }
        }

        if (flag) { // print results to user
            out.println(number + " is a palindromic number\n");
        } else {
            out.println(number + " is not a palindromic number\n");
        }
    }
}