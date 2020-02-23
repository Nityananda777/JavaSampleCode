package com.core.ds.array;

import java.util.*;

public class RemoveDuplicateSortedArray {
    public static void main(String[] args) {

        int a[] = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int j = remoevDuplicatedSortedArray(a);
        System.out.println(j);
    }

    private static int remoevDuplicatedSortedArray(int[] a) {
        int j = 0;
        for (int i = 1; i < a.length; i++) {
            if (a[i] != a[j]) {
                j++;
                a[j] = a[i];
            }

        }
        return j+1;
    }
    public int singleNumber(int[] nums) {
        Set<Integer> set=new HashSet<>();
        for(int i=0;i<nums.length;i++)
        {
            if(!set.add(nums[i]))
                set.remove(nums[i]);
        }
        Iterator<Integer> it=set.iterator();
        return it.next().intValue();
    }

}
