package ru.gb.ilyashuk.secondquarter.homework1;

public class Treadmill implements Let {
    private int length;

    public Treadmill(int length) {
        if (length > 0) {
            this.length = length;
        }
    }

    @Override
    public boolean isWin(Participant p) {
        System.out.println("run");
        return p.run(this.length);
    }

    @Override
    public String toString() {
        return "Treadmill{" +
                "length=" + length +
                '}';
    }


}
