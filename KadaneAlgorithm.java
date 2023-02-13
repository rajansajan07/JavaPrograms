package com.example.apple;

public class KadaneAlgorithm {
    // method to find the continuous subarray with the maximum sum using brute force approach
    public static int maxSubArrayBruteForce(int[] arr, int n) {
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            int currentSum = 0;
            for (int j = i; j < n; j++) {
                currentSum += arr[i];
                if (currentSum > maxSum) {
                    maxSum = currentSum;
                }
            }
        }
        return maxSum;
    }

    // method to find the continuous subarray with the maximum sum using sliding window
    public static int maxSubArraySlidingWindow(int[] arr, int n) {
        int maxSum = Integer.MIN_VALUE;
        int currentSum = 0;

        for (int i = 0; i < n; i++) {
            currentSum += arr[i];
            if (currentSum > maxSum) {
                maxSum = currentSum;
            }
            if (currentSum < 0) {
                currentSum = 0;
            }
        }
        return maxSum;
    }

    // Driver method
    public static void main(String[] args) {
        int[] arr = {-1,-2,-3,-4};
        int n = arr.length;

        int result = maxSubArraySlidingWindow(arr, n);
        System.out.println(result);

    }
}
