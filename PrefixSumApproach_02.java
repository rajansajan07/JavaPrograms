package com.example.programs;

public class PrefixSumApproach_02 {
    // method to print the array
    public static void printArray(int[] arr) {
        for (int x : arr) {
            System.out.print(x + " ");
        }
        System.out.println();
    }

    // method to make the prefix sum
    public static void makePrefixSumArray(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            arr[i] = arr[i - 1] + arr[i];
        }
    }

    // Driver code
    public static void main(String[] args) {
        // declare an array
        int[] myArray = {1, 2, 3, 4, 5, 6};

        makePrefixSumArray(myArray);
        printArray(myArray);
    }
}
