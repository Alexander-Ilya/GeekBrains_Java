package ru.gb.ilyashuk.secondquarter.homework1;

public class Wall extends Let{
    private int height;

    public Wall(int height) {
        if (height > 0) {
            this.height = height;
        }
    }

    @Override
    public int getHeight() {
        return height;
    }

    @Override
    public String toString() {
        return "Wall{" +
                "height=" + height +
                '}';
    }
}
