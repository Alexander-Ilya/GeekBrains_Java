package ru.gb.ilyashuk.homework4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class game_XO {


    public static final char DOT_EMPTY = '•';
    public static final char DOT_X = 'X';
    public static final char DOT_O = 'O';
    public static int size = 3;
    public static int dots_to_win = 3;
    public static char[][] map;
    public static Scanner sc = new Scanner(System.in);
    public static Random rand = new Random();

    public static void main(String[] args) {
        inputData();
        initMap();
        printMap();

        while (true) {
            humanTurn();
            printMap();
            if (checkWin(DOT_X)) {
                System.out.println("Победил человек");
                break;
            }
            if (isMapFull()) {
                System.out.println("Ничья");
                break;
            }
            aiTurn();
            printMap();
            if (checkWin(DOT_O)) {
                System.out.println("Победил Искусственный Интеллект");
                break;
            }
            if (isMapFull()) {
                System.out.println("Ничья");
                break;
            }
        }
        System.out.println("Игра закончена");
    }

    private static void inputData() {

        do {
            System.out.println("Введите размер игрового поля");
            size = sc.nextInt();
            System.out.println("Введите размер последовательности ");
            dots_to_win = sc.nextInt();
        } while ((size < 2) || (dots_to_win < 2) || (dots_to_win > size));

    }

    public static boolean checkWin(char symb) {
        char[] arrayDot = new char[dots_to_win];
        char[] tempVertical = new char[size];
        char[] tempDiagonalUpDown = new char[size];
        char[] tempDiagonalDownUp = new char[size];
        Arrays.fill(arrayDot, symb);
        for (int i = 0; i < size; i++) {
            if (checkStringInString(arrayDot, map[i])) {
                return true;
            }
            tempDiagonalUpDown[i] = map[i][i];
            tempDiagonalDownUp[i] = map[size - 1 - i][i];
            for (int j = 0; j < size; j++) {
                tempVertical[j] = map[j][i];
            }
            if (checkStringInString(arrayDot, tempVertical)) {
                return true;
            }
        }
        if (checkStringInString(arrayDot, tempDiagonalUpDown) || checkStringInString(arrayDot, tempDiagonalDownUp)) {
            return true;
        }

        return false;
    }

    private static boolean checkStringInString(char[] arrayDot, char[] array) {
        String arrayDotString = new String(arrayDot);
        String charString = new String(array);
        return charString.contains(arrayDotString);
    }

    public static boolean isMapFull() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (map[i][j] == DOT_EMPTY) return false;
            }
        }
        return true;
    }

    public static void aiTurn() {
        int x, y;
        do {
            x = rand.nextInt(size);
            y = rand.nextInt(size);
        } while (!isCellValid(x, y));
        System.out.println("Компьютер походил в точку " + (x + 1) + " " + (y +
                1));
        map[y][x] = DOT_O;
    }

    public static void humanTurn() {
        int x, y;
        do {
            System.out.println("Введите координаты в формате X Y");
            x = sc.nextInt() - 1;
            y = sc.nextInt() - 1;
        } while (!isCellValid(x, y));
        map[y][x] = DOT_X;
    }

    public static boolean isCellValid(int x, int y) {
        if (x < 0 || x >= size || y < 0 || y >= size) return false;
        if (map[y][x] == DOT_EMPTY) return true;
        return false;
    }

    public static void initMap() {
        map = new char[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                map[i][j] = DOT_EMPTY;
            }
        }
    }

    public static void printMap() {
        for (int i = 0; i <= size; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 0; i < size; i++) {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < size; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}



