package com.ua.robotdreams.homework3;

public class task3 {
    public static void main(String[] args) {
        String str = "Hakuna Matata";

        System.out.println(str.toLowerCase());
        System.out.println(str.toUpperCase());

        System.out.println(str.charAt(0));

        int length = str.length();
        int lastLetter = length - 1;

        System.out.println(str.charAt(lastLetter));
    }
}
