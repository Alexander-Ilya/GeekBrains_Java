package ru.gb.ilyashuk.secondquarter.homework2_5.lesson;



public class App02 {
    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();
        MyThreadCounter t1 = new MyThreadCounter(counter);
        MyThreadCounter t2 = new MyThreadCounter(counter);
        t1.start();
        t2.start();

        t1.join();
        t2.join();
        System.out.println("counter.getCount() "+counter.getCount());
    }
}
