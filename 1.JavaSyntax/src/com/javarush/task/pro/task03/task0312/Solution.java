package com.javarush.task.pro.task03.task0312;

import java.util.Scanner;

/* 
Сравним строки
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Scanner sc = new Scanner(System.in);
        String sc1 = sc.nextLine();
        String sc2 = sc.nextLine();
        if(sc1.equals(sc2)) {
            System.out.println("строки одинаковые");
        } else {
        System.out.println("строки разные");
    }}
}
