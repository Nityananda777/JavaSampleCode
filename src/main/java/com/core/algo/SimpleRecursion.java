package com.core.algo;

public class SimpleRecursion {
    public static void main(String[] args) {
        new SimpleRecursion().foo(3);
    }

    void foo(int n) {
        if (n < 1)
            return;
        else {
            foo(n - 1);
            System.out.println("Value is : " + n);
        }
    }

}
