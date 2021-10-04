/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Rishi Gadhia
 */
package baseline;

import java.util.Scanner;

public class Solution31 {
    public static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        // use try and catch exception Number format exception
        // promptUser
        promptUser();
        // test if it's valid
        isValid();

    }

    public static void isValid() {
        boolean flag = false;
        while(true) {
            try {
                int restingHR = Integer.parseInt(in.next());
                int age = Integer.parseInt(in.next());
                output(age, restingHR);
                flag = true;
            }
            catch (NumberFormatException e) {
                System.out.println("Please enter a number");
            }
            if(flag)
                break;
        }
    }

    private static void output(int age, int restingHR) {
        //output in tablular format
        double intensity;
        System.out.println(" Resting Pulse: " + restingHR + " Age: " + age);
        System.out.println("Intensity | Rate ");
        System.out.println("----------|-------------");
        // create a for loop to increment by .05  from .55 to .95
        for(intensity = 0.55; intensity < 1.00; intensity+= 0.05) {
            // use Karvonen formula to determine the heart rate
            int heartRate = calcHeartRate(age, restingHR, intensity);
            System.out.printf("%n%.2f       |   %d ", intensity, heartRate);
        }

    }

    public static int calcHeartRate(int age, int restingHR, double intensity) {
        // TargetHeartRate = (((220 − age) − restingHR) × intensity) + restingHR
        int heartRate = (int)Math.round((((220 - age) - restingHR) * intensity + restingHR));
        return heartRate;

    }

    private static void promptUser() {
        System.out.println("What is your resting heart rate?");
        System.out.println("What is your age?");
    }
}
