package com.example.javaprojects;

public class SelectionSort {
    public static void selectionSort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int min_index = i;

            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[min_index]) {
                    min_index = j;
                }
            }
            int temp = arr[min_index];
            arr[min_index] = arr[i];
            arr[i] = temp;
        }
    }
    public static void main(String[] args) {
        // declare an array
        int[] myArray = {6, 9, -1, 0, 4, 30, 29};

        selectionSort(myArray);

        for (int item : myArray) {
            System.out.print(item + " ");
        }
    }
}
