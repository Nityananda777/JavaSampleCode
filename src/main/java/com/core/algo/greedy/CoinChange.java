package com.core.algo.greedy;

public class CoinChange {

    public static void main(String[] args) {
        int a[] = {1, 2, 5, 10, 20, 50, 100, 500, 1000};
        coinChange(a, 2045);
    }

    private static void coinChange(int a[], int k) {
        int results = a[0];
        results = findCloestDenomination(a, k);
        int temp = 0;
        int i = 0;
        while (a[i] < k) {
            if (k - results == 0) {
                break;
            } else {
                int r = 0;
                r = k - results;
                temp = findCloestDenomination(a, r);
                System.out.println(temp);

            }
            i++;
        }
    }


    private static int findCloestDenomination(int[] a, int k) {
        int results = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] < k) {
                results = a[i];
            }
        }
        return results;
    }
}