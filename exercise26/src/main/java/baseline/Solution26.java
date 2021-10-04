/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Rishi Gadhia
 */
package baseline;

import java.util.Scanner;

public class Solution26 {
    public static final Scanner in = new Scanner(System.in);
    // these variables never change and want to be used by another class
    static double balance;
    static double APR;
    static double monthlyPayment;

    public static void main(String[] args) {
        // prompt the user for the balance of a credit card, the APR of the card, and their monthly payment
        promptUser();
        // scan the data as doubles because it is unlikely the user would always have an even integer
        // balance, APR, and monthly payment
        balance = in.nextDouble();
        APR = in.nextDouble();
        monthlyPayment = in.nextDouble();

        // the formula to determine the months needed to pay of the card is
        // n = -(1/30) * log(1 + b/p * (1 - (1 + i)^30)) / log(1 + i)

        // create class PaymentCalculator with a public method called calculateMonthsUntilPaidOff,
        // which takes no parameters and returns the number of months.as per constraint
        int month = PaymentCalculator.calculateMonthsUntilPaidOff();
        System.out.printf("It will take you %d months to pay off this card.", month);
    }

    private static void promptUser() {
        System.out.println("What is your balance?");
        System.out.println("What is the APR of the card (as a percent)?");
        System.out.println("What is the monthly payment you can make?");
    }
}
