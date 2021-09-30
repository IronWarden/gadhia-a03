/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Rishi Gadhia

 */

package baseline;
import java.util.*;
import java.util.Arrays;

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


        // print s1 and s2 are anagrams if true
        if(isAnagram(s1, s2)) {
            System.out.printf("\"%s\" and \"%s\" are anagrams.", s1, s2);
        }
        // else print false
        else{
            System.out.println("They are not anagrams.");
        }
    }

    public static boolean isAnagram(String s1, String s2) {
        // get the length of the string
        int lenS1 = s1.length();
        int lenS2 = s2.length();

        // if the string size is not the same they cannot be anagrams
        // we return false
        if(lenS1 != lenS2) {
            return false;
        }
        //Otherwise we can sort both strings and return true if they equal each other
        // have to convert to char array to sort
        else {
            char[] arrayS1 = s1.toCharArray();
            char[] arrayS2 = s2.toCharArray();
            // sort the arrays
            Arrays.sort(arrayS1);
            Arrays.sort(arrayS2);
            // if they are the same return the result
            return Arrays.equals(arrayS1,arrayS2);

        }

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
