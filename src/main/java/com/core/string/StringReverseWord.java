package com.core.string;

public class StringReverseWord {

    public static void main(String[] args) {
        String s = "hello world india";

        String[] sp = s.split("\\s");
        String rev = "";
        StringBuffer sb = new StringBuffer();
        for (String s1 : sp) {
            char arr[] = s1.toCharArray();
            for (int i = arr.length - 1; i > 0; i--) {
                sb.append(arr[i]);
            }
            sb.append(",");
        }
        System.out.println(sb.toString());
    }
}
