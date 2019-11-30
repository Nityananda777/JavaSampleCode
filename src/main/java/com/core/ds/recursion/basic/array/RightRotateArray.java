package com.core.ds.recursion.basic.array;

public class RightRotateArray {
	/* Function to left rotate arr[] of size n by d */
	void rightRotate(int arr[], int d, int n) {
		int i;
		for (i = 0; i < d; i++)
			rightRotatebyOne(arr, n);
	}

	void rightRotatebyOne(int arr[], int n) {
		int i, temp;
		temp = arr[0];
		for (i = 0; i < n - 1; i++) {
			arr[i] = arr[i + 1];
		}
		arr[i] = temp;
	}

	/* utility function to print an array */
	void printArray(int arr[], int size) {
		int i;
		for (i = 0; i < size; i++)
			System.out.print(arr[i] + " ");
	}

	// Driver program to test above functions
	public static void main(String[] args) {
		RightRotateArray rotate = new RightRotateArray();
		int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
		rotate.rightRotate(arr, 2, 7);
		rotate.printArray(arr, 7);
	}
}
