package com.atomic;

import java.util.Random;
import java.util.Arrays;

public class Main {

    static int[] randomTemperatures(int n) {
        int[] ts = new int[n];
        for (int i = 0; i < ts.length; ++i) {
            ts[i] = i;
        }
        Random random = new Random(10);
        for (int i = 0; i < ts.length; ++i) {
            int j = i + random.nextInt(ts.length - i);
            int t = ts[i];
            ts[i] = ts[j];
            ts[j] = t;
        }
        return ts;
    }

    public static void main(String[] args) {

            int []tss1={5,-2,3,8,6};
            int []tss={-5,-5,-5,-42,6,12};
            Solution s = new Solution();
            int s1 = s.solution1(tss);
            System.out.println(s1);
        }

    static class Solution {
        int solution1(int[] T) {
            int counter = 1;
            int winterMax = T[0];
            int summerMax = Integer.MIN_VALUE;
            boolean isWinter = true;
            for (int i = 1; i < T.length; i++) {
                int elem = T[i];
                if (isWinter) {
                    if (elem > winterMax) {
                        isWinter = false;
                        counter = i;
                    }
                }
                else {
                    if (elem <= winterMax) {
                        isWinter = true;
                        winterMax = summerMax;
                    }
                }
                summerMax = Math.max(summerMax, elem);
            }
            if (isWinter) {
                counter = T.length;
            }
            return counter;
        }
    }
}
