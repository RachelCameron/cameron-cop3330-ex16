/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Rachel Cameron
 */

import java.util.Scanner;

public class exercise16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What is your age?");
        double age = input.nextDouble();
        final String output = age >= 16
                ? "You are old enough to legally drive."
                : "You are not old enough to legally drive.";
        System.out.println(output);
    }
}