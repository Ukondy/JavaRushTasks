package com.javarush.task.pro.task17.task1708;

/* 
Минимальное и максимальное
*/

public class MinMaxUtil {
    public static int min(int num, int num2) {
        return Math.min(num, num2);
    }
    public static int min(int num, int num2, int num3) {
        return Math.min(Math.min(num, num2), num3);
    }
    public static int min(int num, int num2, int num3, int num4) {
        return Math.min(Math.min(Math.min(num, num2), num3), num4);
    }
    public static int min(int num, int num2, int num3, int num4, int num5) {
        return Math.min(Math.min(Math.min(Math.min(num, num2), num3), num4), num5);
    }
    public static int max(int num, int num2) {
        return Math.max(num, num2);
    }
    public static int max(int num, int num2, int num3) {
        return Math.max(Math.max(num, num2), num3);
    }
    public static int max(int num, int num2, int num3, int num4) {
        return Math.max(Math.max(Math.max(num, num2), num3), num4);
    }
    public static int max(int num, int num2, int num3, int num4, int num5) {
        return Math.max(Math.max(Math.max(Math.max(num, num2), num3), num4), num5);

    }
}
