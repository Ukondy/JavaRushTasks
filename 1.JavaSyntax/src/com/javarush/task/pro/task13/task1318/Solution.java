package com.javarush.task.pro.task13.task1318;

/* 
Следующий месяц, пожалуйста
*/

public class Solution {

    public static void main(String[] args) {
        System.out.println(getNextMonth(Month.JANUARY));
        System.out.println(getNextMonth(Month.DECEMBER));
    }

    public static Month getNextMonth(Month month) {
        Month[] array = Month.values();
        Month month1 = null;
        int i = month.ordinal();
        if(i != Month.values().length - 1) {
            month1 = array[month.ordinal() + 1];
        } else {
            month1 = array[0];
        }
        return month1;
    }
}
