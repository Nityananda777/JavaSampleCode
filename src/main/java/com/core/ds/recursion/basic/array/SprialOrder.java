package com.core.ds.recursion.basic.array;

public class SprialOrder {
    // Function print matrix in spiral form
    static void spiralPrint(int endRowIndex, int endColIndex, int a[][]) {
        int i, startRowIndex = 0, startColIndex = 0;
        /*
        startRowIndex - starting row index
        endRowIndex - ending row index
        startColIndex - starting column index
        endColIndex - ending column index
        i - iterator
        */

        while (startRowIndex < endRowIndex && startColIndex < endColIndex) {
            // Print the first row from the remaining rows
            for (i = startColIndex; i < endColIndex; ++i) {
                System.out.print(a[startRowIndex][i] + " ");
            }
            startRowIndex++;

            // Print the last column from the remaining columns
            for (i = startRowIndex; i < endRowIndex; ++i) {
                System.out.print(a[i][endColIndex - 1] + " ");
            }
            endColIndex--;

            // Print the last row from the remaining rows */
            if (startRowIndex < endRowIndex) {
                for (i = endColIndex - 1; i >= startColIndex; --i) {
                    System.out.print(a[endRowIndex - 1][i] + " ");
                }
                endRowIndex--;
            }

            // Print the first column from the remaining columns */
            if (startColIndex < endColIndex) {
                for (i = endRowIndex - 1; i >= startRowIndex; --i) {
                    System.out.print(a[i][startColIndex] + " ");
                }
                startColIndex++;
            }
        }
    }

    // driver program
    public static void main(String[] args) {
        int R = 4;
        int C = 4;
        int a[][] = {{1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}};
        spiralPrint(R, C, a);
    }
}
