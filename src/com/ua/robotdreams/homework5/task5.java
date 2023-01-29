package com.ua.robotdreams.homework5;

public class task5 {

    public static void main(String[] args) {
        for (int i = 1; i < 11; i++) {
            System.out.print(i + " ");
        }

        System.out.println();

        int q = 100;
        System.out.println("Even up to " + q + " is: ");

        for (int x = 1; x <= q; x++) {
            if (x % 2 == 0) {
                System.out.print(x + " ");
            }
        }

        System.out.println();

        int a, fact = 1;
        int b = 7;
        for (a = 1; a <= b; a++){
            fact = fact * a;
        }
        System.out.println("Factorial of " + b + " is: " + fact);


        int n = 100, firstValue = 0, secondValue = 1;
        System.out.println("Fibonacci up to " + n + ": ");

        while (firstValue <= n) {
            System.out.print(firstValue + " ");

            int nextValue = firstValue + secondValue;
            firstValue = secondValue;
            secondValue = nextValue;
        }
    }
}
