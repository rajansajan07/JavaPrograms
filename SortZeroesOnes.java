package com.example.programs;

import java.util.Scanner;

public class SortZeroesOnes {
    // method to print the array
    public static void printArray(int[] arr) {
        for (int x : arr) {
            System.out.print(x + " ");
        }
        System.out.println();
    }

    // method to sort the zeros and ones
    public static void sort(int[] arr) {
        int n = arr.length;
        int zeroes = 0;
        // count the zeros
        for (int j : arr) {
            if (j == 0) {
                zeroes++;
            }
        }
        // 0 to zeroes: 0 and zeros to n - 1: 1
        for (int i = 0; i < n; i++) {
            if (i < zeroes) {
                arr[i] = 0;
            } else {
                arr[i] = 1;
            }
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the array size: ");
        int n = input.nextInt();

        // declare an array of size n
        int[] myArray = new int[n];

        System.out.print("Enter the array elements: ");
        for (int i = 0; i < n; i++) {
            myArray[i] = input.nextInt();
        }

        // sort the array
        sort(myArray);

        // print the array
        printArray(myArray);
    }
}
