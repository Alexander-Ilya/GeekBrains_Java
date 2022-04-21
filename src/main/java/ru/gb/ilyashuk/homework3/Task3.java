package ru.gb.ilyashuk.homework3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Task3 {
    //1
    public static void invertArray() {
        int[] arr = {1, 1, 1, 0, 1, 0, 1, 0, 0, 1, 0, 1};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                arr[i] = 1;
            } else {
                arr[i] = 0;
            }
        }
    }

    //2
    public static void fillArray() {
        int[] arr100 = new int[100];
        for (int i = 0; i < arr100.length; i++) {
            arr100[i] = i + 1;
        }
    }

    //3
    public static void changeArray() {
        int[] arr3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr3.length; i++) {
            if (arr3[i] < 6) {
                arr3[i] = arr3[i] * 2;
            }
        }
    }

    //4
    public static void fillDiagonal() {
        int[][] arr = new int[10][10];
        for (int i = 0; i < arr.length; i++) {
            arr[i][i] = 1;
            arr[arr.length - 1 - i][i] = 1;
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.printf("  %d", arr[i][j]);
            }
            System.out.println();

        }
    }

    //5
    public static void arrayNew(int len, int initialValue) {
        int arr[] = new int[len];
        Arrays.fill(arr,
                initialValue);
    }

    //6
    public static void minMax() {
        int[] arr = new int[50];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = new Random(100).nextInt();
        }
        Arrays.sort(arr);
        int min = arr[0];
        int max = arr[arr.length - 1];
    }

    //7
    public static boolean checkBalance() {
        int[] arr = {1, 1, 1, 2, 2, 2, 1};
        int numberOfDigitsUsedStart = 1;
        int numberOfDigitsUsedEnd = 1;
        int sumStart = arr[0];
        int sumEnd = arr[arr.length - 1];

        while (true) {
            if (sumStart > sumEnd) {
                sumEnd = sumEnd + arr[arr.length - numberOfDigitsUsedEnd - 1];
                numberOfDigitsUsedEnd++;
            } else if (sumEnd > sumStart) {
                sumStart = sumStart + arr[numberOfDigitsUsedStart];
                numberOfDigitsUsedStart++;
            } else if (sumStart == sumEnd) {
                if ((arr.length - numberOfDigitsUsedStart - numberOfDigitsUsedEnd) == 1) {
                    System.out.println(false);
                    return (false);
                } else {
                    sumStart = sumStart + arr[numberOfDigitsUsedStart];
                    sumEnd = sumEnd + arr[arr.length - numberOfDigitsUsedEnd - 1];
                    numberOfDigitsUsedStart += 1;
                    numberOfDigitsUsedEnd += 1;
                }
            }
            if (numberOfDigitsUsedStart + numberOfDigitsUsedEnd == arr.length) {
                break;
            }
        }
        System.out.println(sumStart == sumEnd);
        return (sumStart == sumEnd);

    }

    private static void shiftArray(int[] arr, int i) {
        if (i > 0) {
            for (int j = i; j > 0; j--) {
                int temp = arr[arr.length - 1];
                for (int k = arr.length - 1; k > 0; k--) {
                    arr[k] = arr[k - 1];
                }
                arr[0] = temp;
            }
        } else if (i < 0) {
            for (int j = 0 - i; j > 0; j--) {
                int temp = arr[0];
                for (int k = 0; k < arr.length - 1; k++) {
                    arr[k] = arr[k + 1];
                }
                arr[arr.length - 1] = temp;
            }
        }

        for (int j = 0; j < arr.length; j++) {
            System.out.printf("  %d", arr[j]);

        }
    }

    public static void main(String[] args) {
        fillDiagonal();
        minMax();
        checkBalance();
        shiftArray(new int[]{1, 2, 3, 4}, -1);
    }
}
