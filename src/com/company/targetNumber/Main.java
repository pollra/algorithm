package com.company.targetNumber;

class Main {
    public static void main(String[] args) {
        final int[][] TEST = {
            {1, 1, 1, 1, 1}
        };
        final int[] TEST_TARGET = {
            3
        };
        int test = 0;

        Solution.BFS(TEST[test], TEST_TARGET[test]);
    }
}
