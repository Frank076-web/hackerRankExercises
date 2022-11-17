package com.hackerRank.firstWeek.FourthExercise;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class Result {

    /*
     * Complete the 'breakingRecords' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY scores as parameter.
     */

    public static List<Integer> breakingRecords(List<Integer> scores) {
        // Write your code here
        int minimun = scores.get(0);
        int maximun = scores.get(0);
        int min = 0;
        int max = 0;

        for(int score : scores) {

            if(score > maximun) {
                maximun = score;
                max++;
            }

            if(score < minimun) {
                minimun = score;
                min++;
            }

        }

        return Arrays.asList(max, min);

    }

}
