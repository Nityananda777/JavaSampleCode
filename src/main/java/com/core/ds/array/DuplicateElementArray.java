package com.core.ds.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class DuplicateElementArray {
    public static int removeDuplicates(ArrayList<Integer> a) {
        int arr[] = a.stream().mapToInt(i -> i).toArray();

        int n = arr.length;
        int j = 0;
        for (int i = 0; i < n; i++) {

            if (i < n - 1 && arr[i] == arr[i + 1]) {
                continue;
            }
            arr[j++] = arr[i];
        }
        return j;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3};
        List<Integer> al = Arrays.stream(nums).boxed().collect(Collectors.toList());
        int l = removeDuplicates(new ArrayList<>(al));
        for (int i = 0; i < l; i++) {
            System.out.print(nums[i] + " ");
        }


    }
}
