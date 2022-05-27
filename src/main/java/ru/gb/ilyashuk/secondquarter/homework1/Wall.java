package ru.gb.ilyashuk.secondquarter.homework1;

import javax.swing.*;

public class Wall implements Let {
    private int height;

    public Wall(int height) {
        if (height > 0) {
            this.height = height;
        }
    }

    @Override
    public boolean isWin(Participant p) {
        System.out.println("jump");
        return p.jump(height);

    }

    @Override
    public String toString() {
        return "Wall{" +
                "height=" + height +
                '}';
    }


}
