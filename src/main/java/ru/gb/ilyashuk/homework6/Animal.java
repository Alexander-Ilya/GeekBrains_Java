package ru.gb.ilyashuk.homework6;

public abstract class Animal {
    static int countAnimal;
    private String name;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Animal(String name) {
        this.name = name;
        ++countAnimal;
    }

    public abstract void run(int length);

    public abstract void swim(int length);
}
