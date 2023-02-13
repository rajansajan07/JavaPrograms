package com.example.programs;

import java.util.Scanner;

public class QuerySum {
    // method to input the array
    public static int[] inputArray() {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the size: ");
        int n = input.nextInt();

        int[] arr = new int[n];

        System.out.print("Enter the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }
        return arr;
    }
    // method to print the array
    public static void printArray(int[] arr) {
        for (int x : arr) {
            System.out.print(x + " ");
        }
        System.out.println();
    }
    // method to make the prefix sum array
    public static void makePrefixSumArray(int[] arr) {
        int n = arr.length;

        for (int i = 1; i < n; i++) {
            arr[i] = arr[i - 1] + arr[i];
        }
    }

    // method to return the query sum method
    public static int querySum(int[] arr) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the left position: ");
        int left = input.nextInt();

        System.out.print("Enter the right position: ");
        int right = input.nextInt();

        return arr[right - 1] - arr[left - 2];
    }

    // Driver method
    public static void main(String[] args) {
        // get the array from the user
        int[] myArray = inputArray();

        // convert it to the prefix sum
        makePrefixSumArray(myArray);

        // passing the array to querySum
        int sum = querySum(myArray);

        // print the sum
        System.out.println("Total: " + sum);
    }
}
