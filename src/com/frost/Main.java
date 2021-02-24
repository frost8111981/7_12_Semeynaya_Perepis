package com.frost;

public class Main {

    public static void main(String[] args) {

        Human grandMa1 = new Human("Ольга Петровна", true, 65);
        Human grandFa1 = new Human("Олег Николаевич", false, 69);
        Human grandMa2 = new Human("Зинаида Оскольдовна", true, 67);
        Human grandFa2 = new Human("Фридрих Зямович ", false, 71);
        Human mother = new Human("Светлана", true, 42, grandFa1, grandMa1);
        Human father = new Human("Дмитрий", false, 46, grandFa2, grandMa2);
        Human child1 = new Human("Ктаюша", true, 6, father , mother);
        Human child2 = new Human("Сережа", false, 4, father , mother);
        Human child3 = new Human("Егорка", false, 7, father , mother);

        System.out.println(grandMa1);
        System.out.println(grandFa1);
        System.out.println(grandMa2);
        System.out.println(grandFa2);
        System.out.println(mother);
        System.out.println(father);
        System.out.println(child1);
        System.out.println(child2);
        System.out.println(child3);


    }
}
