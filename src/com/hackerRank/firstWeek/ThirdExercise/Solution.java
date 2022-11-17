package com.hackerRank.firstWeek.ThirdExercise;

import static com.hackerRank.firstWeek.ThirdExercise.Result.timeConversion;

public class Solution {

    public static void main(String[] args) {
        String sample = "12:01:00PM";
        String sample2 = "12:01:00AM";

        String result1 = timeConversion(sample);
        String result2 = timeConversion(sample2);

        System.out.println(result1);
        System.out.println(result2);
    }
}
