package com.javarush.task.pro.task03.task0311;

import java.util.Scanner;

/* 
Высокая точность
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Scanner sc = new Scanner(System.in);
        double sc1 = sc.nextDouble();
        double sc2 = sc.nextDouble();
        double delta = 0.000001;
        if(Math.abs(sc1 - sc2) < delta) {
            System.out.println("числа равны");
        } else {
            System.out.println("числа не равны");
        }
        //напишите тут ваш код
    }
}
