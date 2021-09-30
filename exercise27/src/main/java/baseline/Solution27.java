/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Rishi Gadhia
 */
package baseline;

import java.util.Scanner;

public class Solution27 {
    public static final Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        // prompt the user and store the values
        // prompt the user for the first name
        promptFirstName();
        String firstname = in.nextLine();
        // prompt the user for the last name
        promptLastName();
        String lastname = in.nextLine();
        // prompt the user for the ZIP code
        promptZip();
        String zip = in.nextLine();
        // prompt Employee ID
        promptID();
        String id = in.nextLine();


        validateInput(firstname, lastname, id, zip);
    }

    private static void validateInput(String firstname, String lastname, String id, String zip) {
        //Create a function for each validation rule. Then create a validateInput function that takes in
        // all of the input data and invokes the specific validation functions.

        //create a function for each validation rule
        validateFirstName(firstname);
        validateLastName(lastname);
        validateID(id);
        validateZip(zip);

        // if all of these functions return a valid we print the output
        // no errors found

    }

    private static void validateZip(String zip) {
        // zip must be a number, we can look for integers and throw an exception if the there
        // non numbers using try and catch
    }

    private static void validateID(String id) {
        // id must have 2 letters, a hypen, and four numbers
        // use multiple try and catch to look
    }

    private static void validateLastName(String lastname) {
        // The first and last names must be at least two characters long
        // last name must be filled
        // try and catch
    }

    private static void validateFirstName(String firstname) {
        // The first and last names must be at least two characters long
        // first name must be filled
        // try and catch
    }

    private static void promptID() {
        System.out.println("Enter the employee ID: ");
    }

    private static void promptZip() {
        System.out.println("Enter the ZIP code:");
    }

    private static void promptLastName() {
        System.out.println("Enter the last name:");
    }

    private static void promptFirstName() {
        System.out.println("Enter the first name:");
    }
}
