package com.example.programs;

public class ReverseNumber {
    public static void main(String[] args) {
        // write a program to reverse a number
        int number = 1233;
        int reversedNumber = 0;

        while (number > 0) {
            reversedNumber = reversedNumber * 10 + number % 10;
            number /= 10;
        }
        System.out.println("The reversed number is: " + reversedNumber);
    }
}
