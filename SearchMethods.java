package com.example.apple;

import java.util.HashSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.*;
import java.util.Collections;


public class SearchMethods {
    // method to generate a random array
    public static int[] randomArray() {
        int n = (int) (Math.floor(Math.random() * 15 + 10));
        n = 20;
        int[] rArray = new int[n];
        for (int i = 0; i < n; i++) {
            int num = (int) (Math.floor(Math.random() * 20 - 10));
            rArray[i] = num;
        }
        return rArray;
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


    // method to implement binary search using iterative approach
    public static int binarySearchIterative(int[] arr, int n, int key) {
        int low = 0;
        int high = n - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (key < arr[mid]) {
                high = mid - 1;
            } else if (key > arr[mid]) {
                low = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }


    // method to implement binary search using recursive approach
    public static int binarySearchRecursive(int[] arr, int low, int high, int key) {
        if (low <= high) {
            int mid = low + (high - low);
            if (key < arr[mid]) {
                return binarySearchRecursive(arr, low, mid - 1, key);
            } else if (key > arr[mid]) {
                return binarySearchRecursive(arr, mid + 1, high, key);
            } else {
                return mid;
            }
        }
        return -1;
    }

    // method to implement the jump search
    public static int jumpSearch(int[] arr, int n, int target) {
        int step = (int) (Math.floor(Math.sqrt(n)));
        int prev = 0;
        while (arr[Math.min(step, n) - 1] < target) {
            prev = step;
            step += (int) (Math.floor(Math.sqrt(n)));
            if (prev == Math.min(step, n)) {
                return -1;
            }
        }
        // perform linear search from prev to Math.min(step, n)
        while (arr[prev] < target) {
            prev++;
            if (prev == Math.min(step, n)) {
                return -1;
            }
        }
        if (arr[prev] == target) {
            return prev;
        }
        return -1;
    }

    // method to implement the interpolation search
    public static int interpolationSearch(int[] arr, int n, int key) {
        int low = 0;
        int high = n - 1;
        while (low <= high && key >= arr[low] && key <= arr[high]) {
            int mid = low + (key - arr[low]) * (high - low) / (arr[high] - arr[low]);
            if (key < arr[mid]) {
                high = mid - 1;
            } else if (key > arr[mid]) {
                low = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    // method to implement the interpolation search using recursion
    public static int interpolationSearchRecursion(int[] arr, int low, int high, int key) {
        if (low <= high && key >= arr[low] && key <= arr[high]) {
            int mid = low + (key - arr[low]) * (high - low) / (arr[high] - arr[low]);
            if (key < arr[mid]) {
                return interpolationSearchRecursion(arr, low, mid - 1, key);
            } else if (key > arr[mid]) {
                return interpolationSearchRecursion(arr, mid + 1, high, key);
            } else {
                return mid;
            }
        }
        return -1;
    }

    // method to implement ternary search using iterative approach
    public static int ternarySearchIterative(int[] arr, int n, int key) {
        int low = 0;
        int high = n - 1;

        while (low <= high) {
            int mid1 = low + (high - low) / 3;
            int mid2 = high - (high - low) / 3;

            if (key == arr[mid1]) {
                return mid1;
            }
            if (key == arr[mid2]) {
                return mid2;
            }

            if (key < arr[mid1]) {
                high = mid1 - 1;
            } else if (key < arr[mid2]) {
                low = mid1 + 1;
                high = mid2 - 1;
            } else {
                low = mid2 + 1;
            }
        }
        return -1;
    }

    // method to implement the ternary search using recursion
    public static int ternarySearchRecursion(int[] arr, int low, int high, int key) {
        if (low <= high) {
            int mid1 = low + (high - low) / 3;
            int mid2 = high - (high - low) / 3;

            if (key == arr[mid1]) {
                return mid1;
            }
            if (key == arr[mid2]) {
                return mid2;
            }

            if (key < arr[mid1]) {
                return ternarySearchRecursion(arr, low, mid1 - 1, key);
            } else if (key < arr[mid2]) {
                return ternarySearchRecursion(arr, mid1 + 1, mid2 - 1, key);
            } else {
                return ternarySearchRecursion(arr, mid2 + 1, high, key);
            }
        }
        return -1;
    }
    // method to implement the exponential search
    public static int exponentialSearch(int[] arr, int n, int key) {
        int bound = 1;
        while (bound < n && arr[bound] < key) {
            bound *= 2;
        }
        int low = bound / 2;
        int high = Math.min(bound, n - 1);
        return binarySearchRecursive(arr, low, high, key);
    }

    public static void main(String[] args) {

        int[] gArray = randomArray();
        insertionSort(gArray, gArray.length);
        System.out.println(Arrays.toString(gArray));

        int key = 4;
        System.out.println("Index: " + binarySearchIterative(gArray, gArray.length, key));
        System.out.println("Index: " + binarySearchRecursive(gArray, 0, gArray.length - 1, key));
        System.out.println("Index: " + jumpSearch(gArray, gArray.length, key));
        System.out.println("Index: " + interpolationSearch(gArray, gArray.length, key));
        System.out.println("Index: " + interpolationSearchRecursion(gArray, 0, gArray.length - 1, key));
        System.out.println("Index: " + ternarySearchIterative(gArray, gArray.length, key));
        System.out.println("Index: " + ternarySearchRecursion(gArray, 0, gArray.length, key));
        System.out.println("Index: " + exponentialSearch(gArray, gArray.length, key));




















    }
}
