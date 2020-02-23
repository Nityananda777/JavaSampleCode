package com.core.string;

public class FibbonacciSeries {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int n1 = 0, n2 = 1;
        int third = 0;
        for (int i = 0; i < 10; i++) {
            third = n1 + n2;
            System.out.println(third);
            n1 = n2;
            n2 = third;
        }
    }

}
