package com.core.ds.array;

import java.util.List;

public class DiagonalDifference {
    public static void main(String[] args) {
        int a[][] = {{11, 2, 4}, {4, 5, 6}, {10, 8, -12}};
       System.out.println(diagonalDifference(a));
    }

    public static int diagonalDifference(int[][] a) {
        // Write your code here
        //int[][] a = arr.stream().map( u  ->  u.stream().mapToInt(i->i).toArray()  ).toArray(int[][]::new);
        int n = a.length;
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    sum1 = sum1 + a[i][j];
                }  if (i + j == n - 1) {
                    sum2 = sum2 + a[i][j];
                }
            }
        }
        return Math.abs(sum1 - sum2);
    }

}
