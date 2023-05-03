package com.javarush.task.pro.task03.task0307;

import java.util.Scanner;

/* 
Работать или не работать - вот в чем вопрос
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Scanner sc = new Scanner(System.in);
        int sc1 = sc.nextInt();
        if (sc1 < 20 || sc1 > 60) {
            System.out.println("можно не работать");
        }
    }
}
