package com.example.programs;

import java.util.Scanner;

public class AltSortZerosAndOnes {
    // method to print the array
    public static void printArray(int[] arr) {
        for (int x : arr) {
            System.out.print(x + " ");
        }
        System.out.println();
    }

    // method to swap the array
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    // method sot sort the array containing zeroes and ones
    public static void sortZeroesAndOnes(int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            if (arr[left] == 1 && arr[right] == 0) {
                swap(arr, left, right);
                left++;
                right--;
            }
            if (arr[left] == 0) {
                left++;
            }
            if (arr[right] == 1) {
                right--;
            }
        }
    }

    // Driver method
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // declare and array
        int[] myArray = {0, 1, 0, 1, 0, 0, 1, 0, 0, 1};
        sortZeroesAndOnes(myArray);
        printArray(myArray);

    }
}
