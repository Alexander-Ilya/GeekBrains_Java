package ru.gb.ilyashuk.homework6;

import java.io.PrintStream;

public class Dog extends Animal
{

    static int countDog;
    static int countDogIsFinish;
    int maxRun = 500;
    int maxSwim = 10;

    public Dog(String name) {
        super(name);
        ++countDog;
    }

    public void run(int length) {
        PrintStream var10000;
        String var10001;
        if (length <= this.maxRun) {
            var10000 = System.out;
            var10001 = this.getName();
            var10000.println("Собака " + var10001 + " пробежал " + length + " метров.");
            ++countDogIsFinish;
        } else {
            var10000 = System.out;
            var10001 = this.getName();
            var10000.println("Собака " + var10001 + " хотел пробежать " + length + " но не добежал " + (length - this.maxRun) + " метров.");
        }

    }

    public void swim(int length) {
        PrintStream var10000;
        String var10001;
        if (length <= this.maxSwim) {
            var10000 = System.out;
            var10001 = this.getName();
            var10000.println("Собака " + var10001 + " проплыл " + length + " метров.");
            ++countDogIsFinish;
        } else {
            var10000 = System.out;
            var10001 = this.getName();
            var10000.println("Собака " + var10001 + " не может проплыть " + length + " метров. Он решил ещё пожить и отказался плыть.");
        }

    }
}
