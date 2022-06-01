package ru.gb.ilyashuk.secondquarter.homework2_3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Phonebook {
    Map<String, ArrayList<String>> phonebook = new HashMap<>();
    ArrayList<String> list = new ArrayList<>();


    void add(String name, String phone) {


        if (phonebook.get(name) == null) {
            list = new ArrayList<>();
            phonebook.put(name, list);
        } else {
            list = phonebook.get(name);
        }
        list.add(phone);
    }

    void getInfo(String name) {
        if (phonebook != null) {
            list = phonebook.get(name);
            System.out.print("У " + name + " номер телефона ");
            for (String list :
                    list) {
                System.out.print(list + " ");
                ;
            }
            System.out.println();
        }
    }

    void getInfoTotal() {
        phonebook.forEach((k, v) -> getInfo(k));
    }


    @Override
    public String toString() {
        return "Phonebook{" +
                "setPhoneNumber=" + list +
                ", phonebook=" + phonebook +
                '}';


    }
}