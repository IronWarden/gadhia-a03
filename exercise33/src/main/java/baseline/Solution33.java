/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Rishi Gadhia
 */

package baseline;

import java.util.ArrayList;
import java.util.Scanner;

public class Solution33 {
    public static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        // prompt user
        promptUser();
        String input = in.nextLine();

        // use a rand number generator of small size
        int number = (int)(4 * Math.random());
        // use the number generated and find the correct choice 
        // choice["Yes", "No", "Maybe", "Ask again later"]
        ArrayList<String> choices = new ArrayList<>();
        choices.add("Yes");
        choices.add("No");
        choices.add("Maybe");
        choices.add("Ask again later");

        String answerChoice = answer(choices, number);


        // output the choice
        System.out.println(" " + answerChoice);
    }

    public static String answer(ArrayList<String> choices, int number) {
        String answerChoice = choices.get(number);
        return answerChoice;
    }

    private static void promptUser() {
        System.out.println("What's your question?");
    }
}
