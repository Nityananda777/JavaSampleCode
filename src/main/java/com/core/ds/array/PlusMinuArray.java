package com.core.ds.array;

public class PlusMinuArray {
    public static void main(String[] args) {
        int a[] = {-4, 3, -9, 0, 4, 1};
        plusMinus(a);
    }

    private static void plusMinus(int[] a) {
        double countPos = 0;
        double countMin = 0;
        double zeroCount = 0;
        int n = a.length;
        for (int i = 0; i < n; i++) {
            if (a[i] < 0) {
                countMin++;
            }
            if (a[i] > 0) {
                countPos++;
            }
            if (a[i] == 0) {
                zeroCount++;
            }
        }
        System.out.println(countPos / n);
        System.out.println(countMin / n);
        System.out.println(zeroCount / n);
    }
}
