package ru.gb.ilyashuk.firstquarter.homework7;

public class Task7 {
    public static void main(String[] args) {
        Cat[] catArray = new Cat[(int) (1 + Math.random() * 9)];
        for (int i = 0; i < catArray.length; i++) {
            catArray[i] = new Cat("cat " + (i + 1), (int) (1 + Math.random() * 29));
        }

        Plate plate = new Plate(50);
        plate.addFood(50);
        plate.info();
        for (Cat cat : catArray) {

            cat.info();
            cat.eat(plate);
            cat.info();
            plate.info();
        }


    }
}
