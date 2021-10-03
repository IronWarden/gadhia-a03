/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Rishi Gadhia
 */
package baseline;

import java.util.ArrayList;
import java.util.Scanner;

public class Solution28 {
    public static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        // use the try and catch exception handling method to make sure they enter integers
        ArrayList<Integer> numberList = promptUser();

        int sum = calcSum(numberList);
        System.out.println("The total is " + sum);
    }

    public static ArrayList<Integer> promptUser() {
        int count = 0;
        ArrayList<Integer> numberList = new ArrayList<>();
        do {
            System.out.println("Enter a number: ");
            int number = in.nextInt();
            numberList.add(number);
            count++;
        }
        while (count < 5);
        return numberList;
    }

    public static int calcSum(ArrayList<Integer> integerArrayList) {
        // return the sum of all the inputs
        int sum = 0;
        for(int i = 0; i < integerArrayList.size(); i++ )
            sum += integerArrayList.get(i);

       return sum;

    }

}
