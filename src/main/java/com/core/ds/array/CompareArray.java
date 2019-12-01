package com.core.ds.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CompareArray {
    public static void main(String[] args) {
        Integer a[] = {17, 28, 30};
        Integer[] b = {99, 16, 8};
        List<Integer> list = compareTriplets(Arrays.asList(a), Arrays.asList(b));
        list.forEach(System.out::println);
    }

    static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        int[] arr1 = a.stream().mapToInt(p -> p.intValue()).toArray();
        int[] arr2 = b.stream().mapToInt(p -> p.intValue()).toArray();
        List<Integer> list3 = new ArrayList<>();
        int j = 0;
        int sum1 = 0;
        int sum2=0;
        for (int i = 0; i < arr1.length; i++) {
            while (i == j) {
                if (arr1[i] > arr2[j]) {
                    sum1=sum1+1;
                } else if (arr1[i] < arr2[j]) {
                    sum2=sum2+1;
                }
                j++;
            }

        }
        list3.add(sum1);
        list3.add(sum2);
        return list3;
    }

}
