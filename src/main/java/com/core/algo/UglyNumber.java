package com.core.algo;

public class UglyNumber {
    public static void main(String[] args) {
        int n = 15;
        int count = 0;
        for (int i = 0; i <= n; i++) {
            if (isUgly(i)) ;
            {
                count++;
            }
        }
        System.out.println(count);
    }

    private static boolean isUgly(int n) {

        boolean flag = false;
        int x = 0;
        while (n != 1) {
            if (n % 2 == 0) {
                n /= 2;
                flag = true;
                break;
            } else if (n % 3 == 0) {
                n /= 3;
                flag = true;
                break;
            } else if (n % 5 == 0) {
                n /= 5;
                flag = true;
                break;
            } else {
                flag = false;
                break;
            }

        }
        return flag;
    }
}