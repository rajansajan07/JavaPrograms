package com.example.programs;

import java.util.Scanner;

public class MatrixOperation {
    // Scanner object
    public static Scanner sc = new Scanner(System.in);
    // method to generate an 1D array
    public static int[] generate1DArray(int n) {
        int[] randomArray = new int[n];
        for (int i = 0; i < n; i++) {
            int number = (int) (Math.floor(Math.random() * 11));
            randomArray[i] = number;
        }
        return randomArray;
    }

    // method to generate a 2D array
    public static int[][] generate2DArray(int r, int c) {
        int[][] randomArray = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                int number = (int) (Math.floor(Math.random() * 11));
                randomArray[i][j] = number;
            }
        }
        return randomArray;
    }
    // method to display 2D array
    public static void print2DArray(int[][] array) {
        for (int[] arr : array) {
            for (int x : arr) {
                System.out.print(x + " ");
            }
            System.out.println();
        }
    }
    // method to reverse an array
    public static void reverseArray(int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }

    // method to add the two arrays
    public static void addTwoMatrix(int[][] array1, int r1, int c1, int[][] array2, int r2, int c2) {
        // validating the input
        if (r1 != r2 || c1 != c2) {
            System.out.println("Wrong input - Addition is not possible");
            return;
        }

        int[][] sumArray = new int[r1][c1];

        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                sumArray[i][j] = array1[i][j] + array2[i][j];
            }
        }
        System.out.println("Addition of matrix:");
        print2DArray(sumArray);
    }
    // method to multiply the two matrix
    public static void multiplyTwoMatrix(int[][] matrix1, int r1, int c1, int[][] matrix2, int r2, int c2) {
        // validating the input
        if (c1 != r2) {
            System.out.println("Wrong input - Multiplication is not possible");
            return;
        }

        int[][] productMatrix = new int[r1][c2];

        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                productMatrix[i][j] = 0;
                for (int k = 0; k < c1; k++) {
                    productMatrix[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }
        print2DArray(productMatrix);
    }
    // method to make an transpose array
    public static int[][] transposeMatrix(int[][] matrix, int r, int c) {
        int[][] transMatrix = new int[c][r];

        for (int i = 0; i < c; i++) {
            for (int j = 0; j < r; j++) {
                transMatrix[i][j] = matrix[j][i];
            }
        }
        return transMatrix;
    }

    // method to transpose the matrix in place
    public static void transposeMatrixInPlace(int[][] matrix, int r, int c) {
        // validating the input
        if (r != c) {
            System.out.println("Inplace transpose in no possible");
            return;
        }
        for (int i = 0; i < r; i++) {
            for (int j = i; j < c; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
    }

    // method to rotate the matrix by 90deg in the clockwise direction
    public static void rotateMatrix(int[][] matrix, int r, int c) {
        // transpose a matrix and reverse each row of the matrix
        transposeMatrixInPlace(matrix, r, c);

        for (int i = 0; i < c; i++) {
            reverseArray(matrix[i]);
        }
        print2DArray(matrix);
    }
    public static void main(String[] args) {
        // declare the variables
        int r, c;

        System.out.print("Enter the rows and columns of the matrix: ");
        r = sc.nextInt();
        c = sc.nextInt();

        int[][] matrix = generate2DArray(r, c);

        System.out.println("Given matrix:");
        print2DArray(matrix);

        // rotate the matrix
        System.out.println("Rotated matrix");
        rotateMatrix(matrix, r, c);




    }
}
