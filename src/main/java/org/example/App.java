package org.example;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Daniel Guzman
 */
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        //declare variables and create scanner
        int ppl, pizzas, slices;
        Scanner sc = new Scanner(System.in);

        //prompt user and scan inputs
        System.out.println("How many people?");
        ppl = sc.nextInt();
        System.out.println("How many pizzas do you have?");
        pizzas = sc.nextInt();
        System.out.println("How many slices per pizza?");
        slices = sc.nextInt();

        //output
        System.out.println(ppl + " people with " + pizzas + " pizzas (" + (pizzas*slices) + " slices)");
        System.out.println("Each person gets " + ((pizzas * slices)/ppl) + " pieces of pizza.");
        System.out.println("There are " + ((pizzas * slices)%ppl) + " leftover pieces.");

        //close scanner
        sc.close();
    }
}