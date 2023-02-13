package com.example.programs;

public class ReverseArray {
    // write a program to reverse an array

    // first method
    public static int[] reversedArray(int[] arr) {
        int n = arr.length;
        int[] revArray = new int[n];

        int j = 0;
        for (int i = n-1; i >= 0; i--) {
            revArray[j++] = arr[i];
        }
        return revArray;
    }

    // second method
    public static void reverseArray(int[] arr) {
        int n = arr.length;
        int temp;
        for (int i = 0, j = n-1; i < n/2; i++, j--) {
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }
    public static void main(String[] args) {
        int[] myArray = {1, 2, 3, 4, 5, 6};

        myArray = reversedArray(myArray);
        for (int x : myArray) {
            System.out.print(x + " ");
        }
    }




}
