package ru.gb.ilyashuk.homework6;

public class Task6 {

    public static void main(String[] args) {
        Dog dogBobik = new Dog("Бобик");
        Dog dogKabzdoh = new Dog("Кабздох");
        Cat catVaska = new Cat("Васька");
        Cat catBarsik = new Cat("Барсик");
        dogBobik.run((int) (1.0 + Math.random() * (double) dogBobik.maxRun * 2.0));
        dogBobik.swim((int) (1.0 + Math.random() * (double) dogBobik.maxSwim * 2.0));
        catVaska.run((int) (1.0 + Math.random() * (double) catVaska.maxRun * 2.0));
        catVaska.swim(1);
        dogKabzdoh.run((int) (1.0 + Math.random() * (double) dogKabzdoh.maxRun * 2.0));
        dogKabzdoh.swim((int) (1.0 + Math.random() * (double) dogKabzdoh.maxSwim * 2.0));
        catBarsik.run((int) (1.0 + Math.random() * (double) catBarsik.maxRun * 2.0));
        catBarsik.swim(0);
        System.out.println("Количество животных: " + Animal.countAnimal);
        System.out.println("Количество собак: " + Dog.countDog);
        System.out.println("Количество котов: " + Cat.countCat);
        System.out.println("Количество  преодолённых препятствий собаками: " + Dog.countDogIsFinish);
        System.out.println("Количество  преодолённых препятствий котами: " + Cat.countCatIsFinish);
    }
}

