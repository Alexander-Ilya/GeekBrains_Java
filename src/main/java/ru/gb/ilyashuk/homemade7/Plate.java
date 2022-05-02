package ru.gb.ilyashuk.homemade7;

public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public boolean decreaseFood(int n) {
        if (food - n > 0) {
            food -= n;
            System.out.println("Котик поел");
            return true;
        } else if (food == 0) {
            System.out.println("Котик не может покушать, в тарелке отсутствует еда");
        } else {
            System.out.println("Котик не может покушать, в тарелке мало еды");
        }
        return false;
    }


    public void addFood(int n) {
        food += n;
    }


    public void info() {
        System.out.println("В тарелке " + food + " кусочков еды");
    }

}
