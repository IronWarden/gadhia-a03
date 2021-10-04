/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Rishi Gadhia
 */
package baseline;
public class Solution30 {

    public static void main(String[] args) {
        // use a nested for loop where rows < 12, and cols < 12
        for(int i = 1; i <= 12; i++) {
            for(int j = 1; j <= 12; j++) {
                // multiply rows * cols
                int value = calcTable(i, j);
                //  specify the width of the integer and align to the left
                // using | %-d | and output the result
                System.out.printf("| %3d |", value);
            }
            System.out.println();
        }
    }

    public static int calcTable(int rows, int cols) {
        return rows * cols;
    }
}
