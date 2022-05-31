package ru.gb.ilyashuk.secondquarter.homework2_2;

public class MyArrayDataException extends Exception {
    public int i;
    public int j;
    public String[][] s;

    public MyArrayDataException(int i, int j, String[][] s) {
        this.i = i;
        this.j = j;
        this.s = s;
    }


}





