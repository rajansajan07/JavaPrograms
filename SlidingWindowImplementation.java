package com.example.apple;

public class SlidingWindowImplementation {
    // method to find the sum of the k consecutive integer
    public static int kConsIntegers(int[] arr, int n, int k) {
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < n - k + 1; i++) {
            int currentSum = 0;
            for (int j = 0; j < k; j++) {
                currentSum += arr[i + j];
            }
            if (currentSum > maxSum) {
                maxSum = currentSum;
            }
        }
        return maxSum;
    }

    // method to find the maximum sum of k consecutive integers using sliding window
    public static int kConsIntegersUsingSlidingWindow(int[] arr, int n, int k) {
        int slidingWindow = 0;
        for (int i = 0; i < k; i++) {
            slidingWindow += arr[i];
        }

        int maxSum = slidingWindow;
        for (int i = 1; i < n - k + 1; i++) {
            slidingWindow += arr[i + k - 1] - arr[i - 1];
            if (slidingWindow > maxSum) {
                maxSum = slidingWindow;
            }
        }
        return maxSum;
    }
    public static void main(String[] args) {

        int[] arr = {100, 200, 300, 400, 1700, 500, 1200};
        int n = arr.length;
        int k = 1;

        int result = kConsIntegersUsingSlidingWindow(arr, n, k);
        System.out.println(result);











    }
}
