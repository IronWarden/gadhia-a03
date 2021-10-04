/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Rishi Gadhia
 */
package baseline;

import java.util.ArrayList;
import java.util.Scanner;

public class Solution35 {
    public static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        // prompt user until they enter a blank
       ArrayList<String> names = promptUser();

        // use a random num generator to generate a number of the size count
        int number = (int)(names.size() * Math.random());

        // output the result
        System.out.printf("The winner is ... %s", names.get(number) );
    }

    public static ArrayList<String> promptUser() {
        ArrayList<String> names = new ArrayList<>();
        String name;
        do {
            System.out.println("Enter a name ");
            name = in.nextLine();
            // if the input is empty don't add it
            if(!name.isEmpty() && !name.isBlank())
                names.add(name);
        } while(!name.isEmpty() && !name.isBlank());
        // use a while loop to take input and store it into an arraylist


        return names;
    }
}
