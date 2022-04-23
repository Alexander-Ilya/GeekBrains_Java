package ru.gb.ilyashuk.homework4;

import javax.xml.stream.events.Characters;
import java.util.Arrays;

import static ru.gb.ilyashuk.homework4.game_XO.size;

public class sd {
    public static void main(String[] args) {
        char[] arrayDot = new char[size - 1];
        char[] array = new char[size];

        Arrays.fill(arrayDot,'X');
        Arrays.fill(array,'X');
        String arrayDotString = new String(arrayDot);
        String arrayString =new String(array);

        System.out.println(arrayString.contains(arrayDotString));
    }
}
