/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Rishi Gadhia
 */
package baseline;

import java.util.Scanner;
import java.util.*;


public class Solution25 {
    public static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        // prompt the user for a password and take the input
        promptUser();
        String password = in.nextLine();
        int length = passwordValidator(password);

        // once we have the value we run it against a bunch of if statements for the different conditions

        String judgement = judgeValue(length, password);

        // single output
        System.out.printf("The password '%s' is a %s password.", password, judgement);

    }
    public static String judgeValue(int length, String password) {
        // hasLower and hasUpper as a way to check if the string contains characters
        boolean hasLower = false, hasUpper = false, hasDigit = false, specialChar = false;
        Set <Character> set = new HashSet<>(
                Arrays.asList('!', '@', '#', '$', '%', '^', '&',
                        '*', '(', ')', '-', '+'));
        for(char i : password.toCharArray() ) {
            if(Character.isLowerCase(i))
                hasLower = true;
            if(Character.isUpperCase(i))
                hasUpper = true;
            if (Character.isDigit(i))
                hasDigit = true;
            if (set.contains(i))
                specialChar = true;
        }

        // A very strong password contains letters, numbers, and special characters and is at least eight characters.
        if(hasDigit && hasLower || hasUpper && specialChar && length >= 8)
            return "Very Strong";

        //A strong password contains letters and at least one number and is at least eight characters.
        else if(hasLower && hasDigit || hasUpper && hasDigit && length >= 8)
            return "Strong";

        //A weak password contains only letters and is fewer than eight characters.
        else if(hasUpper && length < 8 || hasLower && length < 8 )
            return "Weak";
        // if the password contains only numbers and is fewer than 8 characters it is considered very weak
         else if(hasDigit && length < 8)
             return "Very Weak";

         // use an else statement for the final condition
        // If a password does not meet any of these rules, then report it as a password of unknown strength.
         else
             return "Password of unknown strength";

    }

    // return type has to be int to return a numeric value for comparison
    private static void promptUser() {
        System.out.println("What is your password?");
    }
    // takes in the string and returns a numeric value
    public static int passwordValidator(String password) {
        return password.length();
         // return the string length

    }


}
