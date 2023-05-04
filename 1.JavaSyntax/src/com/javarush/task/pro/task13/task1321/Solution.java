package com.javarush.task.pro.task13.task1321;

public class Solution {

    public static void main(String[] args) {
        System.out.println(getTranslationForDayOfWeek("Вторник"));
        System.out.println(getTranslationForDayOfWeek("Пятница"));
        System.out.println(getTranslationForDayOfWeek("Высплюсенье"));
    }

    public static String getTranslationForDayOfWeek(String ru) {
        String en;
        ru.toLowerCase();
        if(ru.equals("понедельник")) {
            en = "Monday";
        } else if(ru.equals("вторник")) {
            en = "Tuesday";
        } else if(ru.equals("среда")) {
            en = "Wednesday";
        } else if(ru.equals("четверг")) {
            en = "Thursday";
        } else if(ru.equals("пятница")) {
            en = "Friday";
        } else if(ru.equals("суббота")) {
            en = "Saturday";
        } else if(ru.equals("воскресенье")) {
            en = "Sunday";
        } else {
            en = "Недействительный день недели";
        }
        return en;

    }
}
