package ru.gb.ilyashuk.secondquarter.homework2_3;

public class Main {
//      2 Написать простой класс Телефонный Справочник, который хранит в себе список фамилий и
//        телефонных номеров. В этот телефонный справочник с помощью метода add() можно
//        добавлять записи, а с помощью метода get() искать номер телефона по фамилии. Следует
//        учесть, что под одной фамилией может быть несколько телефонов (в случае однофамильцев),
//                тогда при запросе такой фамилии должны выводиться все телефоны.

    public static void main(String[] args) {
        System.out.println("Телефонная книга. Добавляем и ищем по фамилии:");
        Phonebook phonebook = new Phonebook();


        phonebook.add("Popov", "+79999999991");
        phonebook.add("Popov", "+69999999991");
        phonebook.add("Svetlov", "+79999999992");
        phonebook.add("Kononenko", "+79999999993");
        phonebook.add("Popov", "+7911111111111");
        phonebook.add("Chernichev", "+791111222222");
        phonebook.add("Popov", "+7922222222");
        phonebook.getInfo("Popov");
        phonebook.getInfo("Chernichev");
        phonebook.getInfoTotal();
    }

}
