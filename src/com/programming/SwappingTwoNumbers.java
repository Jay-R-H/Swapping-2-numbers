package com.programming;

import java.util.Scanner;

public class SwappingTwoNumbers {

    public static void main(String[] args) {
        // Input is taken from the user for the two numbers that need to swapped
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value -> X :");
        int X = sc.nextInt();
        System.out.println("Enter the value -> Y :");
        int Y = sc.nextInt();

        int swap =0;                                                        // A new variable is used as the intermediate to store the value of either variable
        swap =Y;                                                            // The value of this intermediate variable is transferred to one of the variable
        Y =X;
        X =swap;
        System.out.println("new value of X = " + X);
        System.out.println("new value of Y = " + Y);

    }
}
