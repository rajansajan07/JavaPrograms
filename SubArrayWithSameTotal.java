package com.example.programs;

import java.util.Scanner;
import java.util.Arrays;


public class SubArrayWithSameTotal {
    // method to print the array
    public static void printArray(int[] arr) {
        for (int x : arr) {
            System.out.print(x);
        }
        System.out.println();
    }
    // method to print the subarray
    public static void subArray(int[] arr) {
        int n = arr.length;
        int[] prefixSum = new int[n];
        prefixSum[0] = arr[0];
        for (int i = 1; i < n; i++) {
            prefixSum[i] = arr[i - 1] + arr[i];
        }
        int i = 0;
        for (i = 0; i < n; i++) {
            if (prefixSum[i] == prefixSum[n - 1]) {
                break;
            }
        }
        if (i == n) {
            System.out.println("The array can not be partitioned");
        }
        int[] leftArray = Arrays.copyOfRange(arr, 0, i);
        int[] rightArray = Arrays.copyOfRange(arr, n - i - 1, n - 1);

        printArray(leftArray);
        printArray(rightArray);
    }

    // Driver method
    public static void main(String[] args) {
        // declare an array
        int[] myArray = {1, 4, 3, 2, 2, 4};

        subArray(myArray);
    }

}
