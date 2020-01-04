package com.core.algo;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

public class LuckBalance {

    public static void main(String[] args) {

        int maxLuck = 0;
        List<Integer> importantContests = new ArrayList<>();
        //////////////////////
        //Build list of important contests
        int[][] contests = {{5, 1}, {2, 1}, {1, 1}, {8, 1}, {10, 0}, {5, 0}};
    }

    static int luckBalance(int k, int[][] contests) {
        int numLuck = 0;
        int totalImportant = 0;
        PriorityQueue<Integer> minHeap = new PriorityQueue<Integer>(new Comparator<Integer>() {
            @Override
            public int compare(Integer obj1, Integer obj2) {
                return obj1 - obj2;
            }
        });
        for (int[] contest : contests) {
            numLuck += contest[0];
            if (contest[1] == 1) {
                minHeap.offer(contest[0]);
                totalImportant++;
            }
        }
        for (int i = 0; i < totalImportant - k; i++) {
            numLuck -= 2 * minHeap.poll();
        }
        return numLuck;
    }
}
