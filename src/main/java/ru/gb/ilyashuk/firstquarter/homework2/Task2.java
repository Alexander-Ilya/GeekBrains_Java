package ru.gb.ilyashuk.firstquarter.homework2;

public class Task2 {
    //1
    public static boolean sumWithIn(int a, int b) {
        return (a + b >= 10 && a + b <= 20);
    }

    //2
    public static void positiveNegative(int a) {
        System.out.println(a >= 0 ? "Positive" : "Negative");
    }

    //3
    public static boolean positiveOrNegative(int a) {
        return (a < 0);
    }

    //4
    public static void printingMultipleTimes(String word, int times) {
        for (int i = 0; i < times; i++) {
            System.out.println(word);
        }
    }

    //5*
    public static boolean isLeapYear(int year) {
        return ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0));
    }

    public static void main(String[] args) {
        System.out.println(sumWithIn(10, 1));
        positiveNegative(-5);
        System.out.println(positiveOrNegative(3));
        printingMultipleTimes("Hello Task 2", 10);
        System.out.println(isLeapYear(200));
    }
}
