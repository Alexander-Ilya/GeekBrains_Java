package ru.gb.ilyashuk.secondquarter.homework1;

public class Cat implements Participant {

    private int maxRun;
    private int maxJump;
    private static int idCounter = 1;
    private int id = idCounter;
    private String runTrue = "Кот " + id + " успешно пробежал";
    private String runFalse = "Кот " + id + " не смог пробежать и его соревнования закончились";
    private String jumpTrue = "Кот " + id + " успешно прыгнул";
    private String jumpFalse = "Кот " + id + " не смог прыгнуть и его соревнования закончились";

    public Cat(int maxRun, int maxJump) {
        if (maxRun > 0) {
            this.maxRun = maxRun;
        }
        if (maxJump > 0) {
            this.maxJump = maxJump;
        }
        idCounter++;
    }

    @Override
    public boolean Run(Let treadmill) {
        System.out.println(treadmill.getLength() <= maxRun ? runTrue : runFalse);
        return treadmill.getLength() <= maxRun;
    }

    @Override
    public boolean Jump(Let wall) {
        System.out.println(wall.getHeight() <= maxJump ? jumpTrue : jumpFalse);
        return wall.getHeight() <= maxJump;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "maxRun=" + maxRun +
                ", maxJump=" + maxJump +
                ", id=" + id +
                '}';
    }
}
