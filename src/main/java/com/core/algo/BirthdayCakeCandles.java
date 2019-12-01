package com.core.algo;

public class BirthdayCakeCandles {
    public static void main(String args[]) {
        int[] a = new int[]{3, 2, 1, 3};
        int max = 0;
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
                count = 1;
            } else if (a[i] == max) {
                count++;
            }
            System.out.println(count);
        }
    }
}
