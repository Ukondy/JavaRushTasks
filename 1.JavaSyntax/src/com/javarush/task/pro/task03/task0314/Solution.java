package com.javarush.task.pro.task03.task0314;

import java.util.Locale;
import java.util.Scanner;

/* 
Сломанная клавиатура
*/

public class Solution {
    public static String secret = "AmIGo";

    public static void main(String[] args) {
        //напишите тут ваш код
        Scanner sc = new Scanner(System.in);
        String sc1 = sc.nextLine();
        if(secret.toLowerCase(Locale.ROOT).equals(sc1.toLowerCase())) {
            System.out.println("доступ разрешен");
        } else {
        System.out.println("доступ запрещен");
    }}
}
