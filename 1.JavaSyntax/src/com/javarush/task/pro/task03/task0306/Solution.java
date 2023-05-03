package com.javarush.task.pro.task03.task0306;

import java.util.Scanner;

/* 
Треугольник
*/

public class Solution {
    private static final String TRIANGLE_EXISTS = "треугольник существует";
    private static final String TRIANGLE_NOT_EXISTS = "треугольник не существует";

    public static void main(String[] args) {
        //напишите тут ваш код
        int count = 0;
        Scanner sc = new Scanner(System.in);
        int sc1 = sc.nextInt();
        int sc2 = sc.nextInt();
        int sc3 = sc.nextInt();
        if((sc1 + sc2) > sc3) {
            count++;
            if((sc1 + sc3) > sc2) {
                count++;
                if((sc2 + sc3) > sc1) {
                    count++;
                }
            }
        }
        if(count == 3) {
            System.out.println("треугольник существует");
        } else {
            System.out.println("треугольник не существует");
        }
    }
}
