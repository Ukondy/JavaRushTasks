package com.javarush.task.pro.task04.task0404;

/* 
Заполненный прямоугольник
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        int i = 0;
        int j = 0;
        while(i < 5){
            i++;
            System.out.print("Q");
            while(j < 9) {
                j++;
                System.out.print("Q");
            }
            j = 0;
            System.out.println();
        }
    }
}