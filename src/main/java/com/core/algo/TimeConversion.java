package com.core.algo;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class TimeConversion {
    public static void main(String[] args) throws java.lang.Exception {
        String ss="03:30:40 PM";
        String s="07:05:45PM";
        String output = timeConversion(s);
        System.out.println( output);
    }

    private static String timeConversion(String s) {
        LocalTime lt = LocalTime.parse(s.trim(),  DateTimeFormatter.ofPattern("hh:mm:ssa"));
        DateTimeFormatter formatterOutput = DateTimeFormatter.ofPattern("HH:mm:ss");
        return lt.format(formatterOutput);
    }

}
