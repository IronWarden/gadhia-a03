/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Rishi Gadhia

 */

package baseline;
import java.util.*;
public class Solution24 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // declare the two string values
        String s1;
        String s2;
        // greet the user to let them know what they are doing
        greetUser();
        // prompt the user for the first string and store the result in s1
        promptUserS1();
        s1 = in.nextLine();
        // do the same thing but for s2
        promptUserS2();
        s2 = in.nextLine();

        // the two words will be anagrams if the function isAnagram returns true
        // to do this we use boolean logic
        isAnagram(s1,  s2);

        // print s1 and s2 are anagrams if true
        // else print false
    }

    private static boolean isAnagram(String s1, String s2) {
        // if the string size is not the same they cannot be anagrams
        // we return false

        //otherwise we can sort both strings and return true if they equal each other
    }

    private static void greetUser() {
        System.out.println("Enter two strings and I'll tell you if they are anagrams: ");
    }

    private static void promptUserS2() {
        System.out.println("Enter the second string: ");
    }

    private static void promptUserS1() {
        // prompt user
        System.out.println("Enter the first string: ");
    }

}
