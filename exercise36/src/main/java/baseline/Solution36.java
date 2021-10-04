/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Rishi Gadhia
 */

package baseline;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Solution36 {
    public static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        ArrayList<Integer> numbers = promptUser();

        // a function to sort the arraylist so we don't have to sort twice
        Collections.sort(numbers);
       double mean = average(numbers);

        double max = max(numbers);
        double min = min(numbers);
        double std = std(numbers, mean);

        //output the result
        System.out.println("The average is " +mean);
        System.out.println("The minimum is " +min);
        System.out.println("The maximum is" +max);
        System.out.println("The standard deviation is " +std);
    }



    private static ArrayList<Integer> promptUser() {
        ArrayList<Integer> numbers = new ArrayList<>();

        String input;
        do {
            System.out.println("Enter a number: ");
            input = in.next();
            // if the user enters "done" stop the loop
            if(!input.equals("done")) {
                try {
                    int num = Integer.parseInt(input);
                    // store the input into an ArrayList<int>
                    numbers.add(num);
                } catch (NumberFormatException e) {
                    System.out.println("You did not enter a number");
                    // if the user enters invalid input throw an exception and take in another input
                }
            }

        } while(!input.equals("done"));
        // use a while loop to continuously take input
        return numbers;

    }

    private static double std(ArrayList<Integer> numbers, double mean) {
        // to calculate std we take each value in the arraylist subtract by mean and
        double value = 0;
          for(Integer i : numbers) {
              // square the result, then divide by the length of the arraylist
              value = value + Math.pow((i - mean), 2);
          }
          // and square root the result
          return Math.sqrt(value / numbers.size());
    }

    private static double min(ArrayList<Integer> numbers) {
        // the minimum is the lowest value which can obtained after sorting the list at positon 0
        return numbers.get(0);
    }

    private static double max(ArrayList<Integer> numbers) {
        // can be obtained after sorting the arraylist at the last index
        int postionofMax = numbers.size() - 1;
        return numbers.get(postionofMax);
    }

    private static double average(ArrayList<Integer> numbers) {
        // takes the sum of the arraylist and divides by length of the list
        double sum = 0;
        for(Integer i : numbers ){
            sum += numbers.get(i);
        }

        return (sum / numbers.size());
    }


}
