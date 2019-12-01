package com.core.algo;

public class StaircaseProblem {
    public static void main(String[] args) {
        stairCase(4);
    }

    private static void stairCase(int n) {
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= n; j++) {
                if ((i + j) > n) {
                    System.out.print("#");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}