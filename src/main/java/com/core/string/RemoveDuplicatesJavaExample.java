package com.core.string;

public class RemoveDuplicatesJavaExample {
    static void removeDuplicates(int[] arrayWithDuplicates) {

        int noOfUniqueElements = arrayWithDuplicates.length;

        for (int i = 0; i < noOfUniqueElements; i++) {
            for (int j = i + 1; j < noOfUniqueElements; j++) {
                if (arrayWithDuplicates[i] == arrayWithDuplicates[j]) {
                    arrayWithDuplicates[j] = arrayWithDuplicates[noOfUniqueElements - 1];
                    noOfUniqueElements--;
                    j--;
                }
            }
        }
    }

    public static void main(String[] args) {
        removeDuplicates(new int[]{4, 3, 2, 4, 9, 2});
    }
}
