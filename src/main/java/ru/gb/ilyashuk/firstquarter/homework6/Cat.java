package ru.gb.ilyashuk.firstquarter.homework6;

import java.io.PrintStream;

public class Cat extends Animal {
   private static int countCat;

    public static int getCountCat() {
        return countCat;
    }

    public static int getCountCatIsFinish() {
        return countCatIsFinish;
    }

    private static int countCatIsFinish;
    int maxRun = 200;
    int maxSwim = 0;

    public Cat(String name) {
        super(name);
        ++countCat;
    }

    public void run(int length) {
        PrintStream var10000;
        String var10001;
        if (length <= this.maxRun) {
            var10000 = System.out;
            var10001 = this.getName();
            var10000.println("Кот " + var10001 + " пробежал " + length + " метров.");
            ++countCatIsFinish;
        } else {
            var10000 = System.out;
            var10001 = this.getName();
            var10000.println("Кот " + var10001 + " хотел пробежать " + length + " но не добежал " + (length - this.maxRun) + " метров.");
        }

    }

    public void swim(int length) {
        System.out.println("Кот " + this.getName() + " решил ещё пожить и не поплыл. Он не умеет плавать.");
    }
}
