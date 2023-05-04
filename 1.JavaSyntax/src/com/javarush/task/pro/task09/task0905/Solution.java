package com.javarush.task.pro.task09.task0905;

import java.util.regex.Pattern;

/* 
Восьмеричный конвертер
*/

public class Solution {


    public static void main(String[] args) {
        int octalNumber = 25;
        int decimalNumber = 21;
        System.out.println("Десятичное число " + decimalNumber + " равно восьмеричному числу " + toOctal(decimalNumber));
        System.out.println("Восьмеричное число " + octalNumber + " равно десятичному числу " + toDecimal(octalNumber));
    }

    public static int toOctal(int decimalNumber) {
        int i = 0;
        int octalNumber1 = 0;
        if (decimalNumber > 0) {
            while (decimalNumber > 0) {
                octalNumber1 = octalNumber1 + (decimalNumber % 8) * ((int)Math.pow(10, i));
                decimalNumber = decimalNumber / 8;
                i++;
            }
            return octalNumber1;
        }
        return 0;
    }

    public static int toDecimal(int octalNumber) {
        int i = 0;
        int decimalNumber1 = 0;
        if (octalNumber > 0) {
            while (octalNumber > 0) {
                decimalNumber1 = decimalNumber1 + (octalNumber % 10) * ((int)Math.pow(8, i));
                octalNumber = octalNumber / 10;
                i++;
            }
            return decimalNumber1;
        }
        return 0;
    }
}
