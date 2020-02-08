package com.company.targetNumber;

class Solution {
    public static int solution(int[] numbers, int target) {
        return BFS(numbers, target);
    }

    public static int BFS(int[] numbers, int target){
        int index = numbers.length-1;
        int depth = 1;
        while (index-- >= 0) depth*=2;
        int[] answers = new int[depth];
        System.out.println("depth: "+depth);
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length; j++) {

            }
        }
        return 0;
    }
}
