package com.javarush.task.pro.task03.task0301;

import java.util.Scanner;

/* 
Тепло или холодно
*/

public class Solution {
    public static void main(String[] args) {
        String cold = "на улице холодно";
        String warm = "на улице тепло";
        //напишите тут ваш код
        Scanner sc = new Scanner(System.in);
        int sc1 =  sc.nextInt();
        if(sc1 >= 0) {
            System.out.println(warm);
        } else {
            System.out.println(cold);
        }
    }
}
