package ru.gb.ilyashuk.secondquarter.homework2_5.lesson;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.out.println(Thread.currentThread().getName());
        Thread[] t = new Thread[2];
        for (int i = 0; i < t.length; i++) {
            t[i] = new MyThread();
        }
        for (Thread thread : t) {
            thread.start();
            thread.sleep(100);
            thread.interrupt();
            thread.setPriority(10);
            thread.setDaemon(true);
            thread.isAlive(); // выполняется поток или нет
            thread.join();
            thread.getState();

            System.out.println("Runtime.getRuntime().availableProcessors() = " + Runtime.getRuntime().availableProcessors());
//        final Thread r = new Thread(new R());
//        r.start();
//        final Thread rAnonimus = new Thread(() -> {
//            final Thread thread = Thread.currentThread();
//            thread.setName("MyRunnableThread");
//            System.out.println("Привет из потока " + Thread.currentThread().getName());
//            System.out.println("R(Anonimus).getStackTrace= " + Arrays.toString(Thread.currentThread().getStackTrace()));
//        });
//        rAnonimus.start();
//
//        T tt = new T();
//        tt.start();
//
//        printThreadInfo();
//
//
//    }
//
//    private static void printThreadInfo() {
//        Thread currentThread = Thread.currentThread();
//        System.out.println("Привет из потока " + Thread.currentThread().getName());
//        System.out.println("M.getStackTrace= " + Arrays.toString(Thread.currentThread().getStackTrace()));
//
//    }
//}
//
//class T extends Thread {
//    @Override
//    public void run() {
//        System.out.println("Привет из потока " + Thread.currentThread().getName());
//        System.out.println("T.getStackTrace= " + Arrays.toString(Thread.currentThread().getStackTrace()));
//
//    }
//}
//
//class R implements Runnable {
//    @Override
//    public void run() {
//        System.out.println("Привет из потока " + Thread.currentThread().getName());
//        System.out.println("R.getStackTrace= " + Arrays.toString(Thread.currentThread().getStackTrace()));
//
//    }
//}
        }
    }
}

class MyThread extends Thread {
    @Override
    public void run() {
        while (!isInterrupted()) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
                isInterrupted();
            }
            System.out.println("Привет из потока -" + Thread.currentThread().getName());

        }
    }

}
