import java.util.*;
import static java.lang.Math.*; //for math operations

/**
 * Authors: Connor Durkin, Timur Kasimov, Aruan Shaukenov
 * Acknowledgements: course textbook
 * 
 * This class, called palindromeArray, has one method that
 * checks, using arrays, whether a given number is a palindrome.
 **/

public class palindromeArray {

    private int number;

    palindromeArray(int number) {
        this.number = number;
    }

    public void checkWhetherPalindrome() {

        int arrSize = String.valueOf(number).length();

        // System.out.println(arrSize); // testing the size of the array

        int[] userArr = new int[arrSize];

        int digit;
        // populate the array
        for (int i = 1; i <= arrSize; i++) {
            digit = (number / (int) pow(10, arrSize - i)) % 10; //
            userArr[i - 1] = digit;
        }

        // System.out.println(Arrays.toString(userArr)); // test the array was populated
        // properly

        int[] mirrorArr = new int[userArr.length]; // creating a mirror array
        for (int i = 0; i < userArr.length; i++) {
            mirrorArr[i] = userArr[userArr.length - 1 - i];
        }

        boolean flag = true; // set flag to true

        for (int i = 0; i <= (userArr.length - 1); i++) {
            if (userArr[i] == mirrorArr[i]) { // check whether each i-th digit in the number is equal to the i-th digit
                                              // from the end
            } else {
                flag = false; // otherwise set flag to false because it is not a palindrome
            }
        }

        if (flag == true) {
            System.out.println(number + " is palindromic.\n");
        } else {
            System.out.println(number + " is NOT palindromic.\n");
        }
    }
}