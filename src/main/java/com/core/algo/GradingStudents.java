package com.core.algo;

import java.util.List;

public class GradingStudents {
    public static void main(String[] args) {
        int[] grade = {4, 73, 67, 38, 33};

    }

    public static List<Integer> gradingStudents(List<Integer> grades) {
        // Write your code here
        int[] arr = grades.stream().mapToInt(p -> p.intValue()).toArray();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 5 == 0)
            {

            }
        }
        return  null;
    }
}
