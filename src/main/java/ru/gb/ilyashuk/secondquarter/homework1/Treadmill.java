package ru.gb.ilyashuk.secondquarter.homework1;

public class Treadmill extends Let {
    private int length;

    public Treadmill(int length) {
        if (length > 0) {
            this.length = length;
        }
    }

    @Override
    public int getLength() {
        return length;
    }

    @Override
    public String toString() {
        return "Treadmill{" +
                "length=" + length +
                '}';
    }
}
