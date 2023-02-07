package com.ua.robotdreams.homework6;

import java.util.Scanner;

public class task6 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your number: ");
        int num = in.nextInt();

        num = numExponential(num);
        System.out.println(num);


        printSymbolNumberTimes(15);
        printSymbolNumberTimes(20, "&");
    }

    private static int numExponential(int num2) {
        return num2 * num2 * num2;
    }

    static void printSymbolNumberTimes(int number) {
        printSymbolNumberTimes(number, "*");
    }

    static void printSymbolNumberTimes(int number, String symbol) {
        for (int i = 0; i < number; i++) {
            System.out.print(symbol);
        }
    }
}
