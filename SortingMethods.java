package com.example.apple;

import java.util.HashSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.*;
import java.util.Collections;


public class SortingMethods {

    // method to generate the random array
    public static int[] randomArray() {
        int n = (int) (Math.floor(Math.random() * 20 + 10));
        n = 13;
        int[] rArray = new int[n];
        for (int i = 0; i < n; i++) {
            int num = (int) (Math.floor(Math.random() * 20 - 10));
            rArray[i] = num;
        }
        return rArray;
    }
    // method to swap the array elements
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    // method to implement the bubble sort
    public static void bubbleSortIterative(int[] arr, int n) {
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j + 1] < arr[j]) {
                    swap(arr, j + 1, j);
                }
            }
        }
    }

    // method to implement bubble sort using recursion
    public static void bubbleSortRecursion(int[] arr, int n) {
        if (n == 1) {
            return;
        }
        for (int i = 0; i < n - 1; i++) {
            if (arr[i + 1] < arr[i]) {
                swap(arr, i + 1, i);
            }
        }
        bubbleSortRecursion(arr, n - 1);
    }

    // method to implement the selection sort
    public static void selectionSort(int[] arr, int n) {
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            swap(arr, i, minIndex);
        }
    }

    // method to implement the selection sort using recursion
    public static void selectionSortRecursive(int[] arr, int startIndex) {
        if (startIndex == arr.length - 1) {
            return;
        }
        int minIndex = startIndex;
        for (int i = startIndex + 1; i < arr.length; i++) {
            if (arr[i] < arr[minIndex]) {
                minIndex = i;
            }
        }
        swap(arr, startIndex, minIndex);
        selectionSortRecursive(arr, startIndex + 1);
    }

    // method to implement the insertion sort
    public static void insertionSort(int[] arr, int n) {
        for (int i = 1; i < n; i++) {
            int current = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > current) {
                arr[j + 1] = arr[j--];
            }
            arr[j + 1] = current;
        }
    }

    // method to implement the insertion sort using recursion
    public static void insertionSortRecursive(int[] arr, int n) {
        if (n <= 1) {
            return;
        }
        insertionSortRecursive(arr, n - 1);
        int last = arr[n - 1];
        int j = n - 2;
        while (j >= 0 && arr[j] > last) {
            arr[j + 1] = arr[j--];
        }
        arr[j + 1] = last;

    }
    // method to implement the mergeSort
    public static void mergeSort(int[] arr) {
        if (arr.length > 1) {
            int mid = arr.length / 2;

            int[] leftArray = Arrays.copyOfRange(arr, 0, mid);
            int[] rightArray = Arrays.copyOfRange(arr, mid, arr.length);

            mergeSort(leftArray);
            mergeSort(rightArray);


        }
    }

    public static void main(String[] args) {

        int[] gArray = randomArray();
        System.out.println(Arrays.toString(gArray));
//        bubbleSortIterative(gArray, gArray.length);
//        System.out.println(Arrays.toString(gArray));
//
//
//        gArray = randomArray();
//        bubbleSortRecursion(gArray, gArray.length);
//        System.out.println(Arrays.toString(gArray));
//
//        gArray = randomArray();
//        selectionSort(gArray, gArray.length);
//        System.out.println(Arrays.toString(gArray));

//        selectionSortRecursive(gArray, 0);
//        System.out.println(Arrays.toString(gArray));

        mergeSort(gArray);
        System.out.println(Arrays.toString(gArray));

























    }
}
