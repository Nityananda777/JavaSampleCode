package com.atomic;

import java.text.ParseException;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.TreeMap;
import java.util.stream.Collectors;

/**
 * Created by E Ananthaneshan on 12/9/18. temp
 */
public class Solution2 {


    private static final String WINTER = "WINTER";
    private static final String AUTUMN = "AUTUMN";
    private static final String SUMMER = "SUMMER";
    private static final String SPRING = "SPRING";
    private static final String COLON_SEPARATOR = ": ";

    public static void main(String[] args) throws ParseException {

        int[] arg2 = {-3, -14, -5, 7, 8, 42, 8, 3};
        int[] arg1 = {2, -3, 3, 1, 10, 8, 2, 5, 13, -5, 3, -18};

        System.out.println("+++++++++++ method 1 +++++++++++++");
        methodOne(arg2, arg1);

    }

    private static void methodOne(int[] arg2, int[] arg1) throws ParseException {
        Solution2 solution = new Solution2();
        System.out.println("Answer for " + arrayToList(arg2) + " is : " + solution.solution(arg2));
        System.out.println("Answer for " + arrayToList(arg1) + " is : " + solution.solution(arg1));
    }

    private static List<Integer> arrayToList(int[] arr)  {
        return Arrays.stream(arr).boxed().collect(Collectors.toList());
    }

    private String solution(int[] arr) throws ParseException {
        List<Integer> list = arrayToList(arr);
        int numberOfDays = list.size() / 4;
        List<Integer> winter = list.subList(0, numberOfDays);
        List<Integer> spring = list.subList(numberOfDays, numberOfDays * 2);
        List<Integer> summer = list.subList(numberOfDays * 2, numberOfDays * 3);
        List<Integer> autumn = list.subList(numberOfDays * 3, numberOfDays * 4);

//        TreeMap<Integer, String> seasonAmplitude = new TreeMap<>(Collections.reverseOrder());  //seasonAmplitude.firstEntry().getValue()
        TreeMap<Integer, String> seasonAmplitude = new TreeMap<>();                            //seasonAmplitude.lastEntry().getValue();
        seasonAmplitude.put(getAmplitude(winter), WINTER);
        seasonAmplitude.put(getAmplitude(spring), SPRING);
        seasonAmplitude.put(getAmplitude(summer), SUMMER);
        seasonAmplitude.put(getAmplitude(autumn), AUTUMN);

        return seasonAmplitude.lastEntry().getValue();

    }

    private int getAmplitude(List<Integer> data) {
        return Collections.max(data) - Collections.min(data);

    }

}



