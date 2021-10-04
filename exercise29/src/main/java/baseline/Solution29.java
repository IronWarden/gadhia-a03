/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Rishi Gadhia
 */
package baseline;

import java.util.Scanner;

public class Solution29 {
    public static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        // we can take the rate as a double
        // use multiple try and catch exception handling methods
        // needs an arithmetic exception and a number format exception
        promptUser();

    }

    public static void promptUser() {
        int rate;
        boolean flag = false;
        while(true) {
            try {
                System.out.print("What is the rate of return? ");
                rate = Integer.parseInt(in.next());
                int years = calcYears(rate);
                // output
                System.out.println("It will take "+years+" years to double your initial investment.");
                flag = true;
            }
            catch (ArithmeticException e) {
                System.err.println("Don't be a silly goose");
            }
            catch (NumberFormatException e) {
                System.err.println("Enter a number");
            }
            if(flag){
                break;
            }
        }

    }



    public static int calcYears(int rate) {
        // years = 72 / r
        return (72/ rate);
    }
}
