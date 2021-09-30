/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Rishi Gadhia
 */
package baseline;

import java.util.Scanner;

public class Solution25 {
    public static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        // prompt the user for a password and take the input
        promptUser();
        String password = in.nextLine();
        passwordValidator(password);

        // once we have the value we run it against a bunch of if statements for the different conditions
        judgeValue();

    }
    private static void judgeValue() {
        // if the password contains only numbers and is fewer than 8 characters it is considered very weak

        //A weak password contains only letters and is fewer than eight characters.

        //A strong password contains letters and at least one number and is at least eight characters.

        // A very strong password contains letters, numbers, and special characters and is at least eight characters.

        // use an else statement for the final condition
        // If a password does not meet any of these rules, then report it as a password of unknown strength.

        // output the result in a single line

    }

    // return type has to be int to return a numeric value for comparison
    private static void promptUser() {
        System.out.println("What is your password?");
    }
    // takes in the string and returns a numeric value
    private static int passwordValidator(String password) {
         // return the string length
    }


}
