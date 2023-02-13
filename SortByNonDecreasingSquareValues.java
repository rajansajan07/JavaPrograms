package com.example.programs;

public class SortByNonDecreasingSquareValues {
    // method to print the array
    public static void printArray(int[] arr) {
        for (int x : arr) {
            System.out.print(x + " ");
        }
        System.out.println();
    }

    // method to swap the square values
    public static void swapValues(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    // alternative method to sort
    public static int[] sortSquared(int[] arr) {
        int n = arr.length;
        int left = 0;
        int right = n - 1;
        int[] resultedArray = new int[n];

        int i = 0;
        while (left < right) {
            // if the absolute value of arr[left] is less than the absolute value of arr[right]
            if (Math.abs(arr[left]) <= Math.abs(arr[right])) {
                resultedArray[i++] = arr[left] * arr[left];
                left++;
            } else {
                resultedArray[i++] = arr[right] * arr[right];
                right--;
            }
        }
        return resultedArray;
    }

    // method to sort the array by non-decreasing order
    public static void sortByNonDecreasingOrder(int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            // if the absolute(arr[left]) is greater than absolute(arr[right])
            if (Math.abs(arr[left]) > Math.abs(arr[right])) {
                swapValues(arr, left, right);
            }
            right--;
        }
    }

    // driver code
    public static void main(String[] args) {
        // declare an array
        int[] myArray = {-7, -4, -3, 5, 6, 8};
//        sortByNonDecreasingOrder(myArray);
//        printArray(myArray);
//
//        for (int i = 0; i < myArray.length; i++) {
//            myArray[i] = (int) Math.pow(Math.abs(myArray[i]), 2);
//        }
//        printArray(myArray);

        int[] ans = sortSquared(myArray);
        printArray(ans);
    }
}
