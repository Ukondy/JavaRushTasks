package com.javarush.task.pro.task04.task0414;

import java.util.Scanner;

/* 
Хорошего не бывает много
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Scanner sc = new Scanner(System.in);
        String sc1 = sc.nextLine();
        int sc2 = sc.nextInt();
        if (sc2 == 5) {
            System.out.println(sc1);
        } else {
            do {
                System.out.println(sc1);
                sc2--;
            } while (sc2 < 5 && sc2 > 0);
        }
    }
}