package com.core.algo;

public class fibonacci {
    public static void main(String[] args) {
        for (int i = 1; i < 10; i++)
            System.out.print(fibo(i)+",");
    }

    static int fibo(int n) {
        if (n==1 ||n==2) {
            return n-1;
        }
        return fibo(n - 1) + fibo(n - 2);
    }
}
//0,1,1,2,3,5,8,13,21,34,55,