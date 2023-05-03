package com.javarush.task.pro.task04.task0405;

/* 
Незаполненный прямоугольник
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        int i = 0;
        int j = 0;
        int k = 0;
        while(i < 10) {
            while(j < 19) {
                if(i == 0 || i == 9) {
                    System.out.print("Б");
                }
                j++;
            }
            if(i == 0 || i == 9) {
                System.out.println("Б");
            } else {
                System.out.print("Б");
                while(k < 18) {
                    k++;
                    System.out.print(" ");
                }
                System.out.println("Б");
            }
            i++;
            j = 0;
            k = 0;
        }
    }
}