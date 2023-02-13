package com.example.programs;

public class SortByParity {
    // method to print the array
    public static void printArray(int[] arr) {
        for (int x : arr) {
            System.out.print(x + " ");
        }
        System.out.println();
    }

    // method to swap the array values
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    // method to sort the array by parity
    public static void sortByParity(int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        // until the left pointer exceeds the right pointer
        while (left < right) {
            // if arr[left] is odd and arr[right] is even
            if (arr[left] % 2 != 0 && arr[right] % 2 == 0) {
                swap(arr, left, right);
                left++;
                right--;
            }
            // if the left arr[left] is even
            if (arr[left] % 2 == 0) {
                left++;
            }
            // if the right arr[right] is odd
            if (arr[right] % 2 != 0) {
                right--;
            }
        }
    }

    public static void main(String[] args) {
        // declare an array
        int[] myArray = {1, 2, 0, 4, 3, 5, 8};

        sortByParity(myArray);
        printArray(myArray);
    }
}
