package com.example.javaprojects;

public class InsertionSort {
    // Insertion sort
    // In this sorting algorithm we virtually divide the array into two parts one is sorted and the
    // other one is the unsorted part and we pick the element from the unsorted part and place it
    // in its proper position in the sorted part
    public static void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int current = arr[i];

            // last element of the sorted array
            int j = i - 1;

            // compare from the last element of the sorted array to first element and
            while (j >= 0 && arr[j] > current) {
                arr[j + 1] = arr[j--];
            }
            arr[++j] = current;
        }
    }
    public static void main(String[] args) {
        // declare an array
        int[] myArray = {5, -1, 2, -2, 3, 5, 10, 22};

        insertionSort(myArray);

        for (int x : myArray) {
            System.out.print(x + " ");
        }
    }
}
