package com.core.algo.greedy;

import java.util.Arrays;

public class MinimumAbsoluteDifference {
    public static void main(String[] args) {
        int arr[] = {-59, -36, -13, 1, -53, -92, -2, -96, -54, 75};
        System.out.println(minimumAbsoluteDifference(arr));
    }

    static int minimumAbsoluteDifference(int[] arr) {
        int n = arr.length;
        int min = Integer.MAX_VALUE;
        Arrays.sort(arr);
        System.out.println("after sort values are.."+Arrays.toString(arr));
        for (int i = 0; i < n - 1; i++) {
            if (Math.abs(arr[i] - arr[i + 1]) < min) {
                min = Math.abs(arr[i] - arr[i + 1]);
            }

        }
        return min;

    }
}
