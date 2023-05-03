package com.javarush.task.pro.task05.task0508;


import java.util.Scanner;

/*
Удаляем одинаковые строки
*/

public class Solution {
    public static String[] strings;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        strings = new String[6];
        for (int i = 0; i < strings.length; i++) {
            strings[i] = sc.nextLine();
        }
        for (int i = 0; i < strings.length - 1; i++) {
            String string = strings[i];
            for (int j = i + 1; j < strings.length; j++) {
                if (string == null) {
                    break;
                }
                if (string.equals(strings[j])) {
                    strings[j] = null;
                    strings[i] = null;
                }
            }
        }
        for (int j = 0; j < strings.length; j++) {
            System.out.print(strings[j] + ", ");
        }
    }
}