package com.core.ds.array;

public class CloesestDivisible {
    public static void main(String[] args) {
        int a[] = {2, 4, 5, 6, 9,10,11,13,12,15};
        closestDivisible(a);
    }

    private static int closestDivisible(int a[]) {

        for (int i = 0; i < 10; i++) {
            if (a[i]%5==0)
            {
                System.out.println(a[i]);
            }
        }
        return 0;
    }
}
