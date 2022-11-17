package com.hackerRank.firstWeek.secondExercise;

import java.util.List;
import java.util.stream.Collectors;

public class Result {

    /*
     * Complete the 'miniMaxSum' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void miniMaxSum(List<Integer> arr) {
        // Write your code here

        long maxSum = 0;
        long minSum = 0;

        List<Integer> descOrder = arr.stream().sorted((a, b) -> a < b ? 0 : -1).collect(Collectors.toList());
        List<Integer> ascOrder = arr.stream().sorted().toList();

        for(int i = 0; i < arr.size() - 1; i++) {
            maxSum += descOrder.get(i);
            minSum += ascOrder.get(i);
        }

        System.out.println(minSum + " " + maxSum);

    }

}