package ru.gb.ilyashuk.firstquarter.homework1;

public class HomeWorkApp {
    public static void printThreeWords(String text) {
        System.out.println(text);
    }

    public static void checkSumSign() {
        int a = 4;
        int b = 23;
        if ((a + b) >= 0) {
            {
                System.out.println("Сумма положительная");
            }
        } else {
            System.out.println("Сумма отрицательная");
        }
    }

    public static void printColor() {
        int value = 102;
        if (value <= 0) {
            System.out.println("Красный");
        } else if (value > 0 && value <= 100) {
            System.out.println("Жёлтый");
        } else System.out.println("Зеленый");
    }

    public static void compareNumbers() {
        int a = 78;
        int b = 78;
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }

    public static void main(String[] args) {
        System.out.println("Hello, GeekBrains");
        printThreeWords("Orange");
        printThreeWords("Banana");
        printThreeWords("Apple");
        checkSumSign();
        printColor();
        compareNumbers();

    }
}
