package ru.gb.ilyashuk.firstquarter.homework5;

public class Homework5 {
    public static void main(String[] args) {
        Employee[] employee = new Employee[5];
        employee[0] = new Employee("Филлип", "Иванов", "Инженер","filp@gmail.com", 996894123, 100000, -12);

        employee[1] = new Employee("Александр", "Иванов", "Инженер","alex@gmail.com", 776894123, 120000, 42);
        employee[2] = new Employee("Ольга", "Сидорова", "Дизайнер","olgasid@gmail.com", 22894123, 90000, 26);
        employee[3] = new Employee("Инга", "Краснова", "Дизайнер","krasn@gmail.com", 22839123, 90000, 41);
        employee[4] = new Employee("Олег", "Стаценко", "Водитель","oleg@gmail.com", 33839123, 80000, 46);
        System.out.println();
        for (Employee i: employee
             ) {if (i.getAge() > 40){
            System.out.println(i);
        }

        }
    }
}
