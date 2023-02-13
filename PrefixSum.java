package com.example.programs;

public class PrefixSum {
    // program to print the array
    public static void printArray(int[] arr) {
        for (int x : arr) {
            System.out.print(x + " ");
        }
        System.out.println();
    }
    // method to return the prefix-sum array
    public static int[] prefixSum(int[] arr) {
        int n = arr.length;
        int[] prefixSum = new int[n];

        prefixSum[0] = arr[0];
        for (int i = 1; i < n; i++) {
            prefixSum[i] = prefixSum[i - 1] + arr[i];
        }
        return prefixSum;
    }
    // Driver method
    public static void main(String[] args) {
        // declare an array
        int[] myArray = {1, 2, 3, 4, 5};

        int[] resultedArray = prefixSum(myArray);
        printArray(resultedArray);

    }
}
