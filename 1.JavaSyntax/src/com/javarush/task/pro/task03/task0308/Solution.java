package com.javarush.task.pro.task03.task0308;

import java.util.Scanner;

/* 
Координатные четверти
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Scanner sc = new Scanner(System.in);
        int sc1 = sc.nextInt();
        int sc2 = sc.nextInt();
        if(sc1 > 0 && sc2 > 0) {
            System.out.println("1");
        } else if(sc1 < 0 && sc2 > 0) {
            System.out.println("2");
        } else if(sc1 < 0 && sc2 < 0) {
            System.out.println("3");
        } else if(sc1 > 0 && sc2 < 0) {
            System.out.println("4");
        }
    }
}
