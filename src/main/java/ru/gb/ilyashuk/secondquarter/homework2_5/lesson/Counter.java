package ru.gb.ilyashuk.secondquarter.homework2_5.lesson;

public class Counter {
    private int count;
     void increment() {
         synchronized (this) {
             count++;
         }
    }

    public int getCount() {
        return count;
    }
}

class MyThreadCounter extends Thread {
    private final Counter counter;

    MyThreadCounter(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        for (int i = 0; i < 50000; i++) {
            counter.increment();
        }
    }
}
