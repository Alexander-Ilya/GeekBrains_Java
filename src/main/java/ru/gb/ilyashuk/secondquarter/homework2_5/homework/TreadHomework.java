package ru.gb.ilyashuk.secondquarter.homework2_5.homework;

public class TreadHomework {
    public static void main(String[] args) throws InterruptedException {

        firstMethod();
        secondMethod();
    }

    public static void firstMethod() {
        int size = 10_000_000;
        float[] arr = new float[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 1.0f;
        }
        long startTime = System.currentTimeMillis();
        calculation(arr);
        System.out.println("One thread time: " + (System.currentTimeMillis() -
                startTime) + " ms.");
    }

    public static void secondMethod() throws InterruptedException {
        int size = 10_000_000;
        float[] arr = new float[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 1.0f;
        }
        long startTime = System.currentTimeMillis();
        // —оздаем два массива дл€ левой и правой части исходного
        float[] arrLeft = new float[size / 2];
        float[] arrRight = new float[size - arrLeft.length];
        //  опируем в них значени€ из большого массива
        System.arraycopy(arr, 0, arrLeft, 0, arrLeft.length);
        System.arraycopy(arr, arrLeft.length, arrRight, 0, arrRight.length);
        // «апускает два потока и параллельно просчитываем каждый малый массив
        Thread threadOne = new Thread(() -> {
            calculation(arrLeft);
            System.out.println("arrLeft thread time: " + (System.currentTimeMillis() -
                    startTime) + " ms.");
        });
        threadOne.start();

        Thread threadTwo = new Thread(() -> {
            calculation(arrRight);
            System.out.println("arrRight thread time: " + (System.currentTimeMillis() -
                    startTime) + " ms.");
        });
        threadTwo.start();

        threadOne.join();
        threadTwo.join();


// —клеиваем малые массивы обратно в один большой
        System.arraycopy(arrLeft, 0, arr, 0, arrLeft.length);
        System.arraycopy(arrRight, 0, arr, arrLeft.length, arrRight.length);


        System.out.println("Two thread time: " + (System.currentTimeMillis() -
                startTime) + " ms.");

    }

    private static void calculation(float[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (float) (arr[i] * Math.sin(0.2f + i * 0.2) * Math.cos(0.2f + i * 0.2 / 5) * Math.cos(0.4f + i * 0.5));
        }
    }


}