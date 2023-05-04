package com.javarush.task.pro.task13.task1319;

/* 
Месяцы в сезоне
*/

public enum Month {
    JANUARY,
    FEBRUARY,
    MARCH,
    APRIL,
    MAY,
    JUNE,
    JULY,
    AUGUST,
    SEPTEMBER,
    OCTOBER,
    NOVEMBER,
    DECEMBER;


    public static Month[] getWinterMonths() {
        Month[] winter = {DECEMBER, JANUARY, FEBRUARY};
        return winter;
    }
    public static Month[] getSpringMonths() {
        Month[] spring = {MARCH, APRIL, MAY};
        return spring;
    }
    public static Month[] getSummerMonths() {
        Month[] summer = {JUNE, JULY, AUGUST};
        return summer;
    }
    public static Month[] getAutumnMonths() {
        Month[] autumn = {SEPTEMBER, OCTOBER, NOVEMBER};
        return autumn;
    }
}
