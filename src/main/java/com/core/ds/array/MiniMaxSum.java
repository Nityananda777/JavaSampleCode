package com.core.ds.array;

public class MiniMaxSum {
    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4, 5};
        miniMaxSum(a);
    }

    static void miniMaxSum(int[] arr) {
        int n=arr.length;
        long minVal = 0, maxVal = 0;
        for (int i = 0; i < n; i++) {
            long minf = sumOfNumbers(i, arr);
            long maxf = sumOfNumbers(i, arr);
            if (i == 0) {
                minVal = minf;
                maxVal = maxf;
            }
            if (minf < minVal) {
                minVal = minf;
            }
            if (maxf > maxVal) {
                maxVal = maxf;
            }
        }
        System.out.println(minVal + " " + maxVal);
    }

    static long sumOfNumbers(int a, int[] arr) {
        long sum = 0;
        for (int i = 0; i < 5; i++) {
            if (a != i) {
                sum += arr[i];
            }
        }
        return sum;
    }
}
