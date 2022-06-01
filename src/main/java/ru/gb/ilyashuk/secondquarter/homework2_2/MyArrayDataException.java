package ru.gb.ilyashuk.secondquarter.homework2_2;

public class MyArrayDataException extends Exception {
    private int i;
    private int j;
    private String[][] s;

    public int getI() {
        return i;
    }

    public int getJ() {
        return j;
    }

    public String[][] getS() {
        return s;
    }

    public MyArrayDataException(int i, int j, String[][] s) {
        this.i = i;
        this.j = j;
        this.s = s;
    }


}





