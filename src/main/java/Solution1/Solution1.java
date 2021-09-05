/*
 *  UCF COP3330 Fall 2021 "Motivated Practice Problems" Solutions
 *  Copyright 2021 Logan Kilburn
 */
package Solution1;

import java.util.Scanner;

public class Solution1 {
    /*
    Problem: Create a program that prompts for your name and prints a greeting using your name.

    PseudoCode:
    print to user "What is your name?"
    create input scanner variable
    set the variable name to the input scanner variable to store the users name
    Reply to the user saying a greeting
     */
    public static void main(String[] args) {
        System.out.print("What's your name? ");
        Scanner input = new Scanner(System.in);
        String name = input.next();
        System.out.print("Hello " + name + ", nice to mee you!");
    }
}
