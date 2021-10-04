/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Rishi Gadhia 
 */
package baseline;
import java.util.Scanner;

public class Solution32 {
    public static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        // prompt and scan for the difficulty level
        promptUser();
        isValid();

        // use if conditions to continue
        guessGame(level)

        // throw number format exception if they enter invalid input
        // count it as a wrong guess



    }

    private static void guessGame(int level) {
        int i = 0;
        if(level == 1) {
            i = 10;
        }
        if(level == 2)
            i = 100;
        if(level == 3)
            i = 100;
        // if level 1 create a random number generator between 1-10
        int number = (int) (i * Math.random());

        // if the user input < number generated it's too low prompt and ask them to try again
        isValidGuess();
        
        while(true) {
            if(guess < number) {
                System.out.println("It's too low, try again");
            }
            if(guess > number) {
                System.out.println("It's too high, try again");
            }
            else {
                System.out.println("You got in ")
                break;
            }

        }
        // if input > number generated it's too high
        // else it is even output the number of guesses
        // a while loop is ideal for this purposes

        // if level 2 create generator between 1 - 100

        // if level 3 create generator between 1 - 1000

    }

    private static void isValidGuess() {
        boolean flag = false;
        int count = 0;
        while(true) {
            try {
                int guess = Integer.parseInt(in.next());
                flag = true;
            }
            catch (NumberFormatException e) {
                System.err.println("Enter a number");
                // counter
                count++;
                // tracks total count
                counter(count)
            }
            if(flag)
                break;
        }
    }

    private static void counter(int count) {
        count += count;
    }

    private static void isValid() {
        boolean flag = false;
        while(true) {
            try {
                int level = Integer.parseInt(in.next());
                flag = true;
            }
            catch (NumberFormatException e) {
                System.err.println("Enter a number");
            }
            if(flag)
                break;
        }
    }

    private static void promptUser() {
        System.out.println("Enter the difficulty level (1, 2, or 3):");
    }
}
