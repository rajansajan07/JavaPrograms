package com.example.programs;

public class Factorial {
    public static void main(String[] args) {
        // program to find the factorial of a number
        int number = 7;
        int fact = 1;

        while (number > 0) {
            fact *= number--;
        }
        System.out.println("The factorial of the number is: " + fact);
    }
}
