package com.ua.robotdreams.homework7;

import java.util.Random;

public class task7 {

    public static void main(String[] args) {
        int length = 10;
        int[] arr = new int[length];
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(10);
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) ;
        }

        fillArrayWithRandomNumbers(arr, 10);
        getMinArrayValue(arr);
        getMaxArrayValue(arr);
        getAvgArrayValue(arr);
    }

    static void fillArrayWithRandomNumbers(int[] arr, int maxValue) {
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(maxValue - 1) + 1;
        }
    }

    static int[] getArrayWithRandomNumbers(int[] arr, int maxValue) {
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(maxValue);
        }
        return arr;
    }

    static int getMinArrayValue(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    static int getMaxArrayValue(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    static double getAvgArrayValue(int[] arr) {
        double sum = 0;
        for (int j : arr) {
            sum += j;
        }
        return sum / arr.length;
    }
}

