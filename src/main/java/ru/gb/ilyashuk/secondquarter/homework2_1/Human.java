package ru.gb.ilyashuk.secondquarter.homework2_1;

public class Human implements Participant {

    private int maxRun;
    private int maxJump;
    boolean participant = true;
    private static int idCounter = 1;
    private int id = idCounter;
    private String runTrue = "Человек " + id + " успешно пробежал";
    private String runFalse = "Человек " + id + " не смог пробежать и его соревнования закончились";
    private String jumpTrue = "Человек " + id + " успешно прыгнул";
    private String jumpFalse = "Человек " + id + " не смог прыгнуть и его соревнования закончились";

    public Human(int maxRun, int maxJump) {
        if (maxRun > 0) {
            this.maxRun = maxRun;
        }
        if (maxJump > 0) {
            this.maxJump = maxJump;
        }
        idCounter++;
    }

    @Override
    public boolean run(int length) {
        if (participant()){
            System.out.println((length <= maxRun) ? runTrue : runFalse);
        participant = (length <= maxRun);}
        return participant;
    }

    @Override
    public boolean jump(int height) {
        if (participant()){
            System.out.println((height <= maxJump) ? jumpTrue : jumpFalse);
        participant = (height <= maxJump);}
        return participant;

    }

    @Override
    public boolean participant() {
        return participant;
    }


    @Override
    public String toString() {
        return "Human{" +
                "maxRun=" + maxRun +
                ", maxJump=" + maxJump +
                ", id=" + id +
                '}';
    }

}


