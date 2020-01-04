package com.core.ds.array;

public class RotateArray {
    /* Function to left rotate arr[] of size n by d */
    void leftRotate(int arr[], int d, int n) {
        for (int i = 0; i < d; i++) {
            int j, temp;
            temp = arr[0];
            for (j = 0; j < n - 1; j++) {
                arr[j] = arr[j + 1];
            }
            arr[j] = temp;
        }
    }

    /* utility function to print an array */
    void printArray(int arr[], int size) {
        int i;
        for (i = 0; i < size; i++)
            System.out.print(arr[i] + " ");
    }

    // Driver program to test above functions
    public static void main(String[] args) {
        RotateArray rotate = new RotateArray();
        int arr[] = {1, 2, 3, 4, 5, 6, 7};
        rotate.leftRotate(arr, 2, 7);
        rotate.printArray(arr, 7);
    }
}
