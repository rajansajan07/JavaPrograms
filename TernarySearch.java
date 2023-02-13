package com.example.javaprojects;

import java.util.Scanner;

public class TernarySearch {
    // program to implement the ternary search
    public static int ternarySearch(int[] arr, int l, int r, int key) {
        if (l <= r) {
            int mid1 = l + (r - l) / 3;
            int mid2 = r - (r - l) / 3;

            if (arr[mid1] == key) {
                return mid1;
            }
            if (arr[mid2] == key) {
                return mid2;
            }
            if (arr[mid1] > key) {
                return ternarySearch(arr, l, mid1 - 1, key);
            } else if (arr[mid2] < key) {
                return ternarySearch(arr, mid2 + 1, r, key);
            } else {
                return ternarySearch(arr, mid1 + 1, mid2 - 1, key);
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        // declare an array
        int[] myArray = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int key = 9;

        int l = 0;
        int r = myArray.length - 1;

        int index = ternarySearch(myArray, l, r, key);
        if (index != -1) {
            System.out.println("The element is found at the index: " + index);
        } else {
            System.out.println("There is no such element");
        }
    }
}
