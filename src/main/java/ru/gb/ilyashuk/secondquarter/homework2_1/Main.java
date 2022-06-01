package ru.gb.ilyashuk.secondquarter.homework2_1;


import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Participant> team = new ArrayList<>();
        List<Let> lets = new ArrayList<>();


        for (int i = 0; i < 5; i++) {
            team.add(new Human((int) (1 + Math.random() * 500), (int) (1 + Math.random() * 3)));
            team.add(new Robot((int) (1 + Math.random() * 2000), (int) (1 + Math.random() * 10)));
            team.add(new Cat((int) (1 + Math.random() * 1000), (int) (1 + Math.random() * 8)));
            lets.add(new Treadmill((int) (1 + Math.random() * 1000)));
            lets.add(new Wall((int) (1 + Math.random() * 5)));
        }


        for (Participant participant : team) {
            System.out.println(participant);
            for (Let let : lets) {
                System.out.println(let);
                let.isWin(participant);


            }
        }


    }
}
