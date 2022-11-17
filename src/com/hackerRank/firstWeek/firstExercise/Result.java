package com.hackerRank.firstWeek.firstExercise;

import java.util.List;

class Result {

    /*
     * Complete the 'plusMinus' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void plusMinus(List<Integer> arr) {
        double positiveNumbers = 0;
        double negativeNumbers = 0;
        double zeroNumbers = 0;

        for (int n : arr) {
            if (n > 0 ) positiveNumbers += 1;
            else if (n < 0) negativeNumbers += 1;
            else zeroNumbers += 1;
        }

        try {
            System.out.printf("%.6f\n", (positiveNumbers / arr.size()));
            System.out.printf("%.6f\n", negativeNumbers / arr.size());
            System.out.printf("%.6f\n", zeroNumbers / arr.size());
        } catch (Exception e) {
            e.printStackTrace();
        }



    }

}