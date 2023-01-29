package com.ua.robotdreams.homework4;

public class Task4 {

    public static void main(String[] args) {
        int num = 12;

        if (num % 2 == 0) {
            System.out.println(num + " is even");
        }

        int a = 70;
        int b = 44;
        boolean theGratestValue = a > b;
        boolean theLowestValue = b < a;

        if (theGratestValue){
            System.out.println(a + " is the gratest value");
        }
        if (theLowestValue){
            System.out.println(b + " is the lowest value");
        }

    }
}
