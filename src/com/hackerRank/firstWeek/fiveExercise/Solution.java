package com.hackerRank.firstWeek.fiveExercise;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {

    private static final String SPLIT = "S";
    private static final String COMBINE = "C";
    private static final String METHOD = "M";
    private static final String CLASS = "C";
    private static final String VARIABLE = "V";

    private static String splitString(String value) {
        Pattern pattern = Pattern.compile("[A-Z]+");
        Matcher matcher = pattern.matcher(value);

        String match = "";
        String result = "";
        int lastPosition = 0;
        int actualPosition = 0;

        while (matcher.find()) {
            match += matcher.group() + ";";
        }
        String[] matches = match.split(";");

        for (int i = 1; i <= matches.length; i++) {
            //for unique camel letter
            if (matches.length == 1) {
                int position = value.indexOf(matches[0]);
                result = value.substring(0, position) + " " + value.substring(position);
                break;
            }
            //if i reach the length, actual position must be the number of position of the value
            if (i < matches.length) {
                actualPosition = value.indexOf(matches[i]);
            }
            //if is no more letters, then we have to concat the result with the last substring with the last position as the begin of cut
            if (actualPosition == lastPosition) {
                result += value.substring(lastPosition);
                break;
            }
            result += value.substring(lastPosition, actualPosition) + " ";
            lastPosition = actualPosition;
        }

        return result;
    }

    private static void split(String method, String value) {

        if (method.equals(METHOD)) {
            String result = splitString(value);
            System.out.println(result.replaceAll("\\(\\)", "")
                                     .toLowerCase());
        }

        if (method.equals(CLASS) || method.equals(VARIABLE)) {
            String result = splitString(value);
            System.out.println(result.toLowerCase());
        }

    }

    private static void combine(String method, String value) {
        Pattern pattern = Pattern.compile("\\s+");
        Matcher matcher = pattern.matcher(value);

        if (method.equals(VARIABLE)) {
            String[] words = value.split(" ");
            String result = words[0];

            for (int i = 1; i < words.length; i++){
                String camelCaseWord = Character.toUpperCase(words[i].charAt(0)) + words[i].substring(1);
                result += camelCaseWord;
            }

            System.out.println(result);
        }

        if (method.equals(CLASS)) {
            String[] words = value.split(" ");
            String result = "";

            for (int i = 0; i < words.length; i++){
                String camelCaseWord = Character.toUpperCase(words[i].charAt(0)) + words[i].substring(1);
                result += camelCaseWord;
            }

            System.out.println(result);
        }

        if (method.equals(METHOD)) {
            String[] words = value.split(" ");
            String result = words[0];

            for (int i = 1; i < words.length; i++){
                String camelCaseWord = Character.toUpperCase(words[i].charAt(0)) + words[i].substring(1);
                result += camelCaseWord;
            }
            result += "()";

            System.out.println(result);
        }

    }

    private static void operatedString(String s) {
        String[] task = s.split(";");
        String operator = task[0];
        String method = task[1];
        String value = task[2];

        if (operator.equals(SPLIT)) split(method, value);
        if (operator.equals(COMBINE)) combine(method, value);

    }

    public static void main(String[] args) {
        String example = "S;M;plasticCup()";
        String example2 = "C;V;mobile phone";
        String example3 = "C;C;coffee machine";
        String example4 = "S;C;LargeSoftwareBook";
        String example5 = "C;M;white sheet of paper";
        String example6 = "S;V;pictureFrame";

        /*
        Scanner scanner = new Scanner(System.in);

        String value = scanner.nextLine();

        operatedString(value);
        */

        operatedString(example);
        operatedString(example2);
        operatedString(example3);
        operatedString(example4);
        operatedString(example5);
        operatedString(example6);

    }

}
