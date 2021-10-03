/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Rishi Gadhia
 */

package baseline;

import java.util.Scanner;

public class Solution36 {
    public static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        promptUser();


        average();
        max();
        min();
        std();

        //output the result 
        

    }

    private static void promptUser() {
        // use a while loop to continuously take input
        // store the input into an ArrayList<int>
        // if the user enters invalid input throw an exception and take in another input
        // if the user enters "done" stop the loop
    }

    private static double std() {
        // to calculate std we take each value in the arraylist subtract by mean and
        // square the result, then divide by the length of the arraylist
        // and square root the result
    }

    private static double min() {
        // the minimum is the lowest value which can obtained after sorting the list at positon 0
    }

    private static double max() {
        // can be obtained after sorting the arraylist at the last index
    }

    private static void average() {
        // takes the sum of the arraylist and divides by length of the list
    }
}
