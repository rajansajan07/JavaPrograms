package com.example.javaprojects;

public class SearchingApproach {
    // method to generate the random array
    public static int[] generateArray(int n) {
        int[] randomArray = new int[n];
        for (int i = 0; i < n; i++) {
            int num = (int) (Math.floor(Math.random() * 20 - 10));
            randomArray[i] = num;
        }
        return randomArray;
    }
    // method to implement the linear search using iterative approach
    public static int linearSearch(int[] arr, int key) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if (arr[i] == key) {
                return i;
            }
        }
        return -1;
    }
    // method to implement the linear search using recursive approach
    public static int linearSearch(int[] arr, int size, int key) {
        if (size == 0) {
            return -1;
        } else if (arr[size - 1] == key) {
            return size - 1;
        } else {
            return linearSearch(arr, size - 1, key);
        }
    }

    // method to implement the binary search
    public static int binarySearch(int[] arr, int key) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (key == arr[mid]) {
                return mid;
            } else if (key < arr[mid]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }
}
