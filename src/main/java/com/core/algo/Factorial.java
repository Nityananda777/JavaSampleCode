package com.core.algo;

public class Factorial {


    public static void main(String[] args) {
        System.out.println(fact(5));
    }

    static int fact(int x) {
        int results = 0;
        if (x == 0) {
            return 1;
        } else {
            results = x * fact(x - 1);
            System.out.println("results : "+results);
        }
        return results;
    }
}
