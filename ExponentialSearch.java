package com.example.javaprojects;

import java.util.Scanner;

public class ExponentialSearch {
    // program to implement the binarySearch
    public static int binarySearch(int[] arr, int low, int high, int key) {
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == key) {
                return mid;
            } else if (arr[mid] > key) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }
    // Write a program to implement the exponential search
    public static int exponentialSearch(int[] arr, int key) {
        int size = arr.length;

        if (arr[0] == key) {
            return 0;
        }
        int i = 1;
        while (i < size && arr[i] <= key) {
            if (arr[i] == key) {
                return i;
            }
            i *= 2;
        }
        return binarySearch(arr, i / 2, Math.min(i, size - 1), key);
    }
    public static void main(String[] args) {
        // declare an array
        int[] myArray = {1, 2, 3, 4, 5, 6, 7, 8};

        // values of keys
        int[] keys = {-5, 1, 4, 8, 10};
        for (int key : keys) {
            int index = exponentialSearch(myArray, key);
            System.out.print("For the key: " + key + "\t\t\t");
            if (index != -1 ) {
                System.out.print("Index: " + index);
            } else {
                System.out.print("Not found");
            }
            System.out.println();
        }
    }
}
