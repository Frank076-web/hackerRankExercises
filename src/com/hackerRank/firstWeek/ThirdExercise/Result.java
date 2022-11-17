package com.hackerRank.firstWeek.ThirdExercise;

public class Result {
    /*
     * Complete the 'timeConversion' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String getType(String s) {
        return s.substring(8, 10);
    }
    public static String timeConversion(String s) {
        // Write your code here
        String[] time = s.split(":");

        int hour = Integer.valueOf(time[0]);
        int minutes = Integer.valueOf(time[1]);
        int seconds = Integer.valueOf(time[2].substring(0, 2));

        if (getType(s).equalsIgnoreCase("AM") && hour == 12) {
            hour = 0;
        }

        if (getType(s).equalsIgnoreCase("PM") && hour < 12) {
            hour += 12;
        }

        return String.format("%02d:%02d:%02d", hour, minutes, seconds);

    }
}
