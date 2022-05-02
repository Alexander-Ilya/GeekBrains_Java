package ru.gb.ilyashuk.homemade7;

public class Cat {
    private String name;
    private int appetite;
    private boolean isSatiety = false;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }

    public void info() {
        System.out.println(name + " " +(isSatiety ? "не голоден": "голоден и хочет съесть " + appetite + " кусочков еды."));
    }

    public void eat(Plate p) {
        if (!isSatiety) {
            isSatiety = p.decreaseFood(appetite);
        }
    }
}

