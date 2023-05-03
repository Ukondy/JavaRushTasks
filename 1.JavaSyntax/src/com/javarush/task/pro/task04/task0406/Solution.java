package com.javarush.task.pro.task04.task0406;

import java.util.Scanner;

/* 
Показываем, что получаем
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Scanner sc = new Scanner(System.in);
    while(true) {
        String sc1 = sc.nextLine();
        if(sc1.equals("enough")) {
            break;
        }
        System.out.println(sc1);
    }
    }
}