package ru.gb.ilyashuk.secondquarter.homework2_3;

import java.util.*;

public class setOfWords {
    //      1 Создать массив с набором слов (10-20 слов, должны встречаться повторяющиеся). Найти и
//        вывести список уникальных слов, из которых состоит массив (дубликаты не считаем).
//        Посчитать, сколько раз встречается каждое слово.
    public static void main(String[] args) {
        String text = "один, один, два, три, два, три, четыре, пять, четыре, пять, четыре, пять, шесть, семь, восемь, девять, десять, девять, десять, one, five, windows, один, five";
        String[] words = text.toLowerCase(Locale.ROOT).split("[\\p{Space}\\p{Punct}]+");

        Map<String, Integer> wordsUniques = new LinkedHashMap<>();
        for (String word : words) {
            wordsUniques.put(word, 0);
        }


        for (String s : words) {
          //  wordsUniques.put(s, wordsUniques.get(s) + 1);
            wordsUniques.merge(s, 1, (a, b) -> a + b);

        }


//        for (
//                Map.Entry<String, Integer> entry : wordsUniques.entrySet()) {
//            System.out.printf("Слово \"%s\"  содержится в строке %d раз.\n", entry.getKey(), entry.getValue());
//        }
        wordsUniques.forEach((k, v) -> System.out.printf("Слово \"%s\"  содержится в строке %d раз.\n", k, v));
    }
}




