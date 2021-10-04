/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Rishi Gadhia
 */
package baseline;

import java.util.ArrayList;
import java.util.Scanner;

public class Solution34 {
    public static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        // create an arraylist with the employee names
        ArrayList<String> employeeName = new ArrayList<>();
        employeeName.add("John Smith");
        employeeName.add("Jackie Jackson");
        employeeName.add("Chris Jones");
        employeeName.add("Amanda Cullen");
        employeeName.add("Jeremy Goodwin");

        // print out the list with each employee on a new line and ask who to remove
        promptUser(employeeName);
        String removedEmployee = in.nextLine();

        // to remove an employee take input from the user and
        // use remove() to remove the employee
        employeeName.remove(removedEmployee);

        // print the results after removal
        output(employeeName);
    }

    private static void output(ArrayList<String> employeeName) {
        for(int i = 0; i < employeeName.size(); i++){
            String nameofEmployee = employeeName.get(i);
            System.out.println("\n " + nameofEmployee);
        }
    }

    private static void promptUser(ArrayList<String> employeeName) {
         // iterate through the arraylist and print the name
        for(int i = 0; i < employeeName.size(); i++){
            String nameofEmployee = employeeName.get(i);
            System.out.println("\n " + nameofEmployee);
        }
        // prompt who to remove
        System.out.println("Enter an employee name to remove: ");
    }
}
