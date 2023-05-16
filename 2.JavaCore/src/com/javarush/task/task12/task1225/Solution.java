package com.javarush.task.task12.task1225;

/* 
Посетители
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(getObjectType(new Cat()));
        System.out.println(getObjectType(new Tiger()));
        System.out.println(getObjectType(new Lion()));
        System.out.println(getObjectType(new Bull()));
        System.out.println(getObjectType(new Cow()));
        System.out.println(getObjectType(new Animal()));
    }

    public static String getObjectType(Object o) {
        String className = o.getClass().getSimpleName();
        if(className.equals("Cat")) {
            return "Кот";
        } else if(className.equals("Tiger")) {
            return "Тигр";
        } else if(className.equals("Lion")) {
            return "Лев";
        } else if(className.equals("Bull")) {
            return "Бык";
        } else if(className.equals("Cow")) {
            return "Корова";
        }
        return "Животное";
    }

    public static class Cat extends Animal   //<--Классы наследуются!!
    {
    }

    public static class Tiger extends Cat {
    }

    public static class Lion extends Cat {
    }

    public static class Bull extends Animal {
    }

    public static class Cow extends Animal {
    }

    public static class Animal {
    }
}
