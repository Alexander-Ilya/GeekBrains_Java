package ru.gb.ilyashuk.secondquarter.homework2_5.lesson;

public class App03 {
     int i;

    void m() {
        i++;
        System.out.println(i);
    }
    public static void main(String[] args) {
        final App03 app03= new App03();
        new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                app03.m();
            }
        }).start();
        new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                app03.m();
            }
        }).start();
    }
}
